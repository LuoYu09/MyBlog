package com.blog.myblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 标签类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag implements Serializable {
    private static final long serialVersionUID = 605449151900057035L;
    private Integer tagId;

    private String tagName;

    private String tagDescription;

    /**
     * 文章数量(不是数据库字段)
     */
    private Integer articleCount;
}
