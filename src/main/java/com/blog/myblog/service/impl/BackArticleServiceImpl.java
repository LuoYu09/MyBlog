package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.ArticleDTO;
import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.mapper.BackArticleMapper;
import com.blog.myblog.mapper.CategoryMapper;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.service.BackArticleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackArticleServiceImpl implements BackArticleService {
    private static final Logger log = LoggerFactory.getLogger(BackArticleServiceImpl.class);
    @Autowired
    private BackArticleMapper backArticleMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 后台文章分页查询
     * @param dto
     * @return
     */
    @Override
    public PageResult pageQuery(PageQueryDTO dto) {
        PageHelper.startPage(dto.getPage(),dto.getPageSize());

        Page<Article> page = backArticleMapper.pageQuery();

        PageResult result = new PageResult();

        result.setTotal(page.getTotal());
        result.setRecords(page.getResult());

        return result;
    }

    /**
     * 查询所有分类（不带文章数量）
     * @return
     */
    @Override
    public List<Category> listCategory() {
        return categoryMapper.getAllCate();
    }

    /**
     * 添加文章
     * @param dto
     */
    @Override
    public void add(ArticleDTO dto) {
        //categoryMapper.add();
    }
}
