package com.blog.myblog.controller.admin;

import com.blog.myblog.DTO.ArticleDTO;
import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.BackArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台文章操作接口
 */
@RestController
@RequestMapping("/back/article")
@Slf4j
public class BackArticleController {
    @Autowired
    private BackArticleService backArticleService;

    /**
     * 后台文章分页查询
     * @return
     */
    @PostMapping("/page")
    public Result<PageResult> pageQuery(@RequestBody PageQueryDTO dto){
        log.info("后台文章分页查询:{}",dto);

        PageResult result = backArticleService.pageQuery(dto);

        return Result.success(result);
    }

    /**
     * 查询所有分类（不带文章数量）
     * @return
     */
    @PostMapping("/category")
    public Result<List<Category>> listCategory(){
        log.info("查询所有分类（不带文章数量）");

        List<Category> list = backArticleService.listCategory();

        return Result.success(list);
    }

    /**
     * 添加文章
     * @param dto
     * @return
     */
    @PostMapping("/insert")
    public Result add(@RequestBody ArticleDTO dto){
        log.info("添加文章:{}",dto.getArticleTitle());

        backArticleService.add(dto);

        return Result.success();
    }

    /**
     * 根据ID删除文章
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据ID删除文章:{}",id);

        backArticleService.deleteById(id);

        return Result.success();
    }

    /**
     * 根据ID查询文章
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<Article> selectById(@PathVariable Integer id){
        log.info("根据ID查询文章:{}",id);

        Article article = backArticleService.selectById(id);

        return Result.success(article);
    }

    /**
     * 编辑文章
     * @param dto
     * @return
     */
    @PutMapping
    public Result updateArticle(@RequestBody ArticleDTO dto){
        log.info("编辑文章:{}",dto.getArticleId());

        backArticleService.updateArticle(dto);

        return Result.success();
    }
}
