package com.blog.myblog.controller.home;

import com.blog.myblog.VO.ArticleDetailVO;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import com.blog.myblog.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
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
    public Result article(@PathVariable("articleId") Integer articleId) {
        log.info("显示第{}篇文章",articleId);
        ArticleDetailVO articleDetailVO = new ArticleDetailVO();
        //获取文章信息
        articleDetailVO.setArticle(articleService.getArticleById(articleId));
        if (articleDetailVO.getArticle()==null){
            return Result.error("文章不存在");
        }
        return Result.success(articleDetailVO);
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
