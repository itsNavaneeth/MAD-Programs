package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class fragmentone extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmentone, container, false);

        TextView tv = view.findViewById(R.id.tv1);
        tv.setText("FRAGMENT 1");

        Toast.makeText(getActivity(), "Fragment 1 reached!!", Toast.LENGTH_SHORT).show();

        return view;

    }

}