package com.blog.myblog.controller;

import com.blog.myblog.result.Result;
import com.blog.myblog.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RequestMapping("/home")
@RestController
public class uploadController{

    @Autowired
    private AliOSSUtils aliOSSUtils;

    /**
     * 上传图片
     * @param image
     * @return
    * */
    @PostMapping("/uploadImage")
    public Result<String> image(MultipartFile image) throws IOException {
        log.info("imageName为:{}",image.getOriginalFilename());
        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成，url为:{}",url);

        return Result.success(url);
    }
}
