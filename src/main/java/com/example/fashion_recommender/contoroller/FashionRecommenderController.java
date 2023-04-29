package com.example.fashion_recommender.contoroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FashionRecommenderController {

    @GetMapping("/top")
    public String getTop(Model model){
        model.addAttribute("title", "検索フォーム");
        return "top.html";
    }
}
