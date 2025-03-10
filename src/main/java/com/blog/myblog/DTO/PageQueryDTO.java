package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前端传递分页查询数据模型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageQueryDTO {
    //第几页
    private Integer page;

    //每页展示条数
    private Integer pageSize;
}
