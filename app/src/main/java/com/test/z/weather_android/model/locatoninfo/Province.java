
package com.test.z.weather_android.model.locatoninfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Province {

    @SerializedName("cities")
    @Expose
    private List<City> cities = new ArrayList<City>();
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * @return The cities
     */
    public List<City> getCities() {
        return cities;
    }

    /**
     * @param cities The cities
     */
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
