package com.test.z.weather_android.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by z on 6/19/16.
 */
public class LocationSql extends SQLiteOpenHelper {


    public LocationSql(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public LocationSql(Context context, String name) {
        this(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table if not exists " +
                "user(id integer primary key  autoincrement, name varchar(20)," +
                " passwords varchar(20))";
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
