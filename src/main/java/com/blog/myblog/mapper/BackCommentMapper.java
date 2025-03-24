package com.blog.myblog.mapper;

import com.blog.myblog.entity.Comment;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackCommentMapper {

    @Select("select * from comment where parent_article_id IS NOT NULL order by create_time desc")
    Page<Comment> pageQuery();

    @Select("select * from comment where parent_comment_id = #{id} order by create_time desc")
    List<Comment> selectSubComments(Integer id);
}
