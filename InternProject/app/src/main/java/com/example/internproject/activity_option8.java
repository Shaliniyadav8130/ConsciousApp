package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_option8 extends AppCompatActivity {

    AppCompatButton str_agree,some_agree,little_agree,Neither_Agree,little_disagree,somewhat_disagree,strong_disagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option8);

        str_agree = findViewById(R.id.option8_strongly_agree);
        some_agree = findViewById(R.id.option8_somewhat_agree);
        little_agree = findViewById(R.id.option8_little_agree);
        Neither_Agree = findViewById(R.id.option8_neither_agree);
        little_disagree = findViewById(R.id.option8_little_disagree);
        somewhat_disagree = findViewById(R.id.option8_somewhat_disagree);
        strong_disagree = findViewById(R.id.option8_strongly_disagree);

        str_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        some_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        little_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        Neither_Agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        little_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

        strong_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option8.this,option9.class);
                startActivity(intent);
                finish();
            }
        });

    }
}