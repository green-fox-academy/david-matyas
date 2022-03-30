package com.example.webshop.controller;

import com.example.webshop.model.WebShopItem;
import com.example.webshop.service.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class WebshopItemController {
    @GetMapping("/addItem")
    public String getItemForm() {
        return "addItem";
    }

    @GetMapping("/detail/{item}")
    public String getDetail(Model model,
                            @PathVariable("item") Integer itemId) {
model.addAttribute("item",ShopItems.getItems().get(itemId));
        return "detail";
    }

    @PostMapping("/addItem")
    public String addItem(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam Double price,
            @RequestParam int onStock
    ) {
        WebShopItem item = new WebShopItem(
                name,
                description,
                price,
                onStock       );
        ShopItems.getItems().add(item);
        return "redirect:/";
    }
}
