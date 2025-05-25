package com.blog.myblog.controller.home;

import com.blog.myblog.entity.MessageBoard;
import com.blog.myblog.result.Result;
import com.blog.myblog.service.MessageBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home/messageBoard")
@Slf4j
public class MessageBoardController {
    @Autowired
    private MessageBoardService messageBoardService;

    /**留言板功能，通过用户id传入写入内容，并存入数据库*/
    @PostMapping("/add")
    public Result addMessageBoard(@RequestBody MessageBoard messageBoard){
        log.info("留言板功能，通过用户id传入写入内容，并存入数据库,内容为：{}",messageBoard);
        messageBoardService.addMessageBoard(messageBoard);
        return Result.success();
    }

    /**查询出所有留言内容*/
    @GetMapping("/list")
    public Result<List<MessageBoard>> listMessageBoard(){
        log.info("查询出所有留言内容");
        List<MessageBoard> messageBoardList = messageBoardService.listMessageBoard();
        return Result.success(messageBoardList);
    }
}
