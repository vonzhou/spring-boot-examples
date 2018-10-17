package com.vonzhou.example.demo.config;

import com.vonzhou.example.demo.domain.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vonzhou
 * @version 2018/9/17
 */
@Configuration
public class BeanConfig {

    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }
}
