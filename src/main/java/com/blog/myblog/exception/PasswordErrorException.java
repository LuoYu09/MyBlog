package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PasswordErrorException extends RuntimeException{
    public PasswordErrorException(String msg){
        super(msg);
    }
}
