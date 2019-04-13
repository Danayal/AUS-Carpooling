package com.example.auscarpooling;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class lookPreferences extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_preferences);
        setTitle("User preferences");
        Button setPref = (Button)findViewById(R.id.setPrefBtn);
        setPref.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                //Do something with preferences

                Intent start = new Intent(getApplicationContext(), lookForRide.class);
                startActivity(start);
            }
        });


        Spinner gSpinner = findViewById(R.id.gPreference);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gSpinner.setAdapter(adapter);
        gSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String gPreference = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
