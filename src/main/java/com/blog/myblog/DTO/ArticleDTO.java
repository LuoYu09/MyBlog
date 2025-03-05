package com.blog.myblog.DTO;

import com.blog.myblog.entity.Tag;
import lombok.Data;

import java.util.List;

@Data
public class ArticleDTO {
    private Integer articleId;

    private String articleTitle;

    private String articleContent;

    private Integer articleParentCategoryId;

    private Integer articleChildCategoryId;

    private Integer articleOrder;

    private Integer articleStatus;

    private String articleThumbnail;

    private List<Tag> articleTags;
}
