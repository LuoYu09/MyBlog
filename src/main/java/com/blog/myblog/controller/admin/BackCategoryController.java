package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.BackCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台分类接口
 */
@RestController
@RequestMapping("/back/category")
@Slf4j
public class BackCategoryController {
    @Autowired
    private BackCategoryService categoryService;

    /**
     * 查询所有分类（含文章数量)
     * @return
     */
    @PostMapping("/list")
    public Result<List<Category>> listCategoryWithCount(){
        log.info("查询所有分类（含文章数量)");

        List<Category> categories = categoryService.listCategoryWithCount();

        return Result.success(categories);
    }

    /**
     * 添加分类
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    public Result add(@RequestBody CategoryDTO dto){
        log.info("添加分类:{}",dto);

        categoryService.add(dto);

        return Result.success();
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除分类:{}",id);

        categoryService.delete(id);

        return Result.success();
    }

    /**
     * 根据ID查询分类
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Category> selectById(@PathVariable Integer id){
        log.info("根据ID查询分类:{}",id);

        Category category = categoryService.selectById(id);

        return Result.success(category);
    }

    /**
     * 修改分类
     * @param dto
     * @return
     */
    @PutMapping
    public Result update(@RequestBody CategoryDTO dto){
        log.info("修改分类:{}",dto);

        categoryService.update(dto);

        return Result.success();
    }
}
