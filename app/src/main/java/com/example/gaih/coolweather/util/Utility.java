package com.example.gaih.coolweather.util;

import android.text.TextUtils;

import com.example.gaih.coolweather.db.CoolWeatherDb;
import com.example.gaih.coolweather.model.City;
import com.example.gaih.coolweather.model.Country;
import com.example.gaih.coolweather.model.Province;

/**
 * Created by gaih on 2016/7/26.
 */

public class Utility {
    public synchronized static boolean handleProvincesResponse(CoolWeatherDb coolWeatherDb,String response){
        if(!TextUtils.isEmpty(response)){
            String[] allProvinces = response.split(",");
            if(allProvinces!=null&&allProvinces.length>0){
                for (String p :allProvinces){
                    String[] array = p.split("\\|");
                    Province province = new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    coolWeatherDb.saveProvince(province);
                }
                return true;
            }
        }
        return false;
    }
    public static boolean handleCitiesResponse(CoolWeatherDb coolWeatherDb,String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            String[]allCities = response.split(",");
            if(allCities !=null&&allCities.length>0){
                for (String c : allCities){
                    String[] array = c.split("\\|");
                    City city = new City();
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(provinceId);
                    coolWeatherDb.saveCity(city);
                }
                return true;
            }
        }
        return false;
    }
    public static boolean handleCountiesResponse(CoolWeatherDb coolWeatherDb,String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            String[] allCounties = response.split(",");
            if(allCounties!=null&&allCounties.length>0){
                for(String c : allCounties){
                    String[] array = c.split("\\|");
                    Country country = new Country();
                    country.setCountryCode(array[0]);
                    country.setCountryName(array[1]);
                    country.setCityId(cityId);
                    coolWeatherDb.saveCountry(country);
                }
                return true;
            }
        }
        return false;
    }
}
