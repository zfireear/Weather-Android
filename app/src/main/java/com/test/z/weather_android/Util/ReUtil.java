package com.test.z.weather_android.Util;

import android.util.Log;

import com.test.z.weather_android.model.Apiinterface.LocationApi;
import com.test.z.weather_android.model.Apiinterface.WeatherApi;
import com.test.z.weather_android.model.locatoninfo.LocationInfo;
import com.test.z.weather_android.model.locatoninfo.Province;
import com.test.z.weather_android.model.weatherinfo.Forecast;
import com.test.z.weather_android.model.weatherinfo.Realtime;
import com.test.z.weather_android.model.weatherinfo.Today;
import com.test.z.weather_android.model.weatherinfo.WeatherInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by z on 6/19/16.
 */
public class ReUtil {

    public static String weather;
    public static String temp;
    public static String humidity;
    public static String time;
    public static String tlocation;
    public static String tempMin;
    public static String tempMax;
    public static String fweather;
    public static String ftemp;
    public static String fweek;
    public static String fweather1;
    public static String ftemp1;
    public static String fweek1;
    public static String fweather2;
    public static String ftemp2;
    public static String fweek2;

    WeatherApi weatherApi = WeatherApi.Factory.getInstance();

    public void updateWeather(final String location) {

        //realtime
        weatherApi.getRealtime(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        Realtime realtime = response.body().getRealtime();
                        weather = realtime.getWeather();
                        temp = realtime.getTemp();
                        humidity = realtime.getHumidity();
                        time = realtime.getTime();
                        tlocation = location;
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {
                        t.printStackTrace();
                    }
                }
        );
    }

    public void updateForecast(String location) {
        //forecast
        weatherApi.getForecast(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {

                        List<Forecast> forecast = response.body().getForecast();
                        fweather = forecast.get(0).getWeather();
                        ftemp = forecast.get(0).getTemp();
                        fweek = forecast.get(0).getWeek();
                        fweather1 = forecast.get(1).getWeather();
                        ftemp1 = forecast.get(1).getTemp();
                        fweek1 = forecast.get(1).getWeek();
                        fweather2 = forecast.get(2).getWeather();
                        ftemp2 = forecast.get(2).getTemp();
                        fweek2 = forecast.get(2).getWeek();
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {
                        t.printStackTrace();
                    }
                }
        );
    }

    public void updateToday(String location) {
        //today
        weatherApi.getToday(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        Today today = response.body().getToday();
                        tempMin = today.getTempMin().toString();
                        tempMax = today.getTempMax().toString();
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {
                        t.printStackTrace();
                    }
                }
        );
    }

    public void getLocation() {
        LocationApi.Factory.getInstance().getProvinces().enqueue(
                new Callback<LocationInfo>() {
                    @Override
                    public void onResponse(Call<LocationInfo> call, Response<LocationInfo> response) {
                        List<Province> province = response.body().getProvinces();
                        String locat = province.get(0).getCities().get(0).getCountries().get(0).toString();
                        updateWeather(locat);
                    }

                    @Override
                    public void onFailure(Call<LocationInfo> call, Throwable t) {
                        Log.e("onFailure", t.getMessage());
                    }
                }
        );
    }
}
