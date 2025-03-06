package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@Slf4j
@Api(tags = "文章相关接口")
public class ArticleController {
    /**
     * 文章详情页显示
     *获取文章信息，分类，标签等信息
     * @param articleId 文章ID
     * @return View
     */
    @ApiOperation(value = "文章详情页显示")
    @GetMapping(value = "/{articleId}")
    public Result article(@PathVariable("articleId") Integer articleId) {
        return Result.success();
    }

    /**
     * 文章的点赞增加
     *
     * @param articleId 文章ID
     * @return 点赞量数量
     */
    @ApiOperation(value = "点赞增加")
    @PutMapping("/like/{articleId}")
    public Result increaseLikeCount(@PathVariable("articleId") Integer articleId) {
        return Result.success();
    }

    /**
     * 文章访问量数增加
     *
     * @param articleId 文章ID
     * @return 访问量数量
     */
    @ApiOperation(value = "访问量数增加")
    @PutMapping("/view/{articleId}")
    public Result increaseViewCount(@PathVariable("articleId") Integer articleId) {
        return Result.success();
    }

}
