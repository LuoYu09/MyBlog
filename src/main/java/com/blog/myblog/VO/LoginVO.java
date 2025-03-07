package com.blog.myblog.VO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "用户登录返回的数据格式")
public class LoginVO {
    @Schema(name = "主键值")
    private Long id;

    @Schema(name = "用户名")
    private String userName;

    @Schema(name = "头像")
    private String avatar;

    @Schema(name = "jwt令牌")
    private String token;
}
