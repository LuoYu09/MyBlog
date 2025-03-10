package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.VO.LoginVO;
import com.blog.myblog.constant.JwtClaimsConstant;
import com.blog.myblog.constant.MessageConstant;
import com.blog.myblog.entity.User;
import com.blog.myblog.exception.PasswordErrorException;
import com.blog.myblog.exception.UserIsLockedException;
import com.blog.myblog.exception.UserNotFoundException;
import com.blog.myblog.mapper.AdminMapper;
import com.blog.myblog.properties.JwtProperties;
import com.blog.myblog.service.AdminService;
import com.blog.myblog.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class AdminServiceImpl  implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 用户登录
     * @param dto
     * @return
     */
    @Override
    public LoginVO login(LoginDTO dto) {
        User user = adminMapper.login(dto);

        if(user == null){
            throw new UserNotFoundException(MessageConstant.USR_NOT_EXITS);
        }

        if(!user.getUserPass().equals(dto.getPassword())){
            throw new PasswordErrorException(MessageConstant.PASSWORD_WRONG);
        }

        if(user.getUserStatus() != 1){
            throw new UserIsLockedException(MessageConstant.USER_IS_LOCKED);
        }

        LoginVO loginVO = LoginVO.builder().id(user.getUserId()).userName(user.getUserName()).avatar(user.getUserAvatar()).build();

        Map<String, Object> map = new HashMap<>();
        map.put(JwtClaimsConstant.USER_ID, user.getUserId());

        loginVO.setToken(JwtUtil.createJWT(jwtProperties.getAdminSecretKey(), jwtProperties.getAdminTtl(), map));

        return loginVO;
    }
}
