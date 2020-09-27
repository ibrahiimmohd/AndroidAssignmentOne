package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VIActivity extends AppCompatActivity {
    //Declare variables
    TextView tvVI;
    ArrayList<String> lifeCycleVI = new ArrayList<>();
    String tag = "VIActivity Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i);

        //Setting the title for the VIActivity
        this.setTitle(getString(R.string.viActivityTitle));

        //Display the event in the log
        Log.d(tag, getString(R.string.viOnCreate));

        //Initialize txVI variable
        tvVI = (TextView) findViewById(R.id.textViewVI);

        //Add event name to lifeCycleVI array
        lifeCycleVI.add(getString(R.string.viOnCreate));
        lifeCycleVI.add("\n");
    }

    //onStop method
    public void onStop()
    {
        super.onStop();

        //Display the event in the log
        Log.d(tag, getString(R.string.viOnStop));

        //The window closes fast enough where below code won't execute

        //Add event name to lifeCycleVI array
        lifeCycleVI.add("\n");
        lifeCycleVI.add(getString(R.string.viOnStop));
        executeLifeCycles();
    }

    //onDestroy method
    public void onDestroy()
    {
        super.onDestroy();

        //Display the event in the log
        Log.d(tag, getString(R.string.viOnDestroy));

        //The window closes fast enough where below code won't execute

        //Add event name to lifeCycleVI array
        lifeCycleVI.add("\n");
        lifeCycleVI.add(getString(R.string.viOnDestroy));
        executeLifeCycles();
    }

    //onStart method
    public void onStart()
    {
        super.onStart();

        //Display the event in the log
        Log.d(tag, getString(R.string.viOnStart));

        //Add event name to lifeCycleVI array
        lifeCycleVI.add(getString(R.string.viOnStart));
        executeLifeCycles();
    }

    //executeLifeCycles method to fetch lifeCycleVI array
    public void executeLifeCycles(){
        String result = "";
        for (String state: lifeCycleVI) {
            result += state;
            tvVI.setText(result);
        }
    }
}