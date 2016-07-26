package com.example.gaih.coolweather.model;

/**
 * Created by gaih on 2016/7/25.
 */

public class Country {
    private int id;
    private String countryName;
    private String CountryCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getCountryCode() {
        return CountryCode;
    }
}
