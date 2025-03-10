package com.blog.myblog.controller.admin;

import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传接口
 */
@RestController
@RequestMapping("/back/upload")
@Tag(name = "")
@Slf4j
public class UploadFileController {
    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping
    public Result upload(MultipartFile file){

        return Result.success();
    }
}
