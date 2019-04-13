package com.example.auscarpooling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class provideRideStartRide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provide_ride_start_ride);
        setTitle("Provide a ride");
        Button update = (Button)findViewById(R.id.provideUpdateBtn);
        update.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent startUpdate = new Intent(getApplicationContext(), provideUpdate.class);
                startActivity(startUpdate);
            }
        });

        Button date = (Button)findViewById(R.id.provideDateBtn);
        date.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent startCalendar = new Intent(getApplicationContext(), calendar.class);
                startActivity(startCalendar);
            }
        });

        Button updateInfo = (Button) findViewById(R.id.provideBtn);
        updateInfo.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "Information added to Driver's list! Passengers will contact you soon!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}

