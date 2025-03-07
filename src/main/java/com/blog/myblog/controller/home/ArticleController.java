package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Article;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@Slf4j
@Tag(name = "文章相关接口")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param articleId 文章ID
     * @return View
     */
    @Operation(summary = "文章详情页显示",description = "通过articleId获取文章信息，分类，标签等信息")
    @GetMapping(value = "/{articleId}")
    public Result article(@PathVariable("articleId") Integer articleId) {
        log.info("显示第{}篇文章",articleId);
        Article article = articleService.getArticleById(articleId);
        if (article==null){
            return Result.error("文章不存在");
        }
        return Result.success(article);
    }

    /**
     * 文章的点赞增加
     *
     * @param articleId 文章ID
     * @return 点赞量数量
     */
    @Operation(summary = "文章的点赞增加",description = "通过articleId文章的点赞增加")
    @PostMapping("/like/{articleId}")
    public Result increaseLikeCount(@PathVariable("articleId") Integer articleId) {
        log.info("第{}篇文章点赞",articleId);
        articleService.increaseLikeCount(articleId);
        return Result.success();
    }

    /**
     * 文章访问量数增加
     *
     * @param articleId 文章ID
     * @return 访问量数量
     */
    @Operation(summary = "文章访问量数增加",description = "通过articleId文章访问量数增加")
    @PostMapping("/view/{articleId}")
    public Result increaseViewCount(@PathVariable("articleId") Integer articleId) {
        log.info("第{}篇文章访问量增加",articleId);
        articleService.increaseViewCount(articleId);
        return Result.success();
    }

}
