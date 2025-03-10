package com.blog.myblog.DTO;

import lombok.Data;

/**
 * 前端传递的文章数据模型
 */
@Data
public class ArticleDTO {
    //文章ID
    private Integer articleId;

   //文章标题
    private String articleTitle;

    //文章内容
    private String articleContent;

    //文章一级分类
    private Integer articleParentCategoryId;

    //文章二级分类
    private Integer articleChildCategoryId;

    //private Integer articleOrder;

    //文章状态
    private Integer articleStatus;

    //文章略缩图
    private String articleThumbnail;
}
