package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class fragmenttwo extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragmenttwo, container, false);

        TextView tv = view.findViewById(R.id.tv2);
        tv.setText("FRAGMENT 2");

        Toast.makeText(getActivity(), "Fragment 2 reached!!", Toast.LENGTH_SHORT).show();

        return view;
    }
}