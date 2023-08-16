package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
    @getMapping("/")
    public String Welcome(){
        return "Welcome String Boot!";
    }

}
