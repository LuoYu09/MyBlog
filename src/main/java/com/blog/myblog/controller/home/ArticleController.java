package com.blog.myblog.controller.home;

import com.blog.myblog.VO.ArticleDetailVO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home/article")
@Slf4j
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param articleId 文章ID
     * @return View
     */
    @GetMapping(value = "/{articleId}")
    public Result<Article> article(@PathVariable("articleId") Integer articleId) {
        log.info("显示第{}篇文章",articleId);
        Article article = articleService.getArticleById(articleId);
                //获取文章信息

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
    @PostMapping("/view/{articleId}")
    public Result increaseViewCount(@PathVariable("articleId") Integer articleId) {
        log.info("第{}篇文章访问量增加",articleId);
        articleService.increaseViewCount(articleId);
        return Result.success();
    }

}
