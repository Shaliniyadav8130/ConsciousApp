package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_option4 extends AppCompatActivity {

    AppCompatButton going,sleep,sad,career,overwhelmed,tasks,issues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option4);
        going = findViewById(R.id.going_through);
        sleep = findViewById(R.id.sleeping);
        sad = findViewById(R.id.sadness);
        career = findViewById(R.id.goal_carieer);
        overwhelmed = findViewById(R.id.anxious);
        tasks = findViewById(R.id.my_tasks);
        issues = findViewById(R.id.relationship);

        going.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,option6.class);
                startActivity(intent);
                finish();
            }
        });

        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });

        overwhelmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });

        tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });

        issues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });

        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                finish();
            }
        });

        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option4.this,activity_option7.class);
                startActivity(intent);
                finish();
            }
        });
    }
}