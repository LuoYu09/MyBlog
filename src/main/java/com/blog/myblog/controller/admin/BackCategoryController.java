package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台分类接口
 */
@RestController
@RequestMapping("/back/category")
@Slf4j
public class BackCategoryController {

    /**
     * 查询所有分类
     * @return
     */
    @PostMapping("/list")
    public Result<List<Category>> listCategoryWithCount(){
        return Result.success();
    }

    /**
     * 添加分类
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    public Result add(@RequestBody CategoryDTO dto){
        return Result.success();
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Category> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 修改分类
     * @param dto
     * @return
     */
    @PutMapping
    public Result update(@RequestBody CategoryDTO dto){
        return Result.success();
    }
}
