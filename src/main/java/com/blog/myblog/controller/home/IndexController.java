package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户的controller
 *
 *
 */
@Slf4j
@RestController
@RequestMapping("/home")
public class IndexController {
    /**
     获取文章公告，友情链接
     公告，最新评论
     侧边栏显示
     标签列表显示
     */
    @GetMapping("/getPage")
    public Result getPageByIndex(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                 @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }
    /**
     根据关键词搜索文章
     */
    @GetMapping("/search")
    public Result searchArticles(@RequestParam("keyword") String keyword,
                                 @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                 @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }

    /**
     错误数据404的处理
     */
    @PostMapping("/404")
    public Result error404(@RequestParam(required = false) String message) {
        return Result.error("NOT FOUND");
    }

    /**
     错误数据403的处理
     */
    @PostMapping("/403")
    public Result Page403(@RequestParam(required = false) String message) {
        return Result.error("服务器拒绝访问");
    }
}
