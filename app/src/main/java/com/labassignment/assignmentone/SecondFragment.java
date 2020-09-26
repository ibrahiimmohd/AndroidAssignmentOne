package com.labassignment.assignmentone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    //Declare TextView variable
    TextView tvActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //Declare and initialize fragment second view
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        //Initialize tvActivity variable
        tvActivity = (TextView) view.findViewById(R.id.textView);
        //Setting text to tvActivity variable
        tvActivity.setText(R.string.secFragText);

        return view;
    }

}