package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户的controller
 *
 *
 */
@Slf4j
@RestController
@Tag(name= "用户相关接口")
public class IndexController {
    /**
     获取文章公告，友情链接
     公告，最新评论
     侧边栏显示
     标签列表显示
     */
    @GetMapping("/getPage")
    @Operation(summary = "获取页面详情")
    public Result getPageByIndex(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                 @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }
    /**
     根据关键词搜索文章
     */
    @GetMapping("/search")
    @Operation(summary = "根据关键词搜索文章")
    public Result searchArticles(@RequestParam("keyword") String keyword,
                                 @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                 @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }

    /**
     错误数据404的处理
     */
    @PostMapping("/404")
    @Operation(summary = "错误404的处理")
    public Result error404(@RequestParam(required = false) String message) {
        return Result.error("NOT FOUND");
    }

    /**
     错误数据403的处理
     */
    @PostMapping("/403")
    @Operation(summary = "错误403的处理")
    public Result Page403(@RequestParam(required = false) String message) {
        return Result.error("服务器拒绝访问");
    }
}
