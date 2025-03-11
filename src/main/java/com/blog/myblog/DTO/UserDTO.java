package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户数据模型
 */
@Data
public class UserDTO implements Serializable {
    //用户ID
    private Integer userId;

    //用户姓名
    private String userName;

    //密码
    private String userPass;

    //昵称
    private String userNickname;

    //邮箱
    private String userEmail;

    //个人网址
    private String userUrl;

    //头像
    private String userAvatar;
}
