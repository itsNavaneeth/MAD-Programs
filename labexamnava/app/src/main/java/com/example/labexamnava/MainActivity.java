package com.example.labexamnava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ListView myList;
    String coursesList[] = {"Data Communication and Networks", "Mobile App Development", "Advance Data Structures", "Machine Learning", "Object Oriented Programming using C++", "Analysis and Design of Algorithms", "Advance Python Programming", "Data Structures using C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, coursesList);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String value=myAdapter.getItem(position);
                Toast.makeText(getApplicationContext(),"You have selected: \n"+value, Toast.LENGTH_SHORT).show();

            }
        });
    }



}