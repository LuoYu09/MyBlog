package com.blog.myblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = -1038897351672911219L;

    private Integer id;

    private Integer userId;

    private Integer parentArticleId;

    private Integer parentCommentId;

    private String userName;

    private String userAvatar;

    private String parentArticleTitle;

    private String content;

    private LocalDateTime createTime;

    private List<Comment> subComments;
}
