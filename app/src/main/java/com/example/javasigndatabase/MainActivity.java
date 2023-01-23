package com.example.javasigndatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String DATABASE_NAME = "bazaznakow";

    SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mDatabase = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);

        //createTable();
    }
    /*
    private void createTable(){
        String sql = "CREATE TABLE znaki (\n" +
                " id INTEGER NOT NULL CONSTRAINT znaki_pk PRIMARY KEY AUTOINCREMENT, \n" +
                " name varchar(10) NOT NULL \n" +
                " );";
        mDatabase.execSQL(sql);
    }

     */
}