package com.blog.myblog.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DeletionNotAllowedException extends BaseException{
    public DeletionNotAllowedException(String msg){
        super(msg);
    }
}
