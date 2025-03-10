package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 用户注册时传递的数据模型
 */
@Data
public class RegisterDTO {
    //用户名
    private String userName;

    //昵称
    private String nickName;

    //邮箱
    private String email;

    //密码
    private String password;
}
