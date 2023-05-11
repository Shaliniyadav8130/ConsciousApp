package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_option7 extends AppCompatActivity {

    AppCompatButton stronglyagree,somewhatagree,littleagree,agreenor,disagree,somewhatdisagree,stronglydisagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option7);

        stronglyagree = findViewById(R.id.strongly_agree2);
        somewhatagree = findViewById(R.id.somewhat_agree2);
        littleagree = findViewById(R.id.little_agree);
        agreenor = findViewById(R.id.neither_agree);
        disagree = findViewById(R.id.little_disagree);
        somewhatdisagree = findViewById(R.id.somewhat_disagree);
        stronglydisagree = findViewById(R.id.strongly_disagree);

        stronglyagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        somewhatagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        littleagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        agreenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        disagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        somewhatdisagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });

        stronglydisagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_option7.this,activity_option8.class);
                startActivity(intent);
                finish();
            }
        });


    }
}