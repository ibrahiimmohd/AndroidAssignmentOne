package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvOnCreate;
    TextView tvOnStart;
    ArrayList<String> lifeCycleActivities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOnCreate = (TextView) findViewById(R.id.textView);
        lifeCycleActivities.add("onCreate executed");
        lifeCycleActivities.add("\n");
    }

    //onStart method
    public void onStart()
    {
        super.onStart();

        lifeCycleActivities.add("onStart executed");
        String result = "";
        for (String state: lifeCycleActivities) {
            result += state;
            tvOnCreate.setText(result);
        }
        lifeCycleActivities.clear();

    }
}