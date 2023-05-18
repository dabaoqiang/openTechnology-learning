package com.dbq.study.spring.boot.restful.controller;

import com.dbq.study.spring.boot.restful.common.Result;
import com.dbq.study.spring.boot.restful.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by @author dabaoqiang on 2023/5/16.
 */
@RestController
@RequestMapping("/api")
public class BookController {

    private List<Book> books = new ArrayList<>();

    @PostMapping("/v1/books")
    public Result<List<Book>> addBook(@RequestBody Book book) {
        books.add(book);
        return Result.success(books);
    }

    @DeleteMapping("/v1/books/{id}")
    public Result deleteBookById(@PathVariable("id") int id) {
        books.remove(id);
        return Result.success(books);
    }

    @GetMapping("/v1/books")
    public Result getBookByName(@RequestParam("name") String name) {
        List<Book> results = books.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
        return Result.success(results);
    }
}
