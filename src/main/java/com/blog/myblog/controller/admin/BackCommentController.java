package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.DTO.ReplyCommentDTO;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.BackCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * 后台评论接口
 */
@RestController
@RequestMapping("/back/comment")
@Slf4j
public class BackCommentController {
    @Autowired
    private BackCommentService backCommentService;
    @Qualifier("reactiveRedisTemplate")
    @Autowired
    private ReactiveRedisTemplate reactiveRedisTemplate;

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

    /**
     * 后台回复评论
     * @param dto
     * @return
     */
    @PutMapping("/reply")
    public Result reply(@RequestBody ReplyCommentDTO dto){
        log.info("后台回复评论:{}",dto);

        backCommentService.reply(dto);

        return Result.success();
    }

    /**
     * 后台删除评论
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("后台删除评论：{}", id);

        backCommentService.delete(id);

        return Result.success();
    }
}
