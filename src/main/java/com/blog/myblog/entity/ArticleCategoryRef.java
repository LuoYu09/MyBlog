package com.blog.myblog.entity;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ArticleCategoryRef implements Serializable {
    @Serial
    private static final long serialVersionUID = -6809206515467725995L;

    private Integer articleId;   //文章ID

    private Integer categoryId;  //分类ID

}
