package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showName(View view){
        EditText edit = (EditText) findViewById(R.id.editTextTextPersonName);
        String name = edit.getText().toString();
        String res = "Hello "+name+", how are you!";
        Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
    }
}