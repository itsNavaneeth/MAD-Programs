package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value 1");
        String value2 = extras.getString("Value 2");
        Toast.makeText(getApplicationContext(), ""+value1+" "+value2, Toast.LENGTH_SHORT).show();
    }

    public void call1stactivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}