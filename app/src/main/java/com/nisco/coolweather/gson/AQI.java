package com.nisco.coolweather.gson;

/**
 * Created by cathy on 2017/6/8.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
