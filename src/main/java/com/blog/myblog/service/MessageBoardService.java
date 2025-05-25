package com.blog.myblog.service;

import com.blog.myblog.entity.MessageBoard;

import java.util.List;

public interface MessageBoardService {
    void addMessageBoard(MessageBoard messageBoard);

    List<MessageBoard> listMessageBoard();
}
