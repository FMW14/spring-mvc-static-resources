package com.bjartscular.example.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("timestamp", LocalDateTime.now());
        return "index";
    }
}
