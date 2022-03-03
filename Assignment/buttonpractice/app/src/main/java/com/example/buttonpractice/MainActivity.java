package com.example.buttonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txt1, txt2;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addRandomBtnName();
    }

    //func 1
    private void addRandomBtnName() {
        txt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        txt2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        btn2 = (Button) findViewById(R.id.button2);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt1.getText().toString();
                String branch = txt2.getText().toString();
                Toast.makeText(getApplicationContext(), "Name: "+name+"\nBranch: "+branch, Toast.LENGTH_LONG).show();
            }
        });

    }
    //end of func 1

    //func 2
    public void mybtnfunc(View view) {
        txt1 = (EditText) findViewById(R.id.editTextTextPersonName);
        txt2 = (EditText) findViewById(R.id.editTextTextPersonName2);

        String name = txt1.getText().toString();
        String branch = txt2.getText().toString();
        Toast.makeText(getApplicationContext(), "Branch: "+branch+"\nName: "+name, Toast.LENGTH_LONG).show();
    }
}