package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Splash {
    @GetMapping("/")

    public String home(Model model){

        model.addAttribute("message", "Welcome to the Home Page!");
        return "Splash.html";


    }


}
