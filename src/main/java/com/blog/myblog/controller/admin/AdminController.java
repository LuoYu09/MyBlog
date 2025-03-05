package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.DTO.RegisterDTO;
import com.blog.myblog.VO.LoginVO;
import com.blog.myblog.VO.UserDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Comment;
import com.blog.myblog.entity.User;
import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/admin")
@Api(tags = "后台首页接口")
@Slf4j
public class AdminController {
    /**
     * 登录接口
     * @param dto
     * @return
     */
    @PostMapping("/login")
    @ApiOperation("登录接口")
    public Result<LoginVO> login(@RequestBody LoginDTO dto){

        return Result.success();
    }

    /**
     * 注册接口
     * @param dto
     * @return
     */
    @PostMapping("/register")
    @ApiOperation("注册接口")
    public Result register(@RequestBody RegisterDTO dto){
        return Result.success();
    }

    /**
     * 退出登录
     * @return
     */
    @PostMapping("/logout")
    @ApiOperation("退出登录接口")
    public Result logout(){
        return Result.success();
    }

    /**
     * 获取最近五篇发布
     * @return
     */
    @PostMapping("/article")
    @ApiOperation("最近发布接口")
    public Result<List<Article>> listRecentArticle(){
        return Result.success();
    }

    /**
     * 获取近期评论
     * @return
     */
    @PostMapping("/comment")
    @ApiOperation("近期评论接口")
    public Result<List<Comment>> listRecentComment(){
        return Result.success();
    }

    /**
     * 基本信息页面展示
     * @return
     */
    @PostMapping("/profile")
    @ApiOperation("基本信息页面展示")
    public Result<User> userProfileView(){
        return Result.success();
    }

    /**
     * 根据ID查询用户数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询用户数据")
    public Result<User> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改用户数据
     * @param dto
     * @return
     */
    @PutMapping()
    @ApiOperation("修改用户数据")
    public Result update(@RequestBody UserDTO dto){
        return Result.success();
    }
}
