package com.blog.myblog.service;

import com.blog.myblog.entity.Article;

import java.util.List;

public interface ArticleService {

    Article getArticleById(Integer id);

    void increaseLikeCount(Integer id);

    void increaseViewCount(Integer id);

    List<Article> getArticlesByCateIdList(List<Integer> cateIdList,Integer startIndex,Integer pageSize);

    List<Article> getArticlesByUserId(Integer userId, Integer startIndex, Integer pageSize);

    Integer getUserArticleCount(Integer userId);

    List<Article> searchArticles(Integer userId, String keyword, Integer startIndex, Integer pageSize);
}
