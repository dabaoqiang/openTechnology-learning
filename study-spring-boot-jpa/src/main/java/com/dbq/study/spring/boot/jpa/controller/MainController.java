package com.dbq.study.spring.boot.jpa.controller;

import com.dbq.study.spring.boot.jpa.common.Result;
import com.dbq.study.spring.boot.jpa.dao.UserRepository;
import com.dbq.study.spring.boot.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by @author dabaoqiang on 2023/5/18.
 */
@RestController
@RequestMapping(value = "/api")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/v1/users")
    public Result addNewUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return Result.success(n);
    }

    @GetMapping(path = "/v1/users")
    public Result getAllUsers() {
        return Result.success(userRepository.findAll());
    }

}
