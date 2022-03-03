package com.example.rlayout2;

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
    public void submitForm(View view)
    {
        EditText cn = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText cid = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText name = (EditText) findViewById(R.id.editTextTextPersonName3);EditText usn = (EditText) findViewById(R.id.editTextTextPersonName4);
        String a = cn.getText().toString();
        String b = cid.getText().toString();
        String c = name.getText().toString();
        String d = usn.getText().toString();
        String res = "Course Name : "+a + "\nCourse Code : "+b +"\nName : "+c + "\nUSN : "+d;
        Toast.makeText(getApplicationContext(), res, Toast.LENGTH_LONG).show();
    }
}