package com.dbq.service.impl;

import com.dbq.entity.Article;
import com.dbq.mybatis.ArticleMapper;
import com.dbq.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by @author dabaoqiang on 2023/5/20.
 */
@Service
public class ArticleServiceimpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> getAll() {
        return articleMapper.getAll();
    }

    @Override
    public Article getOne(Long id) {
        return articleMapper.getOne(id);
    }

    @Override
    public void insert(Article post) {
        articleMapper.insert(post);
    }

    @Override
    public void update(Article post) {
        articleMapper.update(post);
    }

    @Override
    public void delete(Long id) {
        articleMapper.delete(id);
    }
}
