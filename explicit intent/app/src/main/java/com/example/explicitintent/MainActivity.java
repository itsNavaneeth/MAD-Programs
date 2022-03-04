package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call2ndactivity(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("Value 1", "Hello guys");
        i.putExtra("Value 2", "Welcome");
        startActivity(i);

    }
}