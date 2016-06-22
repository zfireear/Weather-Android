package com.test.z.weather_android.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.test.z.weather_android.R;
import com.test.z.weather_android.Util.ReUtil;

import java.util.ArrayList;

/**
 * Created by z on 6/22/16.
 */
public class WeatherStateFragment1 extends Fragment{

    ReUtil wreUtil;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void getWeekData(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weathericon1,container,false);

        LineChart lineChart = (LineChart) view.findViewById(R.id.chart);
        // creating list of entry
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(4f, 0));
        entries.add(new Entry(8f, 1));
        entries.add(new Entry(6f, 2));
        entries.add(new Entry(2f, 3));
        entries.add(new Entry(18f, 4));
        entries.add(new Entry(9f, 5));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

        // creating labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Mon");
        labels.add("Tue");
        labels.add("Wed");
        labels.add("Thu");
        labels.add("Fri");
        labels.add("Sat");

        LineData data = new LineData(labels, dataset);
        lineChart.setData(data); // set the data and list of lables into chart

        //lineChart.setDescription("Description");  // set the description

        return view;
    }
}
