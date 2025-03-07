package com.blog.myblog.config;

import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
@Slf4j
public class WebMvcConfiguration implements WebMvcConfigurer { // 改为实现接口，避免覆盖默认配置

    /**
     * 配置 OpenAPI 文档信息
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("MyBlog 接口文档")
                        .version("1.0.0")
                        .description("MyBlog 后台端接口文档"));
    }

    /**
     * 分组配置（后台端接口）
     */
    @Bean
    public GroupedOpenApi adminApi() {
        log.info("准备生成后台端接口文档...");
        return GroupedOpenApi.builder()
                .group("后台端接口")
                .packagesToScan("com.blog.myblog.controller") // 指定扫描的包
                .build();
    }
}