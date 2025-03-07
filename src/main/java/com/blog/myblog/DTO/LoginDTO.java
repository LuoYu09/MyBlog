package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(name = "用户登录时传递的数据模型")
public class LoginDTO implements Serializable {

    @Schema(name = "用户名")
    private String username;

    @Schema(name = "密码")
    private String password;
}
