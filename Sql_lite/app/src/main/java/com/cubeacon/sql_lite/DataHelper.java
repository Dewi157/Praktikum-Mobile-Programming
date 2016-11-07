package com.cubeacon.sql_lite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by ihsan on 11/7/2016.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table biodata(nim text primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "create table login(id text primary key, usernama text null, password text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (nim, nama, tgl, jk, alamat) VALUES ('1137050067', 'Dewi Hikmah Yulianti', '15 Juli 1995', 'Perempuan','Brebes');";
        db.execSQL(sql);
        sql = "INSERT INTO login (id, usernama, password) VALUES ('123', 'dewihik', '02030405');";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }

}
