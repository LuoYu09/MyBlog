package com.blog.myblog.mapper;

import com.blog.myblog.DTO.CategoryDTO;
import com.blog.myblog.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackCategoryMapper {
    @Select("select * from category order by category_id")
    List<Category> listCategoryWithCount();

    @Select("select count(*) from article_category_ref where category_id = #{categoryId}")
    Integer countArticle(Integer categoryId);

    @Insert("insert into category (category_pid, category_name, category_description, category_icon) " +
            "values (#{categoryId},#{categoryName},#{categoryDescription},#{categoryIcon})")
    void add(CategoryDTO dto);

    @Delete("delete from category where category_id = #{id}")
    void delete(Integer id);

    @Select("select * from category where category_id = #{id}")
    Category selectById(Integer id);

    void update(CategoryDTO dto);
}
