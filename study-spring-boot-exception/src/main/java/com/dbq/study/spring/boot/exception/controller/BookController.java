package com.dbq.study.spring.boot.exception.controller;

import com.dbq.study.spring.boot.exception.entity.Book;
import com.dbq.study.spring.boot.exception.error.BusinessException;
import com.dbq.study.spring.boot.exception.error.ErrorCode;
import com.google.common.collect.ImmutableMap;
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
    public void throwException() {
        Book p = new Book("xq", "dbq");
        throw new BusinessException(ErrorCode.REQUEST_VALIDATION_FAILED,ImmutableMap.of("person name:", p.getName()));
//        throw new ResourceNotFoundException(ImmutableMap.of("person name:", p.getName()));
    }


}
