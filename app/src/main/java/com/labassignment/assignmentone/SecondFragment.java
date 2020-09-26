package com.labassignment.assignmentone;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //Declare and initialize fragment second view
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        //static toast object calls makeText method which takes context(getActivity), text, and duration arguments
        Toast.makeText(getActivity(), R.string.fragment2_onCreate, Toast.LENGTH_SHORT).show();

        return view;
    }

    //onStart method
    public void onStart()
    {
        super.onStart();
        //static toast object calls makeText method which takes context(getActivity), text, and duration arguments
        Toast.makeText(getActivity(), R.string.fragment2_onStart, Toast.LENGTH_SHORT).show();
    }
}