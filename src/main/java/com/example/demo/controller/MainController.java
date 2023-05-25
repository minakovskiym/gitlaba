package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Hello, Mikhail Minakovskiy! Today is " +LocalDate.now().toString();
    }

}
