package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AgeOption extends AppCompatActivity {

    AppCompatButton age_below_18,age_below_24,age_above;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_option);
        age_below_18 = findViewById(R.id.age_12);
        age_below_24 = findViewById(R.id.age_19);
        age_above = findViewById(R.id.age_25);

        age_below_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inext;
                inext = new Intent(AgeOption.this,activity_option4.class);
                startActivity(inext);
                finish();

            }
        });

        age_below_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgeOption.this,activity_option4.class);
                startActivity(intent);
                finish();
            }
        });

        age_above.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgeOption.this,activity_option4.class);
                startActivity(intent);
                finish();
            }
        });

    }
}