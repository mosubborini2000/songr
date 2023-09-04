package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("message");
        return "hello.html";
    }

//    @GetMapping("/capitalize/{text}")
//    public String upperCase(Model m, @PathVariable String text) {
//        m.addAttribute("name", text.toUpperCase());
//        return "upperCase.html";
//    }



}
