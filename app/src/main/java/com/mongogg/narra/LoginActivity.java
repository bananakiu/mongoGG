package com.mongogg.narra;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Button loginButton = findViewById(R.id.login_register_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.login_email_edit_text);
                EditText pinEditText = findViewById(R.id.login_password_edit_text);
                final String email = emailEditText.getText().toString();
                final String pin = pinEditText.getText().toString();
                firebaseAuth.signInWithEmailAndPassword(email, pin).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            Intent i = new Intent(LoginActivity.this, com.mongogg.narra.MainActivity.class);
                            startActivity(i);
                        } else {
                            Toast.makeText(LoginActivity.this, "Log in failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        Button registerButton = findViewById(R.id.login_register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, com.mongogg.narra.RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}
