package com.coolweather.android.db;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("City")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
