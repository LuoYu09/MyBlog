package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Article;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import com.blog.myblog.service.CategoryService;
import com.blog.myblog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    /**
     * 首页，
     * 根据用户id
     * 和页数索引和数据展示量
     * 获取文章
     */
    @GetMapping("/getPage/{userId}")
    public Result<List<Article>> getPageByIndex(@PathVariable("userId") Integer userId,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                                @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        Integer startIndex = (pageIndex - 1) * pageSize;
        return Result.success(articleService.getArticlesByUserId(userId, startIndex, pageSize));
    }

    /**
     *
     * 根据关键词和用户id
     * 和页数索引和数据展示量
     * 获取文章
     */
    @GetMapping("/search/{userId}")
    public Result<List<Article>> searchArticles(@PathVariable("userId") Integer userId,
                                                @RequestParam(required = false, defaultValue = "") String keyword,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                                @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        Integer startIndex = (pageIndex - 1) * pageSize;
        return Result.success(articleService.searchArticles(userId, keyword, startIndex, pageSize));
    }
}