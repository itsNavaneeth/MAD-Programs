package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFn(View view) {
        num1 = (EditText) findViewById(R.id.num1txt);
        num2 = (EditText) findViewById(R.id.num2txt);

        int a = Integer.parseInt((num1.getText().toString()));
        int b = Integer.parseInt((num2.getText().toString()));

        int result = a+b;

        TextView outputtxt = (TextView) findViewById(R.id.outputtxt);
        outputtxt.setText("Addition is: "+result);
        Toast.makeText(getApplicationContext(),"Addition is: "+result, Toast.LENGTH_LONG).show();
    }

    public void subFn(View view) {
        num1 = (EditText) findViewById(R.id.num1txt);
        num2 = (EditText) findViewById(R.id.num2txt);

        int a = Integer.parseInt((num1.getText().toString()));
        int b = Integer.parseInt((num2.getText().toString()));

        int result = a-b;
        TextView outputtxt = (TextView) findViewById(R.id.outputtxt);
        outputtxt.setText("Subtraction is: "+result);

        Toast.makeText(getApplicationContext(),"Subtraction is: "+result, Toast.LENGTH_LONG).show();
    }

    public void mulFn(View view) {
        num1 = (EditText) findViewById(R.id.num1txt);
        num2 = (EditText) findViewById(R.id.num2txt);

        int a = Integer.parseInt((num1.getText().toString()));
        int b = Integer.parseInt((num2.getText().toString()));

        int result = a*b;
        TextView outputtxt = (TextView) findViewById(R.id.outputtxt);
        outputtxt.setText("Multiplication is: "+result);

        Toast.makeText(getApplicationContext(),"Multiplication is: "+result, Toast.LENGTH_LONG).show();
    }

    public void divFn(View view) {
        num1 = (EditText) findViewById(R.id.num1txt);
        num2 = (EditText) findViewById(R.id.num2txt);

        float a = Integer.parseInt((num1.getText().toString()));
        float b = Integer.parseInt((num2.getText().toString()));

        float result = a/b;
        TextView outputtxt = (TextView) findViewById(R.id.outputtxt);
        outputtxt.setText("Division is: "+result);

        Toast.makeText(getApplicationContext(),"Division is: "+result, Toast.LENGTH_LONG).show();
    }

}