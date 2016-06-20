
package com.test.z.weather_android.model.weatherinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Realtime {

    @SerializedName("weather")
    @Expose
    private String weather;
    @SerializedName("wind_speed")
    @Expose
    private String windSpeed;
    @SerializedName("wind_direction")
    @Expose
    private String windDirection;
    @SerializedName("humidity")
    @Expose
    private String humidity;
    @SerializedName("temp")
    @Expose
    private String temp;
    @SerializedName("time")
    @Expose
    private String time;

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
     * @return The windSpeed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed The wind_speed
     */
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return The windDirection
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * @param windDirection The wind_direction
     */
    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    /**
     * @return The humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
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

}
