
package com.test.z.weather_android.model.locatoninfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class LocationInfo {

    @SerializedName("provinces")
    @Expose
    private List<Province> provinces = new ArrayList<Province>();

    /**
     * @return The provinces
     */
    public List<Province> getProvinces() {
        return provinces;
    }

    /**
     * @param provinces The provinces
     */
    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

}
