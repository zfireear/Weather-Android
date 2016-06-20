
package com.test.z.weather_android.model.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Aqi {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private String cityId;
    @SerializedName("pub_time")
    @Expose
    private String pubTime;
    @SerializedName("aqi")
    @Expose
    private String aqi;
    @SerializedName("pm25")
    @Expose
    private String pm25;
    @SerializedName("pm10")
    @Expose
    private String pm10;
    @SerializedName("so2")
    @Expose
    private String so2;
    @SerializedName("no2")
    @Expose
    private String no2;
    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("spot")
    @Expose
    private String spot;

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * @param cityId The city_id
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * @return The pubTime
     */
    public String getPubTime() {
        return pubTime;
    }

    /**
     * @param pubTime The pub_time
     */
    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
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

    /**
     * @return The src
     */
    public String getSrc() {
        return src;
    }

    /**
     * @param src The src
     */
    public void setSrc(String src) {
        this.src = src;
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

}
