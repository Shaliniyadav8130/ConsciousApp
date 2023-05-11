package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class activity_option5 extends AppCompatActivity {

    AppCompatButton therapist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option5);

        therapist = findViewById(R.id.tele_therapist);
       Intent intents = new Intent(activity_option5.this,DoctorsList.class);
        startActivity(intents);
        finish();

    }
}