package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(name = "用户数据模型")
public class UserDTO implements Serializable {
    @Schema(name = "用户ID")
    private Integer userId;

    @Schema(name = "用户姓名")
    private String userName;

    @Schema(name = "密码")
    private String userPass;

    @Schema(name = "昵称")
    private String userNickname;

    @Schema(name = "邮箱")
    private String userEmail;

    @Schema(name = "个人网址")
    private String userUrl;

    @Schema(name = "头像")
    private String userAvatar;

    @Schema(name = "状态")
    private Integer userStatus;
}
