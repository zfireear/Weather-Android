
package com.test.z.weather_android.model.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class WeatherTest {

    @SerializedName("forecast")
    @Expose
    private Forecast forecast;
    @SerializedName("realtime")
    @Expose
    private Realtime realtime;
    @SerializedName("alert")
    @Expose
    private List<Object> alert = new ArrayList<Object>();
    @SerializedName("aqi")
    @Expose
    private Aqi aqi;
    @SerializedName("index")
    @Expose
    private List<Index> index = new ArrayList<Index>();
    @SerializedName("accu_cc")
    @Expose
    private AccuCc accuCc;
    @SerializedName("accu_f5")
    @Expose
    private AccuF5 accuF5;
    @SerializedName("today")
    @Expose
    private Today today;
    @SerializedName("yestoday")
    @Expose
    private Yestoday yestoday;

    /**
     * @return The forecast
     */
    public Forecast getForecast() {
        return forecast;
    }

    /**
     * @param forecast The forecast
     */
    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
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
     * @return The alert
     */
    public List<Object> getAlert() {
        return alert;
    }

    /**
     * @param alert The alert
     */
    public void setAlert(List<Object> alert) {
        this.alert = alert;
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
     * @return The accuCc
     */
    public AccuCc getAccuCc() {
        return accuCc;
    }

    /**
     * @param accuCc The accu_cc
     */
    public void setAccuCc(AccuCc accuCc) {
        this.accuCc = accuCc;
    }

    /**
     * @return The accuF5
     */
    public AccuF5 getAccuF5() {
        return accuF5;
    }

    /**
     * @param accuF5 The accu_f5
     */
    public void setAccuF5(AccuF5 accuF5) {
        this.accuF5 = accuF5;
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
     * @return The yestoday
     */
    public Yestoday getYestoday() {
        return yestoday;
    }

    /**
     * @param yestoday The yestoday
     */
    public void setYestoday(Yestoday yestoday) {
        this.yestoday = yestoday;
    }

}
