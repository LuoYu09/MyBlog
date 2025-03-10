package com.blog.myblog.VO;

import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Comment;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "文章详情VO")
public class ArticleDetailVO {
    @Schema(name = "文章信息")
    private Article article;

    @Schema(name = "评论信息")
    private List<Comment> comment;

    @Schema(name = "相似文章")
    private List<Article> similarArticles;
}
