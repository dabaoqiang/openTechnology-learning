package com.dbq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

/**
 * Created by @author dabaoqiang on 2023/5/22.
 * @PathVariable path检验
 * @RequestParam 请求参数校验
 */
@RestController
@RequestMapping("/api")
@Validated
public class BookControllerV2 {

    @GetMapping("/v1/book/{id}")
    public ResponseEntity<Integer> getPersonByID(@Valid @PathVariable("id") @Max(value = 110000, message = "超过 id 的范围了") Integer id) {
        return ResponseEntity.ok().body(id);
    }

    @GetMapping("/v1/book")
    public ResponseEntity<String> getPersonByName(@Valid @RequestParam("name") @NotEmpty(message = "name不能为空") String name) {
        return ResponseEntity.ok().body(name);
    }

}


