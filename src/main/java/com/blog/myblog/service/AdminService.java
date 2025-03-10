package com.blog.myblog.service;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.VO.LoginVO;

public interface AdminService {

    /**
     * 用户登录
     * @param dto
     * @return
     */
    LoginVO login(LoginDTO dto);
}
