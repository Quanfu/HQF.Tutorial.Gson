package com.hqf.tutorial.gson;

public class ProductService {
    @com.google.gson.annotations.SerializedName("product_service_Id")
    private int productServiceId;

    @com.google.gson.annotations.SerializedName("is_required")
    private Boolean isRequired;

    @com.google.gson.annotations.SerializedName("stock")
    private int stock;

    @com.google.gson.annotations.SerializedName("price")
    private int price;

    @com.google.gson.annotations.SerializedName("original_price")
    private int originalPrice;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public int getProductServiceId() {
        return productServiceId;
    }

    public void setProductServiceId(int productServiceId) {
        this.productServiceId = productServiceId;
    }

    @com.google.gson.annotations.SerializedName("cost")
    private int cost;


}
