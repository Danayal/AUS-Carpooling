package com.example.auscarpooling;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class editProfilePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_page);
        setTitle("Edit user profile");
        Button update = (Button)findViewById(R.id.updateEditButton);
        update.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = "Information updated";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });
    }
}
