package com.blog.myblog.DTO;

import com.blog.myblog.entity.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "前端传递的文章数据模型")
public class ArticleDTO {
    @Schema(name = "文章ID")
    private Integer articleId;

    @Schema(name = "文章标题")
    private String articleTitle;

    @Schema(name = "文章内容")
    private String articleContent;

    @Schema(name = "文章一级分类")
    private Integer articleParentCategoryId;

    @Schema(name = "文章二级分类")
    private Integer articleChildCategoryId;

    //private Integer articleOrder;

    @Schema(name = "文章状态")
    private Integer articleStatus;

    @Schema(name = "文章略缩图")
    private String articleThumbnail;

    @Schema(name = "文章标签")
    private List<Tag> articleTags;
}
