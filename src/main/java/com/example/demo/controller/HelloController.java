package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

// http://localhost:8080/hello
// http://localhost:8080/hello?nickname=zhangsan&phone=123
    @GetMapping("/hello")
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "hello" + nickname;
    }
}
