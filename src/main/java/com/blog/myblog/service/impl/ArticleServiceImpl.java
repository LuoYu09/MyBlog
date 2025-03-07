package com.blog.myblog.service.impl;

import com.blog.myblog.entity.Article;
import com.blog.myblog.mapper.ArticleMapper;
import com.blog.myblog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
