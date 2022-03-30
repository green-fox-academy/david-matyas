package com.example.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebshopItemController {
    @GetMapping("/addItem")
    public String getItemForm() {
    return "addItem";
    }
}
