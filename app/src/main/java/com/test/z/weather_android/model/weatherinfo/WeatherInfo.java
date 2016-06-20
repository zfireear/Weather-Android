
package com.test.z.weather_android.model.weatherinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class WeatherInfo {

    @SerializedName("index")
    @Expose
    private List<Index> index = new ArrayList<Index>();
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("forecast")
    @Expose
    private List<Forecast> forecast = new ArrayList<Forecast>();
    @SerializedName("today")
    @Expose
    private Today today;
    @SerializedName("realtime")
    @Expose
    private Realtime realtime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("aqi")
    @Expose
    private Aqi aqi;
    @SerializedName("week")
    @Expose
    private String week;
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * @return The index
     */
    public List<Index> getIndex() {
        return index;
    }

    /**
     * @param index The index
     */
    public void setIndex(List<Index> index) {
        this.index = index;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return The forecast
     */
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * @param forecast The forecast
     */
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    /**
     * @return The today
     */
    public Today getToday() {
        return today;
    }

    /**
     * @param today The today
     */
    public void setToday(Today today) {
        this.today = today;
    }

    /**
     * @return The realtime
     */
    public Realtime getRealtime() {
        return realtime;
    }

    /**
     * @param realtime The realtime
     */
    public void setRealtime(Realtime realtime) {
        this.realtime = realtime;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The aqi
     */
    public Aqi getAqi() {
        return aqi;
    }

    /**
     * @param aqi The aqi
     */
    public void setAqi(Aqi aqi) {
        this.aqi = aqi;
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
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }

}
