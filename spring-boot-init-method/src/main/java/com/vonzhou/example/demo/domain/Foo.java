package com.vonzhou.example.demo.domain;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.PostConstruct;

/**
 * @author vonzhou
 * @version 2018/9/17
 */
public class Foo implements InitializingBean, CommandLineRunner, ApplicationRunner {
    public void init() {
        System.out.println("init method ...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("init by PostConstruct ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init afterPropertiesSet ...");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("init by CommandLineRunner ...");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("init by ApplicationRunner ...");
    }
}
