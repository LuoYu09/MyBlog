package com.blog.myblog.service;

import com.blog.myblog.entity.Article;

import java.util.List;

public interface CategoryService {
    List<Integer> getArticleIdByCateId(Integer cateId);
}
