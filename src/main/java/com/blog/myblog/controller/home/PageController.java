package com.blog.myblog.controller.home;


import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

@RestController
@Tag(name = "分页相关接口")
@Slf4j
public class PageController {
    /**
     * 页面详情页面
     *
     * @param key
     * @return
     */
    @Operation(summary = "查询页面详情",description = "根据页面key查询页面详情")
    @GetMapping("/page/{key}")
    public Result pageDetail(@PathVariable("key") String key) {
        return Result.success();
    }

    /**
     * 文章归档页面显示
     *
     * @return
     */
    @GetMapping(value = "/articleFile")
    @Operation(summary = "文章归档页面显示")
    public Result articleFile() {
        return Result.success();
    }

}
