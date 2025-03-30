package com.blog.myblog.controller.home;

import com.blog.myblog.entity.User;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    /**
     查询用户
     @Param userId 用户ID
     */
    @GetMapping("/getUser/{userId}")
    public Result<User> getUser (@PathVariable("userId") Integer userId){
        log.info("查询用户");
        User user = userService.getUserById(userId);
        return Result.success(user);
    }

    /**
     查询所有用户
     */
    @GetMapping("/getAllUser")
    public Result<List<User>> getAllUser(){
        log.info("查询所有用户");
        List<User> userList = userService.getAllUser();
        return Result.success(userList);
    }

    /**
     * 传入用户id和要添加的签名内容
     * 添加用户签名
     * */
    @PostMapping("/sign/{id}")
    public Result setSign(@PathVariable Integer id,String sign){
    log.info("添加用户签名:{}",sign);
    userService.setSign(id,sign);
    return Result.success();
    }
}
