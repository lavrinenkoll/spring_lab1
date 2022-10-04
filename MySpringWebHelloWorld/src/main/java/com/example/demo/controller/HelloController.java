package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String helloworld() {
        return "Hello, World!";
    }

    @RequestMapping("/julia")
    public String julia(Model model) {
        return "Julia.html";
    }

    @RequestMapping("/denis")
    public String denis(Model model) {
        return "Julia.html";
    }

    @RequestMapping("/team")
    public String team(Model model) {
        return "Julia.html";
    }
}


