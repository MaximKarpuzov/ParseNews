package com.news.parsenews.controllers;

import com.news.parsenews.controllers.news.Article;
import com.news.parsenews.controllers.news.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) throws IOException {

        List<Article> artlist = new ArrayList<>();
        List<Article> list = Method.artList(artlist);
        //Article art = new Article("q","q", "e");

        model.addAttribute("title", list);
        return "greeting";
    }

}
