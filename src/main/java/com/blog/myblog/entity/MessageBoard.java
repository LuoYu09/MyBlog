package com.blog.myblog.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageBoard {
    private Integer id; // 主键ID

    private Integer userId; // 用户ID

    private String userName; // 用户名

    private String userAvatar; // 用户头像

    private LocalDateTime createTime; // 创建时间

    private String articleContent;  //内容

    private Integer likeCount;  //点赞数
}
