package com.example.social_network.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ListIterator;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "time-line";
    }
}
