package com.blog.myblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Page implements Serializable{

    private static final long serialVersionUID = 3927496662110298634L;
    private Integer pageId; //页面id

    private String pageKey; //页面关键词

    private String pageTitle; //页面标题

    private String pageContent; //页面内容

    private Date pageCreateTime; //创建时间

    private Date pageUpdateTime; //更新时间

    private Integer pageViewCount; //页面浏览量

    private Integer pageCommentCount; //页面评论量

    private Integer pageStatus;

}