package com.blog.myblog.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Data
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;
}
