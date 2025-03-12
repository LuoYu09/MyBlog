package com.blog.myblog.service;

import com.blog.myblog.DTO.ArticleDTO;
import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.PageResult;

import java.util.List;

public interface BackArticleService {

    /**
     * 后台文章分页查询
     * @param dto
     * @return
     */
    PageResult pageQuery(PageQueryDTO dto);

    /**
     * 查询所有分类（不带文章数量）
     * @return
     */
    List<Category> listCategory();

    /**
     * 添加文章
     * @param dto
     */
    void add(ArticleDTO dto);

    /**
     * 根据ID删除文章
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 根据ID查询文章
     *
     * @param id
     * @return
     */
    Article selectById(Integer id);

    /**
     * 编辑文章
     * @param dto
     */
    void updateArticle(ArticleDTO dto);
}
