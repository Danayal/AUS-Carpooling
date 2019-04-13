package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("AUS Carpooling");
        Button login = (Button) findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent start = new Intent(getApplicationContext(), loginPage.class);
                startActivity(start);
            }
        });

        Button register = (Button)findViewById(R.id.registerBtn);
        register.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openRegisterPage();
            }

        });
    }

    public void openRegisterPage(){
        Intent intent = new Intent(getApplicationContext(), RegisterPage.class);
        startActivity(intent);
    }
}
