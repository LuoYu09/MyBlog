package com.blog.myblog.mapper;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

    @Select("select * from user where user_name = #{username}")
    User login(LoginDTO dto);
}
