package com.blog.myblog.mapper;

import com.blog.myblog.DTO.LoginDTO;
import com.blog.myblog.DTO.RegisterDTO;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("select * from user where user_name = #{username}")
    User login(LoginDTO dto);

    @Insert("insert into user (user_name, user_pass, user_avatar, user_role, user_register_time, user_last_login_time) values " +
            "(#{userName},#{password},#{userAvatar}, 1, NOW(),NOW())")
    void register(RegisterDTO dto);

    @Select("select * from user where id = #{id}")
    User selectUser(Integer id);

    void update(User user);
}
