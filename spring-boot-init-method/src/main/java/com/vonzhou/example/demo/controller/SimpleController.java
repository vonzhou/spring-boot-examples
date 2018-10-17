package com.vonzhou.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @version 2016/12/19.
 */
@RestController
public class SimpleController {

    @GetMapping("/hello")
    public Object hello() {
        return "Hello Spring Boot";
    }
}
