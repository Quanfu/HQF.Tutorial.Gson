package com.hqf.tutorial.gson;

public class CityAreas {
    @com.google.gson.annotations.SerializedName("city_area_id")
    private int cityAreaId;

    private String  name;

    private String fullName;

    public int getCityAreaId() {
        return cityAreaId;
    }

    public void setCityAreaId(int cityAreaId) {
        this.cityAreaId = cityAreaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
