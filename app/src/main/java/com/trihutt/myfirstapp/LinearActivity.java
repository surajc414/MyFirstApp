package com.trihutt.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        getSupportActionBar().setTitle("Linear Layout");
    }
}
