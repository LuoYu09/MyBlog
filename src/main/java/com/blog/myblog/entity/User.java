package com.blog.myblog.entity;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


@Data
public class User implements Serializable{
    @Serial
    private static final long serialVersionUID = -4415517704211731385L;

    private Integer id;

    private String userName;

    private String userPass;

    private int userRole;

    private String sign;

    private String imageUrl;

    private String email;

    private String userAvatar;

    private LocalDateTime userRegisterTime;

    private LocalDateTime userLastLoginTime;

    /**
     * 文章数量（不是数据库字段）
     */
    private Integer articleCount;

}
