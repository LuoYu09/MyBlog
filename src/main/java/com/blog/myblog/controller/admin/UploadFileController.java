package com.blog.myblog.controller.admin;

import com.blog.myblog.constant.MessageConstant;
import com.blog.myblog.properties.AliOssProperties;
import com.blog.myblog.result.Result;
import com.blog.myblog.util.AliOssUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传接口
 */
@RestController
@RequestMapping("/back/upload")
@Tag(name = "")
@Slf4j
public class UploadFileController {
    @Autowired
    private AliOssProperties aliOssProperties;

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping
    public Result upload(MultipartFile file){
        log.info("文件上传：{}",file);

        //获取原文件名
        String originalFilName = file.getOriginalFilename();
        //截取后缀
        String extension = originalFilName.substring(originalFilName.lastIndexOf("."));

        String uid = UUID.randomUUID().toString();
        AliOssUtil aliOssUtil = new AliOssUtil(aliOssProperties.getEndpoint(),aliOssProperties.getAccessKeyId(),aliOssProperties.getAccessKeySecret(),aliOssProperties.getBucketName());
        try {
            String url = aliOssUtil.upload(file.getBytes(),uid + extension);

            return Result.success(url);
        } catch (IOException e) {
            log.info("文件上传失败：{}",e);

            return Result.error(MessageConstant.UPLOAD_FAILED);
        }
    }
}
