
package com.test.z.weather_android.model.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AccuF5 {

    @SerializedName("EffectiveEpochDate")
    @Expose
    private String effectiveEpochDate;
    @SerializedName("EffectiveDate")
    @Expose
    private String effectiveDate;
    @SerializedName("DailyForecasts")
    @Expose
    private List<DailyForecast> dailyForecasts = new ArrayList<DailyForecast>();

    /**
     * @return The effectiveEpochDate
     */
    public String getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    /**
     * @param effectiveEpochDate The EffectiveEpochDate
     */
    public void setEffectiveEpochDate(String effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    /**
     * @return The effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate The EffectiveDate
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * @return The dailyForecasts
     */
    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    /**
     * @param dailyForecasts The DailyForecasts
     */
    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

}
