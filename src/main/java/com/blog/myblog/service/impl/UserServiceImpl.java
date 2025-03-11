package com.blog.myblog.service.impl;


import com.blog.myblog.entity.User;
import com.blog.myblog.mapper.UserMapper;
import com.blog.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser() ;
    }
}
