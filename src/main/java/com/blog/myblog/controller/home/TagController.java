package com.blog.myblog.controller.home;


import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/tag")
@Slf4j
@Tag(name ="标签相关接口")
@RestController
public class TagController {
    /**
     * 根据标签查询文章
     *
     * @param tagId 标签ID
     * @return 模板
     */
    @Operation(summary = "查询文章",description = "根据标签的id和页数索引查询文章")
    @GetMapping("/tag/{tagId}")
    public Result getArticlesByTagId(@PathVariable("tagId") Integer tagId,
                                     @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                                     @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success();
    }
}
