package com.example.aswitch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch tbtn = (Switch) findViewById(R.id.switch1);
        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.clvar);
        TextView txt = (TextView) findViewById(R.id.textView);
        tbtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(tbtn.isChecked()){
                    cl.setBackgroundResource(R.color.black);
                    txt.setTextColor(getResources().getColor(R.color.white, null));
                    Toast.makeText(getApplicationContext(), "Dark Mode Enabled",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    cl.setBackgroundResource(R.color.white);
                    txt.setTextColor(getResources().getColor(R.color.purple_700,
                            null));
                    Toast.makeText(getApplicationContext(), "Light Mode Enabled",
                            Toast.LENGTH_SHORT).show();
                }}
        });
    }
}

