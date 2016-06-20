
package com.test.z.weather_android.model.weatherinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Today {

    @SerializedName("wind_direction_start")
    @Expose
    private String windDirectionStart;
    @SerializedName("humidity_max")
    @Expose
    private Integer humidityMax;
    @SerializedName("humidity_min")
    @Expose
    private Integer humidityMin;
    @SerializedName("weather_start")
    @Expose
    private String weatherStart;
    @SerializedName("wind_max")
    @Expose
    private Integer windMax;
    @SerializedName("wind_min")
    @Expose
    private Integer windMin;
    @SerializedName("weather_end")
    @Expose
    private String weatherEnd;
    @SerializedName("wind_direction_end")
    @Expose
    private String windDirectionEnd;
    @SerializedName("temp_min")
    @Expose
    private Integer tempMin;
    @SerializedName("temp_max")
    @Expose
    private Integer tempMax;

    /**
     * @return The windDirectionStart
     */
    public String getWindDirectionStart() {
        return windDirectionStart;
    }

    /**
     * @param windDirectionStart The wind_direction_start
     */
    public void setWindDirectionStart(String windDirectionStart) {
        this.windDirectionStart = windDirectionStart;
    }

    /**
     * @return The humidityMax
     */
    public Integer getHumidityMax() {
        return humidityMax;
    }

    /**
     * @param humidityMax The humidity_max
     */
    public void setHumidityMax(Integer humidityMax) {
        this.humidityMax = humidityMax;
    }

    /**
     * @return The humidityMin
     */
    public Integer getHumidityMin() {
        return humidityMin;
    }

    /**
     * @param humidityMin The humidity_min
     */
    public void setHumidityMin(Integer humidityMin) {
        this.humidityMin = humidityMin;
    }

    /**
     * @return The weatherStart
     */
    public String getWeatherStart() {
        return weatherStart;
    }

    /**
     * @param weatherStart The weather_start
     */
    public void setWeatherStart(String weatherStart) {
        this.weatherStart = weatherStart;
    }

    /**
     * @return The windMax
     */
    public Integer getWindMax() {
        return windMax;
    }

    /**
     * @param windMax The wind_max
     */
    public void setWindMax(Integer windMax) {
        this.windMax = windMax;
    }

    /**
     * @return The windMin
     */
    public Integer getWindMin() {
        return windMin;
    }

    /**
     * @param windMin The wind_min
     */
    public void setWindMin(Integer windMin) {
        this.windMin = windMin;
    }

    /**
     * @return The weatherEnd
     */
    public String getWeatherEnd() {
        return weatherEnd;
    }

    /**
     * @param weatherEnd The weather_end
     */
    public void setWeatherEnd(String weatherEnd) {
        this.weatherEnd = weatherEnd;
    }

    /**
     * @return The windDirectionEnd
     */
    public String getWindDirectionEnd() {
        return windDirectionEnd;
    }

    /**
     * @param windDirectionEnd The wind_direction_end
     */
    public void setWindDirectionEnd(String windDirectionEnd) {
        this.windDirectionEnd = windDirectionEnd;
    }

    /**
     * @return The tempMin
     */
    public Integer getTempMin() {
        return tempMin;
    }

    /**
     * @param tempMin The temp_min
     */
    public void setTempMin(Integer tempMin) {
        this.tempMin = tempMin;
    }

    /**
     * @return The tempMax
     */
    public Integer getTempMax() {
        return tempMax;
    }

    /**
     * @param tempMax The temp_max
     */
    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

}
