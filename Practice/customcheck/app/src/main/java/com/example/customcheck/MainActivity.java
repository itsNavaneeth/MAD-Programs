package com.example.customcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c, s, d;
    Button o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick() {
        c = (CheckBox) findViewById(R.id.coffee);
        s = (CheckBox) findViewById(R.id.sandwich);
        d = (CheckBox) findViewById(R.id.dosa);
        o = (Button) findViewById(R.id.order);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = 0;
                StringBuilder r = new StringBuilder();
                r.append(&quot;Selected Items&quot;);
                if (c.isChecked()) {
                    r.append(&quot;\ncoffee 50Rs&quot;);
                    total += 50;
                }
                if (s.isChecked()) {
                    r.append(&quot;\nsandwich 100Rs&quot;);
                    total += 100;
                }
                if (d.isChecked()) {
                    r.append(&quot;\ndosa 90Rs&quot;);
                    total += 90;
                }
                r.append(&quot;\nTotal:&quot; + total + &quot;Rs&quot;);
//displaying the msg on the toast
                Toast.makeText(getApplicationContext(), r.toString(),
                        Toast.LENGTH_SHORT).show();
                Log.d(&quot;Revision1&quot;,&quot;total:&quot; +total);
            }

        });
    }
}