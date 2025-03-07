package com.blog.myblog.service.impl;

import com.blog.myblog.mapper.ArticleMapper;
import com.blog.myblog.mapper.CategoryMapper;
import com.blog.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceimpl implements CategoryService {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Integer> getArticleIdByCateId(Integer cateId) {
        return categoryMapper.getArticleIdByCateId(cateId);
    }
}
