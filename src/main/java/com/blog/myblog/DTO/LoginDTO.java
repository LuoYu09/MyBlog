package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

//用户登录请求数据模型
@Data
public class LoginDTO implements Serializable {
    //用户名
    private String username;

    //密码
    private String password;
}
