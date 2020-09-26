package com.labassignment.assignmentone;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class FirstFragment extends ListFragment {
    //Declare intent variable
    Intent intent;

    // Declare and initialize customActivities string array
    String[] customActivities = new String[]
            {
                    "AIActivity",
                    "VIActivity"
            };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Declare and initialize fragment first view
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        //ArrayAdapter creates a view for each array item
        // by calling toString() on each item and placing
        // the contents in a TextView.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, customActivities);
        //bind the list view with array adapter
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //Get the selected item in the list and set the colour for it
        getListView().setSelector(android.R.color.holo_blue_dark);

        //A switch that takes current position for string array argument
        //Checks if its value matches any of the switch cases
        //Then perform corresponding logic
        switch (customActivities[position]) {
            case "VIActivity":
                //Initialize intent variable where it opens new activity
                intent = new Intent(getActivity(), VIActivity.class);
                //starts the new activity
                startActivity(intent);
                break;
            case "AIActivity":
                //Initialize intent variable where it opens new activity
                intent = new Intent(getActivity(), AIActivity.class);
                //starts the new activity
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}