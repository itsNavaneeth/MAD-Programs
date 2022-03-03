package com.example.toggle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tbtn = (ToggleButton) findViewById(R.id.toggleButton);
        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.clvar);
        TextView txt = (TextView) findViewById(R.id.textView);

//        beginning of function
//        tbtn.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            @Override
//            public void onClick(View view) {
//                if(tbtn.isChecked()){
//                    cl.setBackgroundResource(R.color.dark);
//                    txt.setTextColor(getResources().getColor(R.color.white, null));
//                    Toast.makeText(getApplicationContext(), "Dark Mode Enabled",
//                            Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                    cl.setBackgroundResource(R.color.light);
//                    txt.setTextColor(getResources().getColor(R.color.purple_700,
//                            null));
//                    Toast.makeText(getApplicationContext(), "Light Mode Enabled",
//                            Toast.LENGTH_SHORT).show();
//                }}
//        });
//        end of function

//        beggining of function
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbtn.isChecked()){
                    cl.setBackgroundResource(R.color.dark);
                    txt.setTextColor(Color.WHITE);
                    txt.setText("DARK MODE");
                }
                else{
                    cl.setBackgroundResource(R.color.light);
                    txt.setTextColor(Color.BLACK);
                    txt.setText("LIGHT MODE");
                }
            }
        });



    }
}