package com.blog.myblog.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "前端传递标签数据模型")
public class TagDTO {
    @Schema(name = "标签ID")
    private Integer tagId;

    @Schema(name = "标签名字")
    private String tagName;

    @Schema(name = "标签描述")
    private String tagDescription;
}
