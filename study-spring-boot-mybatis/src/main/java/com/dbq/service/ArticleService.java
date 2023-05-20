package com.dbq.service;

import com.dbq.entity.Article;

import java.util.List;

/**
 * Created by @author dabaoqiang on 2023/5/20.
 */
public interface ArticleService {

    List<Article> getAll();
    Article getOne(Long id);
    void insert(Article post);
    void update(Article post);
    void delete(Long id);
}
