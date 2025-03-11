package com.blog.myblog.mapper;

import com.blog.myblog.entity.Article;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BackArticleMapper {

    @Select("select * from article order by article_create_time desc")
    Page<Article> pageQuery();

}
