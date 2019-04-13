package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lookForRide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_for_ride);
        setTitle("Find a ride");

        //select location



        //select date and time
        Button selectDate = (Button)findViewById(R.id.lookSelectDate);
        selectDate.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent start = new Intent(getApplicationContext(), lookForRideDate.class);
                startActivity(start);
            }
        });

        //select preferences
        Button selectPref = (Button)findViewById(R.id.preferencesBtn);
        selectPref.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent start = new Intent(getApplicationContext(), lookPreferences.class);
                startActivity(start);
            }
        });


        //Show drivers

        Button searchDrivers = (Button)findViewById(R.id.searchRideBtn);
        searchDrivers.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent start = new Intent(getApplicationContext(), availableDrivers.class);
                startActivity(start);
            }
        });


    }
}
