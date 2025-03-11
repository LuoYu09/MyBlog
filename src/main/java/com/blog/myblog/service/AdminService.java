package com.blog.myblog.service;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.DTO.RegisterDTO;
import com.blog.myblog.DTO.UserDTO;
import com.blog.myblog.VO.LoginVO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.User;

import java.util.List;

public interface AdminService {

    /**
     * 用户登录
     * @param dto
     * @return
     */
    LoginVO login(LoginDTO dto);

    /**
     * 注册接口
     * @param dto
     */
    void register(RegisterDTO dto);

    /**
     * 获取最近五篇发布
     * @return
     */
    List<Article> listRecentArticle();

    /**
     * 查询用户信息
     * @return
     */
    User userProfileView();

    /**
     * 修改用户数据
     * @param dto
     */
    void update(UserDTO dto);
}
