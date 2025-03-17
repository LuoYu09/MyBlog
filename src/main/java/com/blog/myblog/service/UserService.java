package com.blog.myblog.service;

import com.blog.myblog.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(Integer userId);

    List<User> getAllUser();

    void saveImage(String imageUrl,Integer userId);
}
