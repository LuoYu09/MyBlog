package com.blog.myblog.service;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.DTO.ReplyCommentDTO;
import com.blog.myblog.result.PageResult;

public interface BackCommentService {
    /**
     * 后台评论分页查询
     * @param dto
     * @return
     */
    PageResult pageQuery(PageQueryDTO dto);

    /**
     * 后台回复评论
     * @param dto
     */
    void reply(ReplyCommentDTO dto);

    /**
     * 后台删除评论
     * @param id
     */
    void delete(Integer id);
}
