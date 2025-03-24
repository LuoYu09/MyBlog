package com.blog.myblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = -1038897351672911219L;

    private Integer id; // 评论ID

    private Integer userId; // 用户ID

    private Integer parentArticleId; // 父评论文章ID

    private Integer parentCommentId; // 父评论ID

    private String userName; // 用户名

    private String userAvatar;  // 用户头像

    private String parentArticleTitle;  // 父评论文章标题

    private String content; // 评论内容

    private LocalDateTime createTime; // 创建时间

    private List<Comment> subComments;  // 子评论
}
