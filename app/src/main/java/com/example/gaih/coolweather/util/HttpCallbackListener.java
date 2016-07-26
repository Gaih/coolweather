package com.example.gaih.coolweather.util;

/**
 * Created by gaih on 2016/7/26.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
