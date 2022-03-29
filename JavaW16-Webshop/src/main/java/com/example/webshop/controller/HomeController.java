package com.example.webshop.controller;

import com.example.webshop.WebshopApplication;
import com.example.webshop.model.WebShopItem;
import com.example.webshop.service.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("welcomeString","David's first webshop");
        model.addAttribute("items", ShopItems.getItems());
        return  "index";
    }
}
