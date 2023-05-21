package com.dbq.service;

import com.dbq.mybatis.model.Article;

import java.util.List;

/**
 * Created by @author dabaoqiang on 2023/5/21.
 */
public interface ArticleService {

    List<Article> getAll();
    List<Article> listArticle(int pageNum, int pageSize);
    Article getOne(Long id);
    void insert(Article article);
    void update(Article article);
    void delete(Long id);

}
