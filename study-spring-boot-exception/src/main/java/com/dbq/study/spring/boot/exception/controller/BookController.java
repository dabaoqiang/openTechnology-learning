package com.dbq.study.spring.boot.exception.controller;

import com.dbq.study.spring.boot.exception.common.Result;
import com.dbq.study.spring.boot.exception.entity.Book;
import com.dbq.study.spring.boot.exception.error.BusinessException;
import com.dbq.study.spring.boot.exception.error.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @author dabaoqiang on 2023/5/17.
 */
@RestController
@RequestMapping("/api")
public class BookController {

    @GetMapping("/v1/resourceNotFound")
    public Result throwResourceNotFoundException() {
        Book p = new Book("xq", "dbq");
        throw new ResourceNotFoundException();
    }


    @GetMapping("/v1/books/error/{id}")
    public Result throwBusinessException() {
        Book book = new Book("xq", "dbq");
        throw new BusinessException("书籍为空");
    }

    @GetMapping("/v1/books/{id}")
    public Result getUserPath() {
        Book book = new Book("xq", "dbq");
        return Result.success(book);
    }

}
