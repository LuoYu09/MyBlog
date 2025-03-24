package com.blog.myblog.mapper;

import com.blog.myblog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> getCommentByArticleId(Integer articleId);

    void saveComment(Comment comment);
}
