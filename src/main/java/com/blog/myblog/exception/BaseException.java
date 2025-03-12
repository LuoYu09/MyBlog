package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BaseException extends RuntimeException{
    public BaseException(String msg){
        super(msg);
    }
}
