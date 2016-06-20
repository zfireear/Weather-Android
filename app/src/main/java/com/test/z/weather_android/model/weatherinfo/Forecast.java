
package com.test.z.weather_android.model.weatherinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Forecast {

    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("temp")
    @Expose
    private String temp;
    @SerializedName("wind_detail")
    @Expose
    private String windDetail;
    @SerializedName("week")
    @Expose
    private String week;
    @SerializedName("wind")
    @Expose
    private String wind;

    /**
     * @return The weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * @param weather The weather
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
     * @return The temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp The temp
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }

    /**
     * @return The windDetail
     */
    public String getWindDetail() {
        return windDetail;
    }

    /**
     * @param windDetail The wind_detail
     */
    public void setWindDetail(String windDetail) {
        this.windDetail = windDetail;
    }

    /**
     * @return The week
     */
    public String getWeek() {
        return week;
    }

    /**
     * @param week The week
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * @return The wind
     */
    public String getWind() {
        return wind;
    }

    /**
     * @param wind The wind
     */
    public void setWind(String wind) {
        this.wind = wind;
    }

}
