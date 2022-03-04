package com.example.popup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Item 1 was clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Item 2 was clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Item 3 was clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }

    }
}