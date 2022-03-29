package com.example.webshop.service;

import com.example.webshop.model.WebShopItem;

import java.util.*;

public class ShopItems {
    private static List<WebShopItem> items = new ArrayList<>(
            List.of(new WebShopItem(
                    "Running shoes",
                    "Nike running shoes for every night sport",
                    1000.0,
                    5),
                    new WebShopItem(
                            "Printer",
                            "Some HP printer that will sometimes print",
                            3000.0,
                            2),
                    new WebShopItem(
                            "Coca cola",
                            "0.5 vintage coke",
                            25.0,
                            0),
                    new WebShopItem(
                            "Wokin",
                            "Chicken with fried rice and WOKIN sauce",
                            119.0,
                            100),
                    new WebShopItem(
                            "T-shirt",
                            "Blue with a corn on bike",
                            300.0,
                            1)
            )
    );

    public static List<WebShopItem> getItems() {
        return items;
    }


}

