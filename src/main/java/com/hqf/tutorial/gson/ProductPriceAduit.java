package com.hqf.tutorial.gson;

import java.util.List;

/**
 * Created by huoquanfu on 2016/4/20.
 */
public class ProductPriceAduit {
    @com.google.gson.annotations.SerializedName("product_price_id")
    private int productPriceId;

    @com.google.gson.annotations.SerializedName("product_id")
    private int productId;

    @com.google.gson.annotations.SerializedName("product_services")
    private List<ProductService> productServices;

    public List<CityAreas> getCityAreas() {
        return cityAreas;
    }

    public void setCityAreas(List<CityAreas> cityAreas) {
        this.cityAreas = cityAreas;
    }

    public List<ProductService> getProductServices() {
        return productServices;
    }

    public void setProductServices(List<ProductService> productServices) {
        this.productServices = productServices;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductPriceId() {
        return productPriceId;
    }

    public void setProductPriceId(int productPriceId) {
        this.productPriceId = productPriceId;
    }

    @com.google.gson.annotations.SerializedName("city_areas")
    private List<CityAreas> cityAreas;

}
