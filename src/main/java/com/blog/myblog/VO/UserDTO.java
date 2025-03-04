package com.blog.myblog.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private Integer userId;

    private String userName;

    private String userPass;

    private String userNickname;

    private String userEmail;

    private String userUrl;

    private String userAvatar;

    private Integer userStatus;
}
