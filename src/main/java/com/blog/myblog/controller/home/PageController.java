package com.blog.myblog.controller.home;


import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("分页相关接口")
@Slf4j
public class PageController {
    /**
     * 页面详情页面
     *
     * @param key
     * @return
     */
    @ApiOperation("根据页面key查询页面详情")
    @GetMapping("/page/{key}")
    public Result pageDetail(@PathVariable("key") String key) {
        return Result.success();
    }

    /**
     * 文章归档页面显示
     *
     * @return
     */
    @GetMapping(value = "/articleFile")
    @ApiOperation("文章归档页面显示")
    public Result articleFile() {
        return Result.success();
    }

    /**
     * 站点地图显示
     *
     * @return
     */
    @ApiOperation("站点地图显示")
    @GetMapping(value = "/map")
    public Result siteMap() {
        return Result.success();
    }
}
