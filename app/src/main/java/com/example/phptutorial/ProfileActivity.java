package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    Button exerciseProfile , loginProfile;
    TextView usernameProfile;
    Database DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        usernameProfile = findViewById(R.id.usernameProfile);
        exerciseProfile = findViewById(R.id.exerciseProfile);
        loginProfile = findViewById(R.id.loginProfile);
        loginProfile.setOnClickListener(this);
        exerciseProfile.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        DB = new Database(this);

        String UserID = getIntent().getStringExtra("UserID");
        String Username = getIntent().getStringExtra("Username");
        usernameProfile.setText(Username);

        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;
                if (item.getItemId() == R.id.home) {
                    intent = new Intent(ProfileActivity.this, MainActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(ProfileActivity.this, MenuActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(ProfileActivity.this, QuizActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.exerciseProfile) {
            Intent exercisePage = new Intent(ProfileActivity.this , QuizActivity.class);
            String UserID = getIntent().getStringExtra("UserID");
            String Username = getIntent().getStringExtra("Username");
            exercisePage.putExtra("UserID" , UserID);
            exercisePage.putExtra("Username" , Username);
            startActivity(exercisePage);
        } else if (view.getId() == R.id.loginProfile) {
            Intent lgPage = new Intent(ProfileActivity.this, LoginProfileActivity.class);
            startActivity(lgPage);
        }
    }
}