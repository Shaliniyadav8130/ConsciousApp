package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option12 extends AppCompatActivity {

    AppCompatButton strongly_agree,somewhat_agree,little_agree,nor_disagree,little_disagree,somewhat_disagree,strongly_disagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option12);

        strongly_agree = findViewById(R.id.option12_strongly_agree);
        somewhat_agree = findViewById(R.id.option12_somewhat_agree);
        little_agree = findViewById(R.id.option12_little_agree);
        nor_disagree = findViewById(R.id.option12_neither_agree);
        little_disagree = findViewById(R.id.option12_little_disagree);
        somewhat_disagree = findViewById(R.id.option12_somewhat_disagree);
        strongly_disagree = findViewById(R.id.option12_strongly_disagree);

        strongly_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        little_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        nor_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        little_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });

        strongly_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option12.this,option13.class);
                startActivity(intent);
                finish();
            }
        });
    }
}