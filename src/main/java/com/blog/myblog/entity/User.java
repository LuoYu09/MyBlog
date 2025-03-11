package com.blog.myblog.entity;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class User implements Serializable{
    private static final long serialVersionUID = -4415517704211731385L;
    private Integer userId;

    private String userName;

    private String userPass;

    private String userNickname;

    private String userEmail;

    private String userUrl;

    private String userAvatar;

    private LocalDateTime userRegisterTime;

    private LocalDateTime userLastLoginTime;

    /**
     * 文章数量（不是数据库字段）
     */
    private Integer articleCount;

}
