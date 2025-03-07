package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Comment;
import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Tag(name= "评论相关接口")
public class CommentController {
    /**
     * 添加评论
     *
     * @param request
     * @param comment
     */
    @PutMapping("/comment")
    @Operation(summary = "添加评论", description = "添加评论")
    public Result insertComment(HttpServletRequest request, Comment comment, HttpSession session) {
        return Result.success();
    }
}
