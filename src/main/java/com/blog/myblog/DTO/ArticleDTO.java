package com.blog.myblog.DTO;

import lombok.Data;

import java.util.List;

/**
 * 前端传递的文章数据模型
 */
@Data
public class ArticleDTO {
    //文章ID
    private Integer articleId;

    //文章标题
    private String articleTitle;

    //摘要
    private String articleSummary;

    //文章内容
    private String articleContent;

    //文章分类
    private List<Integer> categoryId;

    //文章状态
    private Integer articleStatus;

    //文章封面图
    private String articleThumbnail;
}
