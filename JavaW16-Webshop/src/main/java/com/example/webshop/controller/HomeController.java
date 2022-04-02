package com.example.webshop.controller;

import com.example.webshop.WebshopApplication;
import com.example.webshop.model.WebShopItem;
import com.example.webshop.service.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model,
                           @RequestParam(value = "search", required = false) String search,
                           @RequestParam(value = "available", required = false) String available,
                           @RequestParam(value = "nike", required = false) String nike,
                           @RequestParam(value = "cheapest", required = false) String cheapest) {
        model.addAttribute("welcomeString", "David's first webshop");
        if (Objects.nonNull(search)) {
            model.addAttribute("items",
                    ShopItems.getItems().stream()
                            .filter(x -> x.getName().contains(search))
                            .collect(Collectors.toList()));
        } else if (Objects.nonNull(nike)) {
            model.addAttribute("items",
                    ShopItems.getItems().stream()
                            .filter(x -> x.getName().toLowerCase(Locale.ROOT).contains("nike") || x.getDescription().toLowerCase(Locale.ROOT).contains("nike"))
                            .collect(Collectors.toList()));
        } else if (Objects.nonNull(cheapest)) {
            model.addAttribute("items",
                    ShopItems.getItems().stream()
                            .sorted(Comparator.comparing(p -> p.getPrice()))
                            .collect(Collectors.toList()));
        } else if (Objects.nonNull(available)) {
            model.addAttribute("items",
                    ShopItems.getItems().stream()
                            .filter(x -> x.getOnStock() > 0)
                            .collect(Collectors.toList()));
        } else {
            model.addAttribute("items", ShopItems.getItems());
        }
        return "index";
    }
}
