package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option10 extends AppCompatActivity {

    AppCompatButton strongly_agree,somewhat_agree,little_agree,nor_agree,little_disagree,somewhat_disagree,strongly_disagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option10);

        strongly_agree = findViewById(R.id.option10_strongly_agree);
        somewhat_agree = findViewById(R.id.option10_somewhat_agree);
        little_agree = findViewById(R.id.option10_little_agree);
        nor_agree = findViewById(R.id.option10_neither_agree);
        little_disagree = findViewById(R.id.option10_little_disagree);
        somewhat_disagree = findViewById(R.id.option10_somewhat_disagree);
        strongly_disagree = findViewById(R.id.option10_strongly_disagree);

        strongly_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });
        little_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });

        nor_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });

        little_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });

        strongly_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option10.this,option11.class);
                startActivity(intent);
                finish();
            }
        });


    }
}