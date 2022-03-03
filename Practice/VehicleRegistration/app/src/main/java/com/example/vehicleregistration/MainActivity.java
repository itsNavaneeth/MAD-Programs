package com.example.vehicleregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        EditText nametxt = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText emailtxt = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText brandtxt = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText modeltxt = (EditText) findViewById(R.id.editTextTextPersonName4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nametxt.getText().toString();
                String email = emailtxt.getText().toString();
                String brand = brandtxt.getText().toString();
                String model = modeltxt.getText().toString();
                String str = "Name:"+name+"\nEmail: "+email+"\nBrand: "+brand+"\nModel: "+model+"\nCongratulations on your new vehicle!";

                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });
    }
}