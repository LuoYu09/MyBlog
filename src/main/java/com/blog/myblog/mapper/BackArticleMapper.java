package com.blog.myblog.mapper;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackArticleMapper {

    @Select("select * from article order by article_create_time desc")
    Page<Article> pageQuery(PageQueryDTO dto);

    void add(Article article);

    void addRef(List<Integer> categoryId, Integer articleId);

    @Delete("delete from article where article_id = #{id}")
    void deleteById(Integer id);

    @Select("select * from article where article_id = #{id}")
    Article selectById(Integer id);

    void update(Article article);

    @Delete("delete from article_category_ref where article_id = #{id}")
    void deleteRef(Integer id);

    @Select("select * from category left join article_category_ref on category.category_id = article_category_ref.category_id where article_id = #{id}")
    List<Category> selectRefCategory(Integer id);
}
