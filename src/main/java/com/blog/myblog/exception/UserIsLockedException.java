package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserIsLockedException extends RuntimeException{
    public UserIsLockedException(String msg){
        super(msg);
    }
}
