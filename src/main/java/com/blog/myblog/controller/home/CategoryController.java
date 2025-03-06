package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@Api(tags = "分类相关接口")
@Slf4j
/**
 * 文章分类目录的controller
 */
public class CategoryController {
    /**
     * 根据分类查询文章
     *
     * @param cateId 分类ID
     * @return 模板
     */
    @GetMapping("/{cateId}")
    @ApiOperation(value = "根据分类的id和页数索引查询文章")
    public Result getArticlesByCateId(@PathVariable("cateId") Integer cateId,
                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return Result.success();
    }


}
