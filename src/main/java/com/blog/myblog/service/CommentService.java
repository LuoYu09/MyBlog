package com.blog.myblog.service;

import com.blog.myblog.entity.Comment;

import java.util.List;

public interface CommentService {

    void saveComment(Comment comment);

    List<Comment> getCommentsByArticleId(Integer articleId);
}
