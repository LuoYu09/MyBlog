package com.blog.myblog.controller.home;

import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "公告相关接口")
@RestController
public class NoticeController {
    /**
     * 公告详情页显示
     *
     * @param noticeId
     * @return
     */
    @Operation(summary = "查询公告详情",description = "根据公告id查询公告详情")
    @GetMapping("/notice/{noticeId}")
    public Result notice(@PathVariable("noticeId") Integer noticeId) {
        return Result.success();
    }
}
