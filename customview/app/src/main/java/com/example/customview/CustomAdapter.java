package com.example.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String CountryList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context context, String[] countryList, int[] flags) {
        this.context = context;
        CountryList = countryList;
        this.flags = flags;
        this.inflter = (LayoutInflater.from(context)); // Create a new LayoutInflater instance associated with a particular Context
    }

    @Override
    public int getCount() {
        return CountryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    ///Get a View that displays the data at the specified position in the data set. You can either create a View manually or inflate it from an XML layout file.
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.activity_listview,null);
        TextView country = view.findViewById(R.id.textView);
        ImageView icon = view.findViewById(R.id.icon);
        country.setText(CountryList[position]);
        icon.setImageResource(flags[position]);
        return view;
    }
}
