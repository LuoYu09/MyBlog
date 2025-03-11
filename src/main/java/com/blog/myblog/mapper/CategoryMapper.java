package com.blog.myblog.mapper;

import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Integer> getArticleIdByCateId(Integer cateId);

    List<Category> getAllCate();
}
