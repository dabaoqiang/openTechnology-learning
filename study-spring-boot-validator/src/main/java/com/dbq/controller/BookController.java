package com.dbq.controller;

import com.dbq.entity.BookRequest;
import com.dbq.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Created by @author dabaoqiang on 2023/5/22.
 */
@RestController
@RequestMapping("/api")
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping("/v1/book")
    public ResponseEntity<BookRequest> save(@RequestBody @Valid BookRequest personRequest) {
        return ResponseEntity.ok().body(personRequest);
    }

    @PostMapping("/v2/book")
    public ResponseEntity<BookRequest> saveBookService(@RequestBody BookRequest bookRequest) {
        bookService.saveBook(bookRequest);
        return ResponseEntity.ok().body(bookRequest);
    }

}
