package com.test.z.weather_android.Util;

import android.util.Log;

import com.test.z.weather_android.model.Apiinterface.LocationApi;
import com.test.z.weather_android.model.Apiinterface.WeatherApi;
import com.test.z.weather_android.model.locatoninfo.LocationInfo;
import com.test.z.weather_android.model.locatoninfo.Province;
import com.test.z.weather_android.model.weatherinfo.Aqi;
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

    WeatherApi weatherApi = WeatherApi.Factory.getInstance();

    public void updateWeather(final String location) {

        //realtime
        weatherApi.getRealtime(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        Realtime realtime = response.body().getRealtime();
                        //Log.d("weather","realtime temp is"+realtime.getTemp());
                        weather = realtime.getWeather();
                        temp = realtime.getTemp();
                        humidity = realtime.getHumidity();
//                        String windDirection = realtime.getWindDirection();
//                        String windSpeed = realtime.getWindSpeed();
                        time = realtime.getTime();
                        tlocation = location;
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {
                        t.printStackTrace();
                    }
                }
        );

        //forecast
        weatherApi.getForecast(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        //  Forecast forecast = (Forecast) response.body().getForecast();
                        // String weather = forecast.getWeather();
                        // String temp = forecast.getTemp();
                        // String windDetail = forecast.getWindDetail();
                        // String week = forecast.getWeek();
                        // String wind = forecast.getWind();
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {

                    }
                }
        );
        //Aqi
        weatherApi.getAqi(location).enqueue(
                new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        Aqi aqi = response.body().getAqi();
                        //  String time = aqi.getTime();
                        //  String spot = aqi.getSpot();
                        //  String pm10 = aqi.getPm10();
//                        String pm25 = aqi.getPm25();
//                        String aqiString = aqi.getAqi();
//                        String so2 = aqi.getSo2();
//                        String no2 = aqi.getNo2();
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {

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
                        //Log.d("weather","today tempmax is"+today.getTempMax().toString());
//                        String humidityMax = today.getHumidityMax().toString();
//                        String humidityMin = today.getHumidityMin().toString();
                        // String windMax = today.getWindMax().toString();
                        // String windMin = today.getWindMin().toString();
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
