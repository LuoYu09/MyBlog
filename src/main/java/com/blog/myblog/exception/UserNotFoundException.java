package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserNotFoundException extends BaseException{
    public UserNotFoundException(String msg){
        super(msg);
    }
}
