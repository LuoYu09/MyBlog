package com.blog.myblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * 文章数据模型
 */
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;   //文章ID

    private Integer articleUserId;  //文章对应用户ID

    private String articleTitle;  //文章标题

    private Integer articleViewCount;   //文章访问量

    private Integer articleCommentCount;  //文章评论数量

    private Integer articleLikeCount;   //文章点赞数

    private LocalDateTime articleCreateTime;  //文章创建时间

    private LocalDateTime articleUploadTime;  //文章上传时间

    private LocalDateTime articleUpdateTime;  //最新修改时间

    private Integer articleIsComment;  //是否允许评论，1允许，0不允许

    private Integer articleStatus;  //文章状态，1已发布，0草稿（未发布）

    private String articleContent;  //内容

    private String articleSummary;  //摘要

    private String articleImage;  //封面图片

    private List<Category> categoryList;  //文章分类

}
