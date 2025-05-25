package com.blog.myblog.service.impl;

import com.blog.myblog.entity.MessageBoard;
import com.blog.myblog.mapper.MessageBoardMapper;
import com.blog.myblog.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageBoardServiceImpl implements MessageBoardService {

    @Autowired
    private MessageBoardMapper messageBoardMapper;
    @Override
    public void addMessageBoard(MessageBoard messageBoard) {
        messageBoardMapper.insertMessageBoard(messageBoard);
    }

    @Override
    public List<MessageBoard> listMessageBoard() {
        messageBoardMapper.listMessageBoard();
    }
}
