package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {
    TextView tvAI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);
        this.setTitle(getString(R.string.aiActivityTitle));

        tvAI = (TextView) findViewById(R.id.textViewAI);
        tvAI.setText(R.string.aiOnCreate);
    }

    public void onStart()
    {
        super.onStart();
        tvAI.setText(R.string.aiOnStart);
    }

    public void onStop()
    {
        super.onStop();
        tvAI.setText(R.string.aiOnStop);
    }

    public void onDestroy()
    {
        super.onDestroy();
        tvAI.setText(R.string.aiOnDestroy);
    }

}