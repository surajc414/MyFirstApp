package com.trihutt.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        getSupportActionBar().setTitle("Relative Layout");
    }
}
