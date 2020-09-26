package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {
    //Declare TextView variable
    TextView tvAI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        //Setting the title for the AIActivity
        this.setTitle(getString(R.string.aiActivityTitle));
        //Initialize txAI variable
        tvAI = (TextView) findViewById(R.id.textViewAI);
        //Setting text to txAI variable
        tvAI.setText(R.string.aiOnCreate);
    }

    //onStart method
    public void onStart()
    {
        super.onStart();
        //Setting text to txAI variable
        tvAI.setText(R.string.aiOnStart);
    }
    //onStop method
    public void onStop()
    {
        super.onStop();
        //Setting text to txAI variable
        tvAI.setText(R.string.aiOnStop);
    }
    //onDestroy method
    public void onDestroy()
    {
        super.onDestroy();
        //Setting text to txAI variable
        tvAI.setText(R.string.aiOnDestroy);
    }

}