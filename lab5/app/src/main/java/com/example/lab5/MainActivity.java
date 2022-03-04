package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText name;

    public void diceFn(View view)
    {
        name = (EditText) findViewById(R.id.PersonName);
        String namestr = name.getText().toString();

        final int random = new Random().nextInt(7);


        TextView dice = (TextView) findViewById(R.id.outputtxt);
        if (random!=6){
            dice.setText("Hey "+namestr+", you rolled a "+random);
        }
        else{
            dice.setText("Hey "+namestr+", you rolled a "+random+".\nThat's a 6 so you get to Roll again!!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "content view setup", Toast.LENGTH_SHORT).show();
    }
}