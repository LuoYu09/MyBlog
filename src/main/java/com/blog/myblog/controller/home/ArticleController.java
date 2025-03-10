package com.blog.myblog.controller.home;

import com.blog.myblog.VO.ArticleDetailVO;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import com.blog.myblog.service.CommentService;
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

    @Autowired
    private CommentService commentService;
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
        ArticleDetailVO articleDetailVO = new ArticleDetailVO();
        //获取文章信息
        articleDetailVO.setArticle(articleService.getArticleById(articleId));

        //获取文章的评论信息
        articleDetailVO.setComment(commentService.getCommentByArticleId(articleId));
        //获取文章的标签信息

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
