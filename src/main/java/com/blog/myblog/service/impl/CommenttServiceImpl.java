package com.blog.myblog.service.impl;

import com.blog.myblog.entity.Comment;
import com.blog.myblog.mapper.CommentMapper;
import com.blog.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommenttServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getCommentByArticleId(Integer articleId) {
        return commentMapper.getCommentByArticleId(articleId);
    }
}
