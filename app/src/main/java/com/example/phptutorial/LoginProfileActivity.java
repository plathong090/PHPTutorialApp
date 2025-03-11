package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginProfileActivity extends AppCompatActivity {
    EditText usernamelogin, passwordlogin;
    Button buttonlogin;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginprofile);

        usernamelogin = findViewById(R.id.usernamelogin);
        passwordlogin = findViewById(R.id.passwordlogin);
        buttonlogin = findViewById(R.id.buttonlogin);
        registerLink = findViewById(R.id.registerlogin);

        buttonlogin.setOnClickListener(v -> {
            String username = usernamelogin.getText().toString();
            String password = passwordlogin.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "กรุุณากรอกข้อมูล", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(LoginProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        registerLink.setOnClickListener(v -> {
            Intent intent = new Intent(LoginProfileActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}