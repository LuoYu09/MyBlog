package com.blog.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    private static final long serialVersionUID = 6687286913317513141L;

    private Integer categoryId;

    private Integer categoryPid;

    private String categoryName;

    private String categoryDescription;

    private String categoryIcon;

    /**
     * 文章数量(非数据库字段)
     */
    private Integer articleCount;
}
