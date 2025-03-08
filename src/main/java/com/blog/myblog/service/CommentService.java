package com.blog.myblog.service;

import com.blog.myblog.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentByArticleId(Integer articleId);
}
