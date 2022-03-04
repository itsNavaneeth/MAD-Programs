package com.example.eventhandling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById((R.id.btn1));
        Button btn2 = (Button) findViewById((R.id.btn2));
        TextView outputtxt = (TextView) findViewById(R.id.outputtxt);
        EditText txt = (EditText) findViewById((R.id.hextext));

        Random random = new Random();
        layout = findViewById(R.id.layout);



        btn1.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = txt.getText().toString();
                int color = Color.parseColor(name);
                layout.setBackgroundColor(color);
                outputtxt.setText("Color: " + name);
            }
        }));

        btn2.setOnClickListener((View.OnClickListener)(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                String hexColor = "#" + Integer.toHexString(color).substring(2);
                layout.setBackgroundColor(color);
                outputtxt.setText("Color: " +hexColor);
            }
        }));


    }



}