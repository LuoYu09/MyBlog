package com.blog.myblog.DTO;

import lombok.Data;

@Data
public class CategoryDTO {
    private Integer categoryId;

    private Integer categoryPid;

    private String categoryName;

    private String categoryDescription;

    private String categoryIcon;
}
