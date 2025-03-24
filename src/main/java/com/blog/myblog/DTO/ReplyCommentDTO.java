package com.blog.myblog.DTO;

import lombok.Data;

@Data
public class ReplyCommentDTO {
    private Integer userId;

    private Integer parentArticleId;

    private Integer parentCommentId;

    private String content;
}
