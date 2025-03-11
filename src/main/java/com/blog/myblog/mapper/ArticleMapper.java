package com.blog.myblog.mapper;

import com.blog.myblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param id 文章ID
     * @return View
     */
    Article getArticleById(Integer id);

    void increaseLikeCount(Integer id);

    void increaseViewCount(Integer id);

    List<Article> getArticlesByCateIdList(List<Integer> cateIdList,Integer startIndex, Integer pageSize);

    List<Article> getArticlesByUserId(Integer userId, Integer startIndex, Integer pageSize);

    Integer getUserArticleCount(Integer userId);

    List<Article> searchArticles(Integer userId, String keyword, Integer startIndex, Integer pageSize);
}
