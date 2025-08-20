package com.example.springboot_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotação básica que identifica o controlador como rest
public class HelloController {

    @GetMapping("/hello") // anotação que vai mapear uma operação GET no REST
    public String helloMessage() {
        return "Oi galera!!!!";
    }
}
