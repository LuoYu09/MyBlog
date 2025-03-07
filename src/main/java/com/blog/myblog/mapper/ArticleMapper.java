package com.blog.myblog.mapper;

import com.blog.myblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {

    Article getArticleById(Integer id);

}
