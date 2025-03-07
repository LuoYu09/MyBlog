package com.blog.myblog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@Slf4j
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    /**
     * 生成接口文档
     * @return
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("MyBlog项目接口文档").description("MyBlog项目接口文档").version("1.0"));
    }

    //指定扫描范围
    @Bean
    public GroupedOpenApi adminApi1() {
        return GroupedOpenApi.builder().group("后台端接口").packagesToScan("com.blog.myblog.controller.admin").build();
    }

    @Bean
    public GroupedOpenApi adminApi2() {
        return GroupedOpenApi.builder().group("用户端接口").packagesToScan("com.blog.myblog.controller.home").build();
    }

    /**
     * 设置静态资源映射
     * @param registry
     */
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始设置静态资源映射...");
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
