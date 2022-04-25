package com.gfa.dependeciesexcersies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {
    @GetMapping("/useful")
    public String getUseful(Model model,
                            @RequestParam(value = "colored", required = false) String colored) {
        model.addAttribute("welcome");

        return "useful";

    }
}
