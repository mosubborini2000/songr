package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class Capitalize {

    @GetMapping("/capitalize/{text}")
    public String upperCase2(Model model, @PathVariable String text) {
        String capitalizedText = text.toUpperCase();
        model.addAttribute("message", capitalizedText);
        return "upperCase.html";
    }
}
