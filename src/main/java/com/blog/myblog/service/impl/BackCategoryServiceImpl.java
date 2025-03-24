package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.constant.MessageConstant;
import com.blog.myblog.entity.Category;
import com.blog.myblog.exception.CharCountException;
import com.blog.myblog.exception.DeletionNotAllowedException;
import com.blog.myblog.mapper.BackCategoryMapper;
import com.blog.myblog.service.BackCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BackCategoryServiceImpl implements BackCategoryService {
    @Autowired
    private BackCategoryMapper backCategoryMapper;

    /**
     * 查询所有分类（含文章数量)
     * @return
     */
    @Override
    @Transactional
    public List<Category> listCategoryWithCount() {
        List<Category> categories = backCategoryMapper.listCategoryWithCount();

        for (Category category : categories) {
            category.setArticleCount(backCategoryMapper.countArticle(category.getCategoryId()));
        }

        return categories;
    }

    /**
     * 添加分类
     * @param dto
     */
    @Override
    public void add(CategoryDTO dto) {
        if(dto.getCategoryName().length() > 20){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        backCategoryMapper.add(dto);
    }

    /**
     * 删除分类
     * @param id
     */
    @Override
    public void delete(Integer id) {
        Integer check = backCategoryMapper.countArticle(id);
        if(check != 0){
            throw new DeletionNotAllowedException(MessageConstant.CATEGORY_BE_RELATED_BY_ARTICLE);
        }

        backCategoryMapper.delete(id);
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @Override
    public Category selectById(Integer id) {
        return backCategoryMapper.selectById(id);
    }

    /**
     * 修改分类
     * @param dto
     */
    @Override
    public void update(CategoryDTO dto) {
        if(dto.getCategoryName() != null && dto.getCategoryName().length() > 20){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        backCategoryMapper.update(dto);
    }
}
