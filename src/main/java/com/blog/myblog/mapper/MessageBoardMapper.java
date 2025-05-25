package com.blog.myblog.mapper;

import com.blog.myblog.entity.MessageBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageBoardMapper {
    void insertMessageBoard(MessageBoard messageBoard);

    @Select("select * from message_board")
    List<MessageBoard> listMessageBoard();
}
