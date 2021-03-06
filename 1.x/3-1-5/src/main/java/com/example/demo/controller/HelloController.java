package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 胡佳伟
 * @version : 1.0.0
 * @date : 2021/8/17
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
