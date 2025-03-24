package com.blog.myblog.service.impl;

import com.blog.myblog.DTO.ArticleDTO;
import com.blog.myblog.DTO.PageQueryDTO;
import com.blog.myblog.constant.MessageConstant;
import com.blog.myblog.context.BaseContext;
import com.blog.myblog.entity.Article;
import com.blog.myblog.entity.Category;
import com.blog.myblog.exception.CharCountException;
import com.blog.myblog.mapper.BackArticleMapper;
import com.blog.myblog.mapper.CategoryMapper;
import com.blog.myblog.result.PageResult;
import com.blog.myblog.service.BackArticleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BackArticleServiceImpl implements BackArticleService {
    @Autowired
    private BackArticleMapper backArticleMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 后台文章分页查询
     * @param dto
     * @return
     */
    @Override
    public PageResult pageQuery(PageQueryDTO dto) {
        PageHelper.startPage(dto.getPage(),dto.getPageSize());

        Page<Article> page = backArticleMapper.pageQuery(dto);

        PageResult result = new PageResult();

        result.setTotal(page.getTotal());
        result.setRecords(page.getResult());

        return result;
    }

    /**
     * 查询所有分类（不带文章数量）
     * @return
     */
    @Override
    public List<Category> listCategory() {
        return categoryMapper.getAllCate();
    }

    /**
     * 添加文章
     * @param dto
     */
    @Override
    @Transactional
    public void add(ArticleDTO dto) {
        if(dto.getArticleTitle().length() > 100 || (dto.getArticleSummary() != null && dto.getArticleSummary().length() > 250)){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        Article article = new Article();

        BeanUtils.copyProperties(dto,article);

        article.setArticleUserId(BaseContext.getCurrentId());
        article.setArticleStatus(0);
        article.setArticleLikeCount(0);
        article.setArticleCommentCount(0);
        article.setArticleViewCount(0);
        article.setArticleCreateTime(LocalDateTime.now());
        article.setArticleUpdateTime(LocalDateTime.now());

        backArticleMapper.add(article);

        Integer articleId = article.getArticleId();

        backArticleMapper.addRef(dto.getCategoryId(), articleId);
    }

    /**
     * 根据ID删除文章
     * @param id
     */
    @Override
    @Transactional
    public void deleteById(Integer id) {
        backArticleMapper.deleteById(id);

        backArticleMapper.deleteRef(id);
    }

    /**
     * 根据ID查询文章
     *
     * @param id
     * @return
     */
    @Override
    @Transactional
    public Article selectById(Integer id) {
        Article article = backArticleMapper.selectById(id);

        List<Category> categories = backArticleMapper.selectRefCategory(id);

        article.setCategoryList(categories);

        return article;
    }

    /**
     * 编辑文章
     * @param dto
     */
    @Override
    @Transactional
    public void updateArticle(ArticleDTO dto) {
        if((dto.getArticleTitle() != null && dto.getArticleTitle().length() > 100) || (dto.getArticleSummary() != null && dto.getArticleSummary().length() > 250)){
            throw new CharCountException(MessageConstant.CHAR_EXCEED_LIMIT);
        }

        Article article = new Article();

        BeanUtils.copyProperties(dto,article);

        article.setArticleUpdateTime(LocalDateTime.now());

        backArticleMapper.update(article);

        backArticleMapper.deleteRef(dto.getArticleId());

        backArticleMapper.addRef(dto.getCategoryId(),dto.getArticleId());
    }
}
