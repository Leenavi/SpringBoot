package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String hi(Model model) {
        model.addAttribute("username", "hongpark");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username", "hongpark");
        return "goodbye";
    }
}
