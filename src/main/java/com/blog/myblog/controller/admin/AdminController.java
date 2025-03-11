package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.DTO.RegisterDTO;
import com.blog.myblog.VO.LoginVO;
import com.blog.myblog.DTO.UserDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.User;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台首页接口
 */
@RestController
@RequestMapping("/back/admin")
@Slf4j
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 登录接口
     * @param dto
     * @return
     */
    @PostMapping("/login")
    public Result<LoginVO> login(@RequestBody LoginDTO dto){
        log.info("用户登录：{}",dto);

        LoginVO result = adminService.login(dto);

        return Result.success(result);
    }

    /**
     * 注册接口
     * @param dto
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody RegisterDTO dto){
        log.info("注册接口:{}",dto);

        adminService.register(dto);

        return Result.success();
    }

    /**
     * 退出登录
     * @return
     */
    @PostMapping("/logout")
    public Result logout(){
        return Result.success();
    }

    /**
     * 获取最近五篇发布
     * @return
     */
    @PostMapping("/article")
    public Result<List<Article>> listRecentArticle(){
        log.info("获取最近五篇发布");

        List<Article> result = adminService.listRecentArticle();

        return Result.success(result);
    }

    /**
     * 基本信息页面展示
     * @return
     */
    @PostMapping("/profile")
    public Result<User> userProfileView(){
        log.info("查询用户信息");

        User user = adminService.userProfileView();

        return Result.success(user);
    }

    /**
     * 根据ID查询用户数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改用户数据
     * @param dto
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody UserDTO dto){
        log.info("修改用户数据:{}",dto);

        adminService.update(dto);

        return Result.success();
    }
}
