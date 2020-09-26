package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VIActivity extends AppCompatActivity {
    //Declare TextView variable
    TextView tvVI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i);

        //Setting the title for the VIActivity
        this.setTitle(getString(R.string.viActivityTitle));
        //Initialize txVI variable
        tvVI = (TextView) findViewById(R.id.textViewVI);
        //Setting text to txVI variable
        tvVI.setText(R.string.viOnCreate);
    }

    //onStop constructor
    public void onStop()
    {
        super.onStop();
        //Setting text to txVI variable
        tvVI.setText(R.string.viOnStop);
    }
    //onDestroy constructor
    public void onDestroy()
    {
        super.onDestroy();
        //Setting text to txVI variable
        tvVI.setText(R.string.viOnDestroy);
    }
    //onStart constructor
    public void onStart()
    {
        super.onStart();
        //Setting text to txVI variable
        tvVI.setText(R.string.viOnStart);
    }
}