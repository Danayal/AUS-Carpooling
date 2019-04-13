package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class loginPage extends AppCompatActivity {

    private boolean newUser = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        setTitle("Profile");

        Button edit = (Button)findViewById(R.id.editProfileBtn);
        edit.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent start = new Intent(getApplicationContext(), editProfilePage.class);
                startActivity(start);
            }

        });

        Button provide = (Button)findViewById(R.id.provideBtn);
        provide.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if (newUser) {
                    Intent start = new Intent(getApplicationContext(), proveRidePage.class);
                    startActivity(start);
                } else {
                    Intent start = new Intent(getApplicationContext(), provideRideStartRide.class);
                    startActivity(start);
                }
            }
        });

        Button findRide = (Button)findViewById(R.id.findBtn);
        findRide.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                Intent start = new Intent(getApplicationContext(), lookForRide.class);
                startActivity(start);
            }
        });

    }
}
