package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import com.blog.myblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/home")
public class imageController {
    /**
     * 接受传来的图片地址，将数据存在数据库中
     * @param imageUrl 图片地址
     * @param userId 用户ID
     */
    @Autowired
    private UserService userService;

    @PostMapping("/saveImage/{userId}")
    public Result saveImage(@PathVariable("userId") Integer userId,@RequestParam("imageUrl") String imageUrl){
        log.info("存入图片地址，地址为:{},用户id为:{}",imageUrl,userId);
        userService.saveImage(imageUrl,userId);
        return Result.success();
    }
}
