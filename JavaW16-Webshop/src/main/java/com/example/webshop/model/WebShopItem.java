package com.example.webshop.model;

public class WebShopItem {
    private String name;
    private String description;
    private Double price;
    private int onStock;

    public WebShopItem(String name, String description, Double price, int onStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.onStock = onStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getOnStock() {
        return onStock;
    }

    public void setOnStock(int onStock) {
        this.onStock = onStock;
    }
}
