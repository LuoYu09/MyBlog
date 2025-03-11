package com.blog.myblog.service;

import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Integer> getArticleIdByCateId(Integer cateId);

    List<Category> getAllCate();
}
