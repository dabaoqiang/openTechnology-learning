package com.dbq.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.dbq.entity.Article;
import java.util.List;

/**
 * Created by @author dabaoqiang on 2023/5/20.
 */
@Mapper
public interface ArticleMapper {

    /**
     * insert
     * @param user
     */
    @Insert("INSERT INTO article(title,author) VALUES(#{title}, #{author})")
    void insertAnnotation(Article user);
    List<Article> getAll();
    Article getOne(Long id);
    void insert(Article post);
    void update(Article post);
    void delete(Long id);

}
