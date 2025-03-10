package com.blog.myblog.VO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录返回的数据格式
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginVO {
    //主键值
    private Long id;

    //用户名
    private String userName;

    //头像
    private String avatar;

    //jwt令牌
    private String token;
}
