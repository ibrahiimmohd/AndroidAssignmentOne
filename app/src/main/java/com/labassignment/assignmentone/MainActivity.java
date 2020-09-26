package com.labassignment.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare and initialize content variable
        Context context = getApplicationContext();
        //Set text for context variable
        CharSequence text = getString(R.string.mainActivityOnCreate);
        //Indicate the duration for the display
        int duration = Toast.LENGTH_SHORT;
        //Declare and initialize toast variable which takes context, text, and duration arguments
        Toast toast = Toast.makeText(context, text, duration);
        //Call .show function
        toast.show();
    }

    public void onStart()
    {
        super.onStart();

        //Declare and initialize content variable
        Context context = getApplicationContext();
        //Set text for context variable
        CharSequence text = getString(R.string.mainActivityOnStart);
        //Indicate the duration for the display
        int duration = Toast.LENGTH_SHORT;
        //Declare and initialize toast variable which takes context, text, and duration arguments
        Toast toast = Toast.makeText(context, text, duration);
        //Call .show function
        toast.show();
    }
}