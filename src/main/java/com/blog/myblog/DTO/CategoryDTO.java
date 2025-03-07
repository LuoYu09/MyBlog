package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "前端传递分类数据模型")
public class CategoryDTO {
    @Schema(name = "分类ID")
    private Integer categoryId;

    @Schema(name = "分类上一级分类ID")
    private Integer categoryPid;

    @Schema(name = "分类名称")
    private String categoryName;

    @Schema(name = "分类描述")
    private String categoryDescription;

    @Schema(name = "分类图标")
    private String categoryIcon;
}
