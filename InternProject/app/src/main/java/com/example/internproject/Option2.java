package com.example.internproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Option2 extends AppCompatActivity {
    AppCompatButton newUser,oldUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);
        newUser=findViewById(R.id.new_member);
        oldUser=findViewById(R.id.existing_member);
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option2.this,SignUp.class);
                startActivity(intent);
                finish();
            }
        });
        oldUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Option2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}