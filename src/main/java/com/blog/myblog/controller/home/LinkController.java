package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("友情链接相关的接口")
@RestController
@Slf4j
public class LinkController {

    @ApiOperation("申请友链")
    @GetMapping("/applyLink")
    public Result applyLinkView() {
        return Result.success();
    }

    @ApiOperation("提交友链申请")
    @PostMapping("/applyLinkSubmit")
    public Result applyLinkSubmit() {
        return Result.success();
    }
}
