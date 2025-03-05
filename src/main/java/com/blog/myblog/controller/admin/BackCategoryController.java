package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/category")
@Api(tags = "后台分类接口")
@Slf4j
public class BackCategoryController {

    /**
     * 查询所有分类
     * @return
     */
    @PostMapping("/list")
    @ApiOperation("查询所有分类（带文章数量）")
    public Result<List<Category>> listCategoryWithCount(){
        return Result.success();
    }

    /**
     * 添加分类
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    @ApiOperation("添加分类")
    public Result add(@RequestBody CategoryDTO dto){
        return Result.success();
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ApiOperation("删除分类")
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
    public Result<Category> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改分类
     * @param dto
     * @return
     */
    @PutMapping
    @ApiOperation("修改分类")
    public Result update(@RequestBody CategoryDTO dto){
        return Result.success();
    }
}
