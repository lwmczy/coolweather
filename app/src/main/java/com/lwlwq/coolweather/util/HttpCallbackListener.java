package com.lwlwq.coolweather.util;

/**
 * Created by L on 2016/4/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
