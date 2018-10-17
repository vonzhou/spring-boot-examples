package com.vonzhou.example.demo;

/**
 * @version 2018/5/16.
 */
public class AntPathMatcherTest1 {
    public static void main(String[] args) {
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        AntPathMatcher.AntPathStringMatcher stringMatcher = antPathMatcher.getStringMatcher("product");
        System.out.println(stringMatcher.getPattern());

        stringMatcher = antPathMatcher.getStringMatcher("{productJson}.*");
        System.out.println(stringMatcher.getPattern());

        stringMatcher = antPathMatcher.getStringMatcher("{productJson}:.+");
        System.out.println(stringMatcher.getPattern());
    }
}
