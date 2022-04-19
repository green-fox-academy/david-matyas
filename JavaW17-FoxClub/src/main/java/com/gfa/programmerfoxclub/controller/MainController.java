package com.gfa.programmerfoxclub.controller;

import com.gfa.programmerfoxclub.model.Drink;
import com.gfa.programmerfoxclub.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class MainController {
    @GetMapping("/")
    public String getIndex(Model model,
                           @RequestParam (value = "name", required = false) String name) {
        if(Objects.nonNull(name)){
            return "index";
        }
        return "redirect:/login";
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

    @GetMapping("nutritionStore")
    public String getStore(Model model,
                           @RequestParam (value = "name", required = false) String name){
        model.addAttribute("foods", Food.values());
        model.addAttribute("drinks", Drink.values());
        return "nutritionStore";
    }
}

