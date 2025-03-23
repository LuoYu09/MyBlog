package com.blog.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = 6687286913317513141L;

    private Integer categoryId;     //分类ID

    private Integer categoryPid;    //分类上一级分类ID

    private String categoryName;    //分类名称

    private String categoryDescription; //分类描述

    /**
     * 文章数量(非数据库字段)
     */
    private Integer articleCount; //文章数量
}
