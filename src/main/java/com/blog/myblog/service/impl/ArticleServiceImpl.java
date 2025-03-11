package com.blog.myblog.service.impl;

import com.blog.myblog.entity.Article;
import com.blog.myblog.mapper.ArticleMapper;
import com.blog.myblog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param id 文章ID
     * @return View
     */
    @Override
    public Article getArticleById(Integer id) {
        return articleMapper.getArticleById(id);
    }
    /**
     * 文章的点赞增加
     *
     * @param id 文章ID
     * @return 点赞量数量
     */
    @Override
    public void increaseLikeCount(Integer id) {
        articleMapper.increaseLikeCount(id);
    }
    /**
     * 文章的访问量增加
     *
     * @param id 文章ID
     * @return 点赞量数量
     */
    @Override
    public void increaseViewCount(Integer id) {
        articleMapper.increaseViewCount(id);
    }

    @Override
    public List<Article> getArticlesByCateIdList(List<Integer> cateIdList,Integer startIndex, Integer pageSize) {
        return articleMapper.getArticlesByCateIdList(cateIdList,startIndex,pageSize);
    }

    @Override
    public List<Article> getArticlesByUserId(Integer userId, Integer startIndex, Integer pageSize) {
        return articleMapper.getArticlesByUserId(userId,startIndex,pageSize);
    }

    @Override
    public Integer getUserArticleCount(Integer userId) {
        return articleMapper.getUserArticleCount(userId);
    }

    @Override
    public List<Article> searchArticles(Integer userId, String keyword, Integer startIndex, Integer pageSize) {
        return articleMapper.searchArticles(userId,keyword,startIndex,pageSize);
    }
}
