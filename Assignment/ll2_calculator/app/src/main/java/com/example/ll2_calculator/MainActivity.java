package com.example.ll2_calculator;

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

    public void add(View view)
    {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber4);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int res = a+b;
        Toast.makeText(getApplicationContext(), "Sum = "+res, Toast.LENGTH_SHORT).show();
    }

    public void sub(View view)
    {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber4);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int res = a-b;
        Toast.makeText(getApplicationContext(), "Difference = "+res, Toast.LENGTH_SHORT).show();
    }

    public void multiply(View view)
    {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber4);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int res = a*b;
        Toast.makeText(getApplicationContext(), "Product = "+res, Toast.LENGTH_SHORT).show();
    }

    public void divide(View view)
    {
        EditText num1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText num2 = (EditText) findViewById(R.id.editTextNumber4);
        float a = Integer.parseInt(num1.getText().toString());
        float b = Integer.parseInt(num2.getText().toString());
        float res = a/b;
        Toast.makeText(getApplicationContext(), "Quotient = "+res, Toast.LENGTH_SHORT).show();
    }
}
