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

        View view =inflater.inflate(R.layout.fragment_first, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, customActivities);
        //bind the list view with array adapter
        setListAdapter(adapter);

        return view;

    }

    Intent intent;

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        getListView().setSelector(android.R.color.holo_blue_dark);

        switch (customActivities[position]) {
            case "VIActivity":
                intent = new Intent(getActivity(), VIActivity.class);
                startActivity(intent);
                break;
            case "AIActivity":
                intent = new Intent(getActivity(), AIActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}