package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.DTO.RegisterDTO;
import com.blog.myblog.DTO.UserDTO;
import com.blog.myblog.VO.LoginVO;
import com.blog.myblog.constant.JwtClaimsConstant;
import com.blog.myblog.constant.MessageConstant;
import com.blog.myblog.context.BaseContext;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.User;
import com.blog.myblog.exception.CharCountException;
import com.blog.myblog.exception.PasswordErrorException;
import com.blog.myblog.exception.UserIsLockedException;
import com.blog.myblog.exception.UserNotFoundException;
import com.blog.myblog.mapper.AdminMapper;
import com.blog.myblog.mapper.ArticleMapper;
import com.blog.myblog.properties.JwtProperties;
import com.blog.myblog.service.AdminService;
import com.blog.myblog.util.JwtUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class AdminServiceImpl  implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private JwtProperties jwtProperties;

    @Autowired
    private ArticleMapper articleMapper;

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

        if(!user.getUserPass().equals(dto.getPassword())) {
            throw new PasswordErrorException(MessageConstant.PASSWORD_WRONG);
        }

        LoginVO loginVO = LoginVO.builder().id(user.getId()).userName(user.getUserName()).avatar(user.getUserAvatar()).build();

        Map<String, Object> map = new HashMap<>();
        map.put(JwtClaimsConstant.USER_ID, user.getId());

        loginVO.setToken(JwtUtil.createJWT(jwtProperties.getAdminSecretKey(), jwtProperties.getAdminTtl(), map));

        user.setUserLastLoginTime(LocalDateTime.now());

        adminMapper.update(user);

        return loginVO;
    }

    /**
     * 注册接口
     * @param dto
     */
    @Override
    public void register(RegisterDTO dto) {
        if(dto.getUserName().length() > 10 || dto.getPassword().length() > 100){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        adminMapper.register(dto);
    }

    /**
     * 获取最近五篇发布
     * @return
     */
    @Override
    public List<Article> listRecentArticle() {
        return articleMapper.listRecentArticle(5);
    }

    /**
     * 查询用户信息
     * @return
     */
    @Override
    public User userProfileView() {
        return adminMapper.selectUser(BaseContext.getCurrentId());
    }

    /**
     * 修改用户数据
     * @param dto
     */
    @Override
    public void update(UserDTO dto) {
        if((dto.getUserName() != null && dto.getUserName().length() > 10) || (dto.getUserPass() != null && dto.getUserPass().length() > 100)){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        User user = new User();

        BeanUtils.copyProperties(dto,user);

        user.setId(BaseContext.getCurrentId());

        adminMapper.update(user);
    }


}
