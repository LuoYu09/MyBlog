package com.blog.myblog.mapper;

import com.blog.myblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(Integer userId);

    List<User> getAllUser();

    void saveImage(String imageUrl,Integer userId);
}
