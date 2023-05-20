package com.dbq.controller;

import com.dbq.common.Result;
import com.dbq.entity.Article;
import com.dbq.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by @author dabaoqiang on 2023/5/20.
 */
@RestController
@RequestMapping("/api")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @PostMapping(path = "/v1/article")
    public Result addArticle(@RequestParam String author, @RequestParam String title) {
        Article n = new Article();
        n.setAuthor(author);
        n.setTitle(title);
        articleService.insert(n);
        return Result.success(n);
    }

    @GetMapping(path = "/v1/article/{id}")
    public Result addArticle(@PathVariable(value = "id") Long id) {
        return Result.success(articleService.getOne(id));
    }
}
