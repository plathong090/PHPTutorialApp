package com.example.phptutorial;

import android.content.Intent;
import android.database.Cursor;
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
    Database DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginprofile);

        usernamelogin = findViewById(R.id.usernamelogin);
        passwordlogin = findViewById(R.id.passwordlogin);
        buttonlogin = findViewById(R.id.buttonlogin);
        registerLink = findViewById(R.id.registerlogin);
        DB = new Database(this);

        buttonlogin.setOnClickListener(v -> {
            String username = usernamelogin.getText().toString();
            String password = passwordlogin.getText().toString();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "กรุุณากรอกข้อมูล", Toast.LENGTH_SHORT).show();
            } else {
                Cursor res = DB.getuser(username,password);
                if (res != null) {
                    res.moveToFirst();
                    Intent i = new Intent(LoginProfileActivity.this, MainActivity.class);
                    i.putExtra("UserID" , res.getString(0));
                    i.putExtra("check" , true);
                    i.putExtra("Username" , res.getString(1));
                    startActivity(i);
                    finish();
                } else {
                    Toast.makeText(this, "รข้อมูลไม่ถุกต้อง", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerLink.setOnClickListener(v -> {
            Intent intent = new Intent(LoginProfileActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}