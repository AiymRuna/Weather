package com.example.user.weather5;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelWeatherForecast {

    @SerializedName("list")
    private List<ModelWeatherDay> items;

    public ModelWeatherForecast(List<ModelWeatherDay> items) {
        this.items = items;
    }

    public List<ModelWeatherDay> getItems() {
        return items;
    }
}
