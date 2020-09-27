package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AIActivity extends AppCompatActivity {
    //Declare variables
    TextView tvAI;
    ArrayList<String> lifeCycleAI = new ArrayList<>();
    String tag = "AIActivity Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        //Setting the title for AIActivity
        this.setTitle(getString(R.string.aiActivityTitle));

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnCreate));

        //Initialize txAI variable
        tvAI = (TextView) findViewById(R.id.textViewAI);

        //Add event name to lifeCycleAI array
        lifeCycleAI.add(getString(R.string.aiOnCreate));
        lifeCycleAI.add("\n");
    }

    //onStop method
    public void onStop()
    {
        super.onStop();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnStop));

        //The window closes fast enough where below code won't execute

        //Add event name to lifeCycleAI array
        lifeCycleAI.add("\n");
        lifeCycleAI.add(getString(R.string.aiOnStop));
        executeLifeCycles();

    }

    //onDestroy method
    public void onDestroy()
    {
        super.onDestroy();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnDestroy));

        //The window closes fast enough where below code won't execute

        //Add event name to lifeCycleAI array
        lifeCycleAI.add("\n");
        lifeCycleAI.add(getString(R.string.aiOnDestroy));
        executeLifeCycles();
    }

    //onStart method
    public void onStart()
    {
        super.onStart();

        //Display the event in the log
        Log.d(tag, getString(R.string.aiOnStart));

        //Add event name to lifeCycleAI array
        lifeCycleAI.add(getString(R.string.aiOnStart));
        executeLifeCycles();
    }

    //executeLifeCycles method to fetch lifeCycleAI array
    public void executeLifeCycles(){
        String result = "";
        for (String state: lifeCycleAI) {
            result += state;
            tvAI.setText(result);
        }
    }
}