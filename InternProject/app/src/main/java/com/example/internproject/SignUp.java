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

import org.w3c.dom.Text;

public class SignUp extends AppCompatActivity {
    EditText fname,email,mobile,lname;
    Button signup;
    TextView signin;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth=FirebaseAuth.getInstance();
        setContentView(R.layout.activity_sign_up);
        fname=findViewById(R.id.signup_firstname);
        lname=findViewById(R.id.signup_lastname);
        email=findViewById(R.id.signup_email);
        mobile=findViewById(R.id.signup_mobile);
        signin=findViewById(R.id.toSignin);
        signup=findViewById(R.id.signup_btn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUp.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

    }

    void registerUser(){
        String f_name=fname.getText().toString();
        String l_name=lname.getText().toString();
        String Email=email.getText().toString();
        String Number=mobile.getText().toString();
        if (f_name.isEmpty() || l_name.isEmpty() || Email.isEmpty() || Number.isEmpty()){
            Toast.makeText(SignUp.this,"Please enter the details completely.",Toast.LENGTH_LONG).show();

        }
        else{
            auth.createUserWithEmailAndPassword(Email,Number)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(SignUp.this,"Registered Successfully!",Toast.LENGTH_LONG).show();
                                Intent intent= new Intent(SignUp.this,Option3.class);
                                startActivity(intent);
                                finish();
                            }
                        }
                    });
        }

    }
}