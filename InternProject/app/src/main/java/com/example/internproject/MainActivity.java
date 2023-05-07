package com.example.internproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText email,number;
    TextView signup;
    Button login;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth=FirebaseAuth.getInstance();
        email=findViewById(R.id.login_email);
        number=findViewById(R.id.login_mobile);
        signup=findViewById(R.id.toSignup);
        login=findViewById(R.id.login);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }
    void login(){
        String Email=email.getText().toString();
        String Phone=number.getText().toString();
        if (Email.isEmpty() || Phone.isEmpty()){
            Toast.makeText(MainActivity.this,"Please enter email and mobile no.",Toast.LENGTH_LONG).show();

        }
        else{
            auth.signInWithEmailAndPassword(Email,Phone)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(MainActivity.this,"login Successfully!",Toast.LENGTH_LONG).show();
                                Intent intent=new Intent(MainActivity.this,Option3.class);
                                startActivity(intent);
                            }
                        }
                    });
        }

    }
}