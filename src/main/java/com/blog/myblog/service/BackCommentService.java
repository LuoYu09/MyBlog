package com.blog.myblog.service;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.result.PageResult;

public interface BackCommentService {
    /**
     * 后台评论分页查询
     * @param dto
     * @return
     */
    PageResult pageQuery(PageQueryDTO dto);
}
