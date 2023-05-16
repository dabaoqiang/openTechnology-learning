package com.dbq.study.spring.boot.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @author dabaoqiang on 2023/5/16.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/api/v1/helloWorld")
    public String helloWorld(){
        return "hello World";
    }

}
