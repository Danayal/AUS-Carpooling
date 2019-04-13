package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setTitle("Select date");
        Button setDate = (Button)findViewById(R.id.setDateBtn);
        setDate.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                //Do something with the date

                Intent startUpdate = new Intent(getApplicationContext(), time.class);
                startActivity(startUpdate);
            }
        });
    }
}
