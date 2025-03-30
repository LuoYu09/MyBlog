package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Comment;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.CommentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/home/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 根据文章id获取评论
     * */

    /**
     * 新增评论
     * */
    @PostMapping()
    public Result saveComment(@RequestBody Comment comment){
        log.info("保存评论,{}",comment);
        commentService.saveComment(comment);
        return Result.success();
    }


    /**
     * 显示评论
     * */
    @GetMapping("/{articleId}")
    public Result<List<Comment>> getCommentsByArticleId(@PathVariable("articleId") Integer articleId){
        log.info("显示评论,{}",articleId);
        List<Comment> commentList=commentService.getCommentsByArticleId(articleId);
        return Result.success(commentList);
    }
}

