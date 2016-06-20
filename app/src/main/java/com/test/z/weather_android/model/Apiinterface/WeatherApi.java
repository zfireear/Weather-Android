package com.test.z.weather_android.model.Apiinterface;

import com.test.z.weather_android.model.weatherinfo.WeatherInfo;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by z on 6/17/16.
 */
public interface WeatherApi {

    String WURL =
            "http://www.keysona.com/api/weather/today/countryName/";

    @GET("{location}")
    Call<WeatherInfo> getRealtime(@Path("location") String location);

    @GET("{location}")
    Call<WeatherInfo> getToday(@Path("location") String location);

    @GET("{location}")
    Call<WeatherInfo> getForecast(@Path("location") String location);

    @GET("{location}")
    Call<WeatherInfo> getAqi(@Path("location") String location);


    class Factory {
        public static WeatherApi service;

        public static WeatherApi getInstance() {

            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(WURL)
                        .build();
                service = retrofit.create(WeatherApi.class);
                return service;
            } else {
                return service;
            }

        }
    }


}
