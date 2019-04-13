package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class lookForRideDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_for_ride_date);

        setTitle("Select date");
        Button goToTime = (Button)findViewById(R.id.setDateBtn);
        goToTime.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                //Do something with date then set time

                Intent startUpdate = new Intent(getApplicationContext(), lookForRideTime.class);
                startActivity(startUpdate);
            }
        });



    }

}
