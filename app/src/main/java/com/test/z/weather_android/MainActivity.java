package com.test.z.weather_android;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.test.z.weather_android.Util.ReUtil;
import com.test.z.weather_android.viewpager.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ViewPager viewPager;
    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    String[] tltitle = {"Today", "Trend"};

    TextView tvlocation;
    TextView tvweather;
    TextView tvhumidity;
    TextView tvtemp;
    TextView tempscope;

    TextView fweather;
    TextView ftemp;
    TextView fweek;
    TextView fweather1;
    TextView ftemp1;
    TextView fweek1;
    TextView fweather2;
    TextView ftemp2;
    TextView fweek2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        viewPager = (ViewPager) findViewById(R.id.vp);
        drawerLayout = (DrawerLayout) findViewById(R.id.dl);
        tabLayout = (TabLayout) findViewById(R.id.tl);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.category);

        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(abdt);
        abdt.syncState();

        toolbar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        drawerLayout.openDrawer(GravityCompat.START);
                    }
                }
        );

        for (int i = 0; i < 2; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(tltitle[i]));
        }
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //set related item
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nv);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            viewPager.setCurrentItem(0);
        } else if (id == R.id.item2) {
            viewPager.setCurrentItem(1);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item, menu);
        return true;
    }

    public void getTextView() {
        tvlocation = (TextView) findViewById(R.id.location);
        tvweather = (TextView) findViewById(R.id.weather);
        tvhumidity = (TextView) findViewById(R.id.humidity);
        tvtemp = (TextView) findViewById(R.id.temp);
        tempscope = (TextView) findViewById(R.id.tempscope);

        fweather = (TextView) findViewById(R.id.fweather);
        ftemp = (TextView) findViewById(R.id.ftemp);
        fweek = (TextView) findViewById(R.id.fweek);
        fweather1 = (TextView) findViewById(R.id.fweather1);
        ftemp1 = (TextView) findViewById(R.id.ftemp1);
        fweek1 = (TextView) findViewById(R.id.fweek1);
        fweather2 = (TextView) findViewById(R.id.fweather2);
        ftemp2 = (TextView) findViewById(R.id.ftemp2);
        fweek2 = (TextView) findViewById(R.id.fweek2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:

                freshWeather();

                break;
        }
        return true;
    }


    public void freshWeather() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            ReUtil reUtil = new ReUtil();
                            reUtil.updateWeather("南海");
                            getTextView();
                            tvweather.setText(reUtil.weather);
                            tvtemp.setText(reUtil.temp + "℃");
                            tvhumidity.setText("湿度 " + reUtil.humidity);
                            tvlocation.setText(reUtil.tlocation);

                            reUtil.updateToday("南海");
                            tempscope.setText(reUtil.tempMax + "℃/" + reUtil.tempMin + "℃");

                            reUtil.updateForecast("南海");
                            ftemp.setText(reUtil.ftemp);
                            fweather.setText(reUtil.fweather);
                            fweek.setText(reUtil.fweek);
                            ftemp1.setText(reUtil.ftemp1);
                            fweather1.setText(reUtil.fweather1);
                            fweek1.setText(reUtil.fweek1);
                            ftemp2.setText(reUtil.ftemp2);
                            fweather2.setText(reUtil.fweather2);
                            fweek2.setText(reUtil.fweek2);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }).start();
    }


    @Override
    public void onBackPressed() {
        assert drawerLayout != null;
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
