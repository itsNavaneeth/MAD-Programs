package com.example.menuoptions;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.message:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows share icon",
                                Toast.LENGTH_SHORT)
                        .show();
                return true;

            case R.id.picture:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows image icon",
                                Toast.LENGTH_SHORT)
                        .show();
                startActivity(i2);
                return (true);

            case R.id.mode:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "Shows call icon",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.about:
                Toast
                        .makeText(
                                getApplicationContext(),
                                "calculator menu",
                                Toast.LENGTH_SHORT)
                        .show();
                return (true);

            case R.id.exit:
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
