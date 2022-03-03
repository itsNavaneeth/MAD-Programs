package com.example.autofillprog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    String[] cities = {"Bangalore","Mumbai","Hyderabad","Chennai","Delhi","Lucknow","Kolkata","Agra"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> a = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,cities);
        AutoCompleteTextView a1 = (AutoCompleteTextView) findViewById(R.id.editTextTextPersoncity);
        a1.setThreshold(1);
        a1.setAdapter(a);
        a1.setTextColor(Color.RED);
    }
}