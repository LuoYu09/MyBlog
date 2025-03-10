package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 前端传递分类数据模型
 */
@Data
public class CategoryDTO {
    //分类ID
    private Integer categoryId;

    //分类上一级分类ID
    private Integer categoryPid;

    //分类名称
    private String categoryName;

    //分类描述
    private String categoryDescription;

    //分类图标
    private String categoryIcon;
}
