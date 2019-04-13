package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lookForRideTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_for_ride_time);
        setTitle("Select time");
        Button setTime = (Button)findViewById(R.id.lookSetTimeBtn);
        setTime.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                //Do something with time then go back to select time

                Intent startUpdate = new Intent(getApplicationContext(), lookForRide.class);
                startActivity(startUpdate);
            }
        });



    }
}
