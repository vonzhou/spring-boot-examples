package com.vonzhou.example.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vonzhou.example.demo.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 2016/12/19.
 */
@RestController
public class ProductController {

    @PostMapping("/product/{productJson}")
    public Object addProduct(@PathVariable String productJson) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Product p = mapper.readValue(productJson, Product.class);

            // add p ....
            System.out.println(p);
            return "ok";
        } catch (Exception e) {
            System.out.println("failed: " + e);
        }
        return "error";
    }

//    @PostMapping("/product/{productJson:.+}")
//    public Object addProduct(@PathVariable String productJson) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            Product p = mapper.readValue(productJson, Product.class);
//
//            // add p ....
//            System.out.println(p);
//            return "ok";
//        } catch (Exception e) {
//            System.out.println("failed: " + e);
//        }
//        return "error";
//    }
}
