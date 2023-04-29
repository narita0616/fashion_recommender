package com.example.fashion_recommender.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class FashinRecomendController {
    @GetMapping("/home")
    public String getHome(Model model){

        model.addAttribute("message", LocalDateTime.now().toString());
        return "home.html";
    }
    @GetMapping("/sample1")
    public String getSample1(Model model){

        model.addAttribute("message", "Sample1 Page");
        return "sample1.html";
    }
    @GetMapping("/sample2")
    public String get(Model model) {

        model.addAttribute("message", "sample2 Page");
        return "sample2.html";
    }
}
