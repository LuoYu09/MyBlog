package com.blog.myblog.service;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.entity.Category;

import java.util.List;

public interface BackCategoryService {

    /**
     * 查询所有分类（含文章数量)
     * @return
     */
    List<Category> listCategoryWithCount();

    /**
     * 添加分类
     * @param dto
     */
    void add(CategoryDTO dto);

    /**
     * 删除分类
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    Category selectById(Integer id);

    /**
     * 修改分类
     * @param dto
     */
    void update(CategoryDTO dto);
}
