package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Option3 extends AppCompatActivity {
    AppCompatButton therapist,questinnaire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option3);
        therapist=findViewById(R.id.option3_connect_with_therapist);
        questinnaire=findViewById(R.id.questionnaire);
        questinnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option3.this,AgeOption.class);
                startActivity(intent);
                finish();
            }
        });
        therapist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option3.this,DoctorsList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}