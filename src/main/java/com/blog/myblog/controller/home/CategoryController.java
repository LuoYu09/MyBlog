package com.blog.myblog.controller.home;

import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.ArticleService;
import com.blog.myblog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/category")
@Slf4j
/**
 * 文章分类目录的controller
 */
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ArticleService articleService;
    /**
     * 根据分类查询文章
     *
     * @param cateId 分类ID
     * @return 模板
     */
    @GetMapping("/{cateId}")
    public Result<List<Article>> getArticlesByCateId(@PathVariable("cateId") Integer cateId,
                                    @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        Integer startIndex = (pageIndex - 1) * pageSize;
    List<Integer> cateIdList=categoryService.getArticleIdByCateId(cateId);
    List<Article> articleList=articleService.getArticlesByCateIdList(cateIdList,startIndex,pageSize);
        return Result.success(articleList);
    }

    /**
     * 获取所有分类
     * @return 分类列表
     */
    @GetMapping("/getAllCate")
    public Result<List<Category>> getAllCate() {
        List<Category> cateList = categoryService.getAllCate();
        return Result.success(cateList);
    }
}
