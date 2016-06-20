
package com.test.z.weather_android.model.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AccuCc {

    @SerializedName("EpochTime")
    @Expose
    private String epochTime;
    @SerializedName("LocalObservationDateTime")
    @Expose
    private String localObservationDateTime;
    @SerializedName("Pressure")
    @Expose
    private String pressure;
    @SerializedName("RealFeelTemperature")
    @Expose
    private String realFeelTemperature;
    @SerializedName("RelativeHumidity")
    @Expose
    private String relativeHumidity;
    @SerializedName("UVIndex")
    @Expose
    private String uVIndex;
    @SerializedName("Visibility")
    @Expose
    private String visibility;
    @SerializedName("WindDirectionDegrees")
    @Expose
    private String windDirectionDegrees;
    @SerializedName("WindSpeed")
    @Expose
    private String windSpeed;

    /**
     * @return The epochTime
     */
    public String getEpochTime() {
        return epochTime;
    }

    /**
     * @param epochTime The EpochTime
     */
    public void setEpochTime(String epochTime) {
        this.epochTime = epochTime;
    }

    /**
     * @return The localObservationDateTime
     */
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    /**
     * @param localObservationDateTime The LocalObservationDateTime
     */
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    /**
     * @return The pressure
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * @param pressure The Pressure
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * @return The realFeelTemperature
     */
    public String getRealFeelTemperature() {
        return realFeelTemperature;
    }

    /**
     * @param realFeelTemperature The RealFeelTemperature
     */
    public void setRealFeelTemperature(String realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    /**
     * @return The relativeHumidity
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * @param relativeHumidity The RelativeHumidity
     */
    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * @return The uVIndex
     */
    public String getUVIndex() {
        return uVIndex;
    }

    /**
     * @param uVIndex The UVIndex
     */
    public void setUVIndex(String uVIndex) {
        this.uVIndex = uVIndex;
    }

    /**
     * @return The visibility
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * @param visibility The Visibility
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * @return The windDirectionDegrees
     */
    public String getWindDirectionDegrees() {
        return windDirectionDegrees;
    }

    /**
     * @param windDirectionDegrees The WindDirectionDegrees
     */
    public void setWindDirectionDegrees(String windDirectionDegrees) {
        this.windDirectionDegrees = windDirectionDegrees;
    }

    /**
     * @return The windSpeed
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed The WindSpeed
     */
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

}
