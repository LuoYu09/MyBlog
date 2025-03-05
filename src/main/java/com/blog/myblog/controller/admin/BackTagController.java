package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.TagDTO;
import com.blog.myblog.entity.Tag;
import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/tag")
@Api(tags = "标签接口")
@Slf4j
public class BackTagController {
    /**
     * 查询所有标签（带文章数量）
     * @return
     */
    @PostMapping("/list")
    @ApiOperation("查询所有标签（带文章数量）")
    public Result<List<Tag>> listTagWithCount(){
        return Result.success();
    }

    /**
     * 添加标签
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    @ApiOperation("添加标签")
    public Result add(@RequestBody TagDTO dto){
        return Result.success();
    }

    /**
     * 根据ID删除标签
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation("根据ID删除标签")
    public Result delete(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询分类")
    public Result<Tag> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改分类
     * @param dto
     * @return
     */
    @PutMapping
    @ApiOperation("修改分类")
    public Result update(@RequestBody TagDTO dto){
        return Result.success();
    }
}
