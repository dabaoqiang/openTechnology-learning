package com.dbq.service;

import com.dbq.mybatis.mapper.ArticleMapper;
import com.dbq.mybatis.model.Article;
import com.dbq.mybatis.model.ArticleExample;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by @author dabaoqiang on 2023/5/21.
 */
@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getAll() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public List<Article> listArticle(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public Article getOne(Long id) {
        return articleMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public void insert(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void update(Article article) {
        articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public void delete(Long id) {
        articleMapper.deleteByPrimaryKey(id.intValue());
    }
}
