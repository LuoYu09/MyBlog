package com.blog.myblog.mapper;

import com.blog.myblog.entity.Comment;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackCommentMapper {

    @Select("select * from comment where parent_article_id IS NOT NULL order by create_time desc")
    Page<Comment> pageQuery();

    @Select("select * from comment where parent_comment_id = #{id} order by create_time desc")
    List<Comment> selectSubComments(Integer id);

    @Insert("insert into comment (user_id, content, parent_article_id, parent_comment_id, create_time, user_name, user_avatar) values " +
            "(#{userId}, #{content}, #{parentArticleId}, #{parentCommentId}, NOW(), #{userName}, #{userAvatar})")
    void addComment(Comment comment);

    @Select("select * from comment where id = #{id}")
    Comment selectById(Integer id);

    @Delete("delete from comment where id = #{id}")
    void deleteById(Integer id);

    @Delete("delete from comment where parent_comment_id = #{id}")
    void deleteByParentCommentId(Integer id);
}
