package com.gp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExpController {
    
    @GetMapping
    public String getMessages() {
        return "working...";
    }

}
