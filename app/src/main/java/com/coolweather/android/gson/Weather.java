package com.coolweather.android.gson;

import com.coolweather.android.db.Basic;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather<ListForecast> {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecasts;
}
