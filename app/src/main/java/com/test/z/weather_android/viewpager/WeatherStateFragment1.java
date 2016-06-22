package com.test.z.weather_android.viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.test.z.weather_android.R;
import com.test.z.weather_android.Util.ReUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by z on 6/16/16.
 */
public class WeatherStateFragment1 extends Fragment {

    ReUtil wreUtil;

    public void setWreUtil(ReUtil wreUtil) {
        this.wreUtil = wreUtil;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        MainActivity mainActivity = (MainActivity)getActivity();
//        wreUtil = mainActivity.reUtil;
//        Log.d("getWeekData",mainActivity.reUtil.weather);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weathericon1, container, false);

        LineChart mChart = (LineChart) view.findViewById(R.id.chart);
        setChart(mChart);
//         setData(mChart,6);
        setData(mChart,5);
        Legend l = mChart.getLegend();
        l.setForm(Legend.LegendForm.LINE);
        l.setTextSize(12f);
        l.setTextColor(Color.BLACK);
        l.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);

        XAxis xAxis = mChart.getXAxis();

        // 将X坐标轴的标尺刻度移动底部。
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        // X轴之间数值的间隔
        xAxis.setSpaceBetweenLabels(1);

        xAxis.setTextSize(12f);
        xAxis.setTextColor(Color.BLACK);

        YAxis leftAxis = mChart.getAxisLeft();
        setYAxisLeft(leftAxis);

        YAxis rightAxis = mChart.getAxisRight();
        setYAxisRight(rightAxis);
        return view;
    }

    private void setYAxisLeft(YAxis leftAxis) {
        // 在左侧的Y轴上标出4个刻度值
        leftAxis.setLabelCount(4, true);

        // Y坐标轴轴线的颜色
        leftAxis.setGridColor(Color.RED);

        // Y轴坐标轴上坐标刻度值的颜色
        leftAxis.setTextColor(Color.RED);

        // Y坐标轴最大值
        leftAxis.setAxisMaxValue(50);

        // Y坐标轴最小值
        leftAxis.setAxisMinValue(10);

        leftAxis.setStartAtZero(false);

        leftAxis.setDrawLabels(true);
    }

    private void setYAxisRight(YAxis rightAxis) {
        // Y坐标轴上标出8个刻度值
        rightAxis.setLabelCount(8, true);

        // Y坐标轴上刻度值的颜色
        rightAxis.setTextColor(Color.BLUE);

        // Y坐标轴上轴线的颜色
        rightAxis.setGridColor(Color.BLUE);

        // Y坐标轴最大值
        rightAxis.setAxisMaxValue(30);

        // Y坐标轴最小值
        rightAxis.setAxisMinValue(-5);

        rightAxis.setStartAtZero(false);
        rightAxis.setDrawLabels(true);
    }

    private void setChart(LineChart mChart) {
        mChart.setNoDataTextDescription("传递的数值是空");
        mChart.setHighlightPerDragEnabled(true);
        mChart.setHighlightPerTapEnabled(true);
        mChart.setTouchEnabled(true);
        mChart.setDragDecelerationFrictionCoef(0.9f);
        mChart.setDragEnabled(true);
        mChart.setScaleEnabled(true);
        mChart.setDrawGridBackground(true);
        mChart.setHighlightPerDragEnabled(true);
        mChart.setPinchZoom(true);
        mChart.setBackgroundColor(Color.LTGRAY);
        mChart.animateX(3000);
    }

    private void setData(LineChart mChart, int count) {

        ArrayList<String> xVals = new ArrayList<String>();
//        for(int i=0;i<6;i++){
//            xVals.add(wreUtil.sfweek[i]);
//        }
//        for (int i = 0; i < count; i++) {
//            xVals.add("某月" + (i + 1) + "日");
//        }
        xVals.add("明天");
        xVals.add("后天");
        xVals.add("大后天");
        xVals.add("大大后天");
        xVals.add("大大大后天");


        ArrayList<Entry> yHigh = new ArrayList<Entry>();
        LineDataSet high = new LineDataSet(yHigh, "最高温");
        setHighTemperature(high, yHigh, count);

        ArrayList<Entry> yLow = new ArrayList<Entry>();
        LineDataSet low = new LineDataSet(yLow, "最低温");
        setLowTemperature(low, yLow, count);

        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(high);
        dataSets.add(low);

        LineData data = new LineData(xVals, dataSets);

        data.setValueTextColor(Color.DKGRAY);
        data.setValueTextSize(10f);
        mChart.setData(data);

    }

    private void setHighTemperature(LineDataSet high, ArrayList<Entry> yVals,
                                    int count) {
//        for (int i = 1; i <= wreUtil.sftemp.length; i++) {
//            String[] h = wreUtil.sftemp[i].split("~");
//            yVals.add(new Entry(Float.parseFloat(h[0]), i));
//        }
        for (int i = 0; i < count; i++) {
            float val = (float) Math.random() + 33;
            yVals.add(new Entry(val, i));
        }

        // 以左边的Y坐标轴为准
        high.setAxisDependency(YAxis.AxisDependency.LEFT);

        high.setLineWidth(5f);
        high.setColor(Color.RED);
        high.setCircleSize(8f);
        high.setCircleColor(Color.YELLOW);
        high.setCircleColorHole(Color.DKGRAY);
        high.setDrawCircleHole(true);

        // 设置折线上显示数据的格式。如果不设置，将默认显示float数据格式。
        high.setValueFormatter(
                new ValueFormatter() {
                    @Override
                    public String getFormattedValue(float v, Entry entry, int i, ViewPortHandler viewPortHandler) {
                        DecimalFormat decimalFormat = new DecimalFormat(".0");
                        String s = "高温" + decimalFormat.format(v);
                        return s;
                    }
                }
        );

    }

    private void setLowTemperature(LineDataSet low, ArrayList<Entry> yVals,
                                   int count) {
//
//        for (int i = 1; i <= wreUtil.sftemp.length; i++) {
//            String[] l = wreUtil.sftemp[i].split("~");
//            yVals.add(new Entry(Float.parseFloat(l[0]), i));
//        }
        for (int i = 0; i < count; i++) {
            float val = (float) Math.random() + 28;
            yVals.add(new Entry(val, i));
        }

        // 以右边Y坐标轴为准
        low.setAxisDependency(YAxis.AxisDependency.RIGHT);

        // 折现的颜色
        low.setColor(Color.GREEN);

        // 线宽度
        low.setLineWidth(3f);

        // 折现上点的圆球颜色
        low.setCircleColor(Color.BLUE);

        // 填充圆球中心部位洞的颜色
        low.setCircleColorHole(Color.LTGRAY);

        // 圆球的尺寸
        low.setCircleSize(5f);

        low.setDrawCircleHole(true);

        low.setValueFormatter(
                new ValueFormatter() {
                    @Override
                    public String getFormattedValue(float v, Entry entry, int i, ViewPortHandler viewPortHandler) {
                        DecimalFormat decimalFormat = new DecimalFormat(".0");
                        String s = "低温" + decimalFormat.format(v);
                        return s;
                    }
                }
        );
    }
}


