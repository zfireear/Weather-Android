
package com.test.z.weather_android.model.locatoninfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class City {

    @SerializedName("countries")
    @Expose
    private List<Country> countries = new ArrayList<Country>();
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * @return The countries
     */
    public List<Country> getCountries() {
        return countries;
    }

    /**
     * @param countries The countries
     */
    public void setCountries(List<Country> countries) {
        this.countries = countries;
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
