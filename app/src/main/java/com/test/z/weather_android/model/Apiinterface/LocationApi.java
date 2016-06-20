package com.test.z.weather_android.model.Apiinterface;

import com.test.z.weather_android.model.locatoninfo.LocationInfo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by z on 6/19/16.
 */
public interface LocationApi {

    String LNURL = "http://www.keysona.com/";

    @GET("static/locations.json")
    Call<LocationInfo> getProvinces();

    class Factory {

        public static LocationApi lservice;

        public static LocationApi getInstance() {

            if (lservice == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(LNURL)
                        .build();
                lservice = retrofit.create(LocationApi.class);
                return lservice;
            } else {
                return lservice;
            }

        }
    }
}
