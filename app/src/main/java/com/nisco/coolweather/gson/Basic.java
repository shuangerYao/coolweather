package com.nisco.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cathy on 2017/6/8.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
