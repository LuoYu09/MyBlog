package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.entity.Comment;
import com.blog.myblog.mapper.BackCommentMapper;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.service.BackCommentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackCommentServiceImpl implements BackCommentService {
    @Autowired
    private BackCommentMapper backCommentMapper;

    /**
     * 后台评论分页查询
     * @param dto
     * @return
     */
    @Override
    public PageResult pageQuery(PageQueryDTO dto) {
        PageHelper.startPage(dto.getPage(), dto.getPageSize());

        Page<Comment> page = backCommentMapper.pageQuery();

        Long total = page.getTotal();
        List<Comment> list = page.getResult();

        for (Comment comment : list) {
            comment.setSubComments(backCommentMapper.selectSubComments(comment.getId()));
        }

        return new PageResult(total, list);
    }
}
