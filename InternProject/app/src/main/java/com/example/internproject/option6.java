package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option6 extends AppCompatActivity {

    AppCompatButton talk_to_therapist,question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option6);

        talk_to_therapist = findViewById(R.id.tele_therapist);
        question = findViewById(R.id.quest);

        talk_to_therapist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option6.this,DoctorsList.class);
                startActivity(intent);
                finish();
            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option6.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });
    }
}