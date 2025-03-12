package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PasswordErrorException extends BaseException{
    public PasswordErrorException(String msg){
        super(msg);
    }
}
