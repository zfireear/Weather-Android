package com.test.z.weather_android.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by z on 6/16/16.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WeatherStateFragment();
        } else if (position == 1) {
            return new WeatherStateFragment1();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
