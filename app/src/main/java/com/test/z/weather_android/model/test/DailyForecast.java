
package com.test.z.weather_android.model.test;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DailyForecast {

    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("EpochDate")
    @Expose
    private String epochDate;
    @SerializedName("Sun_Rise")
    @Expose
    private String sunRise;
    @SerializedName("Sun_EpochRise")
    @Expose
    private String sunEpochRise;
    @SerializedName("Sun_Set")
    @Expose
    private String sunSet;
    @SerializedName("Sun_EpochSet")
    @Expose
    private String sunEpochSet;
    @SerializedName("PrecipitationProbability")
    @Expose
    private String precipitationProbability;

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The Date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return The epochDate
     */
    public String getEpochDate() {
        return epochDate;
    }

    /**
     * @param epochDate The EpochDate
     */
    public void setEpochDate(String epochDate) {
        this.epochDate = epochDate;
    }

    /**
     * @return The sunRise
     */
    public String getSunRise() {
        return sunRise;
    }

    /**
     * @param sunRise The Sun_Rise
     */
    public void setSunRise(String sunRise) {
        this.sunRise = sunRise;
    }

    /**
     * @return The sunEpochRise
     */
    public String getSunEpochRise() {
        return sunEpochRise;
    }

    /**
     * @param sunEpochRise The Sun_EpochRise
     */
    public void setSunEpochRise(String sunEpochRise) {
        this.sunEpochRise = sunEpochRise;
    }

    /**
     * @return The sunSet
     */
    public String getSunSet() {
        return sunSet;
    }

    /**
     * @param sunSet The Sun_Set
     */
    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    /**
     * @return The sunEpochSet
     */
    public String getSunEpochSet() {
        return sunEpochSet;
    }

    /**
     * @param sunEpochSet The Sun_EpochSet
     */
    public void setSunEpochSet(String sunEpochSet) {
        this.sunEpochSet = sunEpochSet;
    }

    /**
     * @return The precipitationProbability
     */
    public String getPrecipitationProbability() {
        return precipitationProbability;
    }

    /**
     * @param precipitationProbability The PrecipitationProbability
     */
    public void setPrecipitationProbability(String precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

}
