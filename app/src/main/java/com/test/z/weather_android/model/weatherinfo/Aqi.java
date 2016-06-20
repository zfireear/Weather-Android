
package com.test.z.weather_android.model.weatherinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Aqi {

    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("spot")
    @Expose
    private String spot;
    @SerializedName("pm10")
    @Expose
    private String pm10;
    @SerializedName("pm25")
    @Expose
    private String pm25;
    @SerializedName("aqi")
    @Expose
    private String aqi;
    @SerializedName("so2")
    @Expose
    private String so2;
    @SerializedName("no2")
    @Expose
    private String no2;

    /**
     * @return The source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return The spot
     */
    public String getSpot() {
        return spot;
    }

    /**
     * @param spot The spot
     */
    public void setSpot(String spot) {
        this.spot = spot;
    }

    /**
     * @return The pm10
     */
    public String getPm10() {
        return pm10;
    }

    /**
     * @param pm10 The pm10
     */
    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return The pm25
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * @param pm25 The pm25
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * @return The aqi
     */
    public String getAqi() {
        return aqi;
    }

    /**
     * @param aqi The aqi
     */
    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    /**
     * @return The so2
     */
    public String getSo2() {
        return so2;
    }

    /**
     * @param so2 The so2
     */
    public void setSo2(String so2) {
        this.so2 = so2;
    }

    /**
     * @return The no2
     */
    public String getNo2() {
        return no2;
    }

    /**
     * @param no2 The no2
     */
    public void setNo2(String no2) {
        this.no2 = no2;
    }

}
