package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "前端传递分页查询数据模型")
public class PageQueryDTO {
    @Schema(name = "第几页")
    private Integer page;

    @Schema(name = "每页展示条数")
    private Integer pageSize;
}
