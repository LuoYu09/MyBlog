package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.BackCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/back/comment")
@Slf4j
public class BackCommentController {
    @Autowired
    private BackCommentService backCommentService;

    /**
     * 后台评论分页查询
     * @param dto
     * @return
     */
    @GetMapping("/page")
    public Result<PageResult> pageQuery(PageQueryDTO dto){
        log.info("后台评论分页查询：{}", dto);

        PageResult result = backCommentService.pageQuery(dto);

        return Result.success(result);
    }
}
