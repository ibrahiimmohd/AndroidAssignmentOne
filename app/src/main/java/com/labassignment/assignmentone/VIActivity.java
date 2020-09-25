package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VIActivity extends AppCompatActivity {

    TextView tvVI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i);
        this.setTitle(getString(R.string.viActivityTitle));

        tvVI = (TextView) findViewById(R.id.textViewVI);
        tvVI.setText(R.string.viOnCreate);
    }

    public void onStop()
    {
        super.onStop();
        tvVI.setText(R.string.viOnStop);
    }

    public void onDestroy()
    {
        super.onDestroy();
        tvVI.setText(R.string.viOnDestroy);
    }

    public void onStart()
    {
        super.onStart();
        tvVI.setText(R.string.viOnStart);
    }


}