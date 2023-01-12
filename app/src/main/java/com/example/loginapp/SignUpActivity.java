package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Patterns;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {
    // Declare references to the views in the layout
    private TextInputLayout usernameLayout;
    private TextInputEditText usernameEditText;
    private TextInputLayout emailLayout;
    private TextInputEditText emailEditText;
    private TextInputLayout passwordLayout;
    private TextInputEditText passwordEditText;
    private TextInputLayout phoneLayout;
    private TextInputEditText phoneEditText;

    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Initialize references to the views in the layout
        usernameLayout = findViewById(R.id.username);
        usernameEditText = findViewById(R.id.username_edit_text);
        emailLayout = findViewById(R.id.email);
        emailEditText = findViewById(R.id.email_edit_text);
        passwordLayout = findViewById(R.id.password);
        passwordEditText = findViewById(R.id.password_edit_text);
        phoneLayout = findViewById(R.id.phone);
        phoneEditText = findViewById(R.id.phone_edit_text);


        signUpBtn = findViewById(R.id.signUpButton);


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    // Form is valid, do something here (e.g. create the account)
                }
            }
        });
    }

    private boolean validateForm() {
        boolean isValid = true;

        // Validate the username
        if (usernameEditText.getText().toString().isEmpty()) {
            usernameLayout.setError("Username is required");
            isValid = false;
        } else {
            usernameLayout.setError(null);
        }

        // Validate the password
        if (passwordEditText.getText().toString().isEmpty()) {
            passwordLayout.setError("Password is required");
            isValid = false;
        } else {
            passwordLayout.setError(null);
        }

        // Validate the email
        if (emailEditText.getText().toString().isEmpty()) {
            emailLayout.setError("Email is required");
            isValid = false;
        } else {
            emailLayout.setError(null);
        }

        return isValid;

    }
}

