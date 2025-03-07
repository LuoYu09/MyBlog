package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.TagDTO;
import com.blog.myblog.entity.Tag;
import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/tag")
@io.swagger.v3.oas.annotations.tags.Tag(name = "标签接口")
@Slf4j
public class BackTagController {
    /**
     * 查询所有标签（带文章数量）
     * @return
     */
    @PostMapping("/list")
    @Operation(summary = "查询所有标签（带文章数量）")
    public Result<List<Tag>> listTagWithCount(){
        return Result.success();
    }

    /**
     * 添加标签
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    @Operation(summary = "添加标签")
    public Result add(@RequestBody TagDTO dto){
        return Result.success();
    }

    /**
     * 根据ID删除标签
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @Operation(summary = "根据ID删除标签")
    public Result delete(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @Operation(summary = "根据ID查询分类")
    public Result<Tag> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改分类
     * @param dto
     * @return
     */
    @PutMapping
    @Operation(summary = "修改分类")
    public Result update(@RequestBody TagDTO dto){
        return Result.success();
    }
}
