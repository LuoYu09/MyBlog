package com.blog.myblog.controller.home;


import com.blog.myblog.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/home")
public class PageController {
    /**
     * 页面详情页面
     *
     * @param key
     * @return
     */
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
    public Result articleFile() {
        return Result.success();
    }

}
