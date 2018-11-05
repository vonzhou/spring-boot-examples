package com.vonzhou.example.controller;

import com.vonzhou.example.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @version 2016/12/19.
 */
@RestController
public class SimpleController {

    @Autowired
    private LoggingService loggingService;

    @GetMapping("/hello")
    public Object hello() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                loggingService.log();
            }
        }).start();
        return "Hello Spring Boot";
    }
}
