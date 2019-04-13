package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        setTitle("Select time");
        Button setTime = (Button)findViewById(R.id.setTimeBtn);
        setTime.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                //Do something with the time

                Intent startUpdate = new Intent(getApplicationContext(), provideRideStartRide.class);
                startActivity(startUpdate);
            }
        });
    }
}
