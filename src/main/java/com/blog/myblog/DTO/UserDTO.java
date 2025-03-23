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
    private Integer id;

    //用户姓名
    private String userName;

    //密码
    private String userPass;

    //邮箱
    private String email;

    //个性签名
    private String sign;

    //用户角色
    private int userRole;

    //个人网址
    private String imageUrl;

    //头像
    private String userAvatar;
}
