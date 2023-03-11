package com.lab1.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SignUpController {
    @GetMapping("/index")
    public String home() {
        return "/index";
    }

}
