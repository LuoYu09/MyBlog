package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.ArticleDTO;
import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.entity.Tag;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/article")
@io.swagger.v3.oas.annotations.tags.Tag(name = "后台文章操作接口")
@Slf4j
public class BackArticleController {
    /**
     * 后台文章分页查询
     * @return
     */
    @PostMapping("/page")
    @Operation(summary = "后台文章分页查询")
    public Result<PageResult> pageQuery(@RequestBody PageQueryDTO dto){
        return Result.success();
    }

    /**
     * 查询所有分类
     * @return
     */
    @PostMapping("/category")
    @Operation(summary = "查询所有分类（不带文章数量）")
    public Result<List<Category>> listCategory(){
        return Result.success();
    }

    /**
     * 查询所有标签
     * @return
     */
    @PostMapping("/tag")
    @Operation(summary = "查询所有标签")
    public Result<List<Tag>> listTag(){
        return Result.success();
    }

    /**
     * 添加文章
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    @Operation(summary = "添加文章")
    public Result add(@RequestBody ArticleDTO dto){
        return Result.success();
    }

    /**
     * 根据ID删除文章
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @Operation(summary = "根据ID删除文章")
    public Result delete(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 根据ID查询文章
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @Operation(summary = "根据ID查询文章")
    public Result<Article> selectById(@PathVariable Integer id){
        return Result.success();
    }

    /**
     * 编辑文章
     * @param dto
     * @return
     */
    @PutMapping
    @Operation(summary = "编辑文章")
    public Result updateArticle(@RequestBody ArticleDTO dto){
        return Result.success();
    }
}
