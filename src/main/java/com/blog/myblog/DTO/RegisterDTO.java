package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "用户注册时传递的数据模型")
public class RegisterDTO {
    @Schema(name = "用户名")
    private String userName;

    @Schema(name = "昵称")
    private String nickName;

    @Schema(name = "邮箱")
    private String email;

    @Schema(name = "密码")
    private String password;
}
