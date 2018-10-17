package com.vonzhou.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version 2018/5/16.
 */
public class PatternDemo1 {
    public static void main(String[] args) {
        func("abc.efg.json");
        func("abc.efg......json");
    }

    public static void func(String s){
        Pattern pattern = Pattern.compile("(.*)\\Q.\\E.*");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }
    }
}
