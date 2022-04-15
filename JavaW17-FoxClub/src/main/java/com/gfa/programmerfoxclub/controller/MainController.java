package com.gfa.programmerfoxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex(Model model,
                           @RequestParam (value = "name", required = false) String name) {
        return "index";
    }

    @GetMapping("login")
    public String getName() {
        return "login";
    }

    @PostMapping("login")
    public String setName(
            @RequestParam String name
                          ) {
        return "redirect:/?name=" + name;
    }
}

