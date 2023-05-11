package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option9 extends AppCompatActivity {

    AppCompatButton strongly_agree,somewhat_agree,little_agree,nor_agree,little_disagree,somewhat_disagree,strongly_disagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option9);

        strongly_agree = findViewById(R.id.option9_strongly_agree);
        somewhat_agree = findViewById(R.id.option9_somewhat_agree);
        little_agree = findViewById(R.id.option9_little_agree);
        nor_agree = findViewById(R.id.option9_neither_agree);
        little_disagree = findViewById(R.id.option9_little_disagree);
        somewhat_disagree = findViewById(R.id.option9_somewhat_disagree);
        strongly_disagree = findViewById(R.id.option9_strongly_disagree);

        strongly_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        little_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        nor_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        little_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        somewhat_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

        strongly_disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option9.this,option10.class);
                startActivity(intent);
                finish();
            }
        });

    }
}