package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.DTO.ReplyCommentDTO;
import com.blog.myblog.entity.Comment;
import com.blog.myblog.entity.User;
import com.blog.myblog.mapper.AdminMapper;
import com.blog.myblog.mapper.BackCommentMapper;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.service.BackCommentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackCommentServiceImpl implements BackCommentService {
    @Autowired
    private BackCommentMapper backCommentMapper;
    @Autowired
    private AdminMapper adminMapper;

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

    /**
     * 后台回复评论
     * @param dto
     */
    @Override
    public void reply(ReplyCommentDTO dto) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(dto, comment);

        User user = adminMapper.selectUser(comment.getUserId());
        comment.setUserName(user.getUserName());
        comment.setUserAvatar(user.getUserAvatar());

        backCommentMapper.addComment(comment);
    }

    /**
     * 后台删除评论
     * @param id
     */
    @Override
    public void delete(Integer id) {
        Comment comment = backCommentMapper.selectById(id);

        backCommentMapper.deleteById(id);

        if(comment.getParentArticleId() != null){
            backCommentMapper.deleteByParentCommentId(comment.getId());
        }
    }
}
