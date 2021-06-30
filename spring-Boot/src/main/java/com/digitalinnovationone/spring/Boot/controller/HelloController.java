package com.digitalinnovationone.spring.Boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloMessage(){
        return "Hello, Digital Innovation one!";
    }
}
