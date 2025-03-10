package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Article;
import com.blog.myblog.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     首页，
     根据页数索引和数据展示量
     获取文章
     */
    @GetMapping("/getPage")
    public Result<List<Article>> getPageByIndex(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                                @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }
    /**
     根据关键词搜索文章
     */
    @GetMapping("/search")
    public Result<List<Article>> searchArticles(@RequestParam("keyword") String keyword,
                                 @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                 @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }
}
