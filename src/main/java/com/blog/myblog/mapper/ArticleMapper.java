package com.blog.myblog.mapper;

import com.blog.myblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {
    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param id 文章ID
     * @return View
     */
    Article getArticleById(Integer id);

}
