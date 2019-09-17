package com.trihutt.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button linear,relative,absolute,table,frame,constraint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.button1);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),LinearActivity.class);
                startActivity(intent);
            }
        });

        relative = findViewById(R.id.button2);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Relative.class);
                startActivity(intent);
            }
        });

        absolute = findViewById(R.id.button3);
        absolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Absolute.class);
                startActivity(intent);
            }
        });

        table = findViewById(R.id.button4);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Table.class);
                startActivity(intent);
            }
        });

        frame = findViewById(R.id.button5);
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Frame.class);
                startActivity(intent);
            }
        });

        constraint = findViewById(R.id.button6);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Constraint.class);
                startActivity(intent);
            }
        });


}
}
