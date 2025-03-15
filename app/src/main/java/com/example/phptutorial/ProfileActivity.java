package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    Button aboutProfile , exerciseProfile , loginProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        aboutProfile = findViewById(R.id.aboutProfile);
        aboutProfile.setOnClickListener(this);
        exerciseProfile = findViewById(R.id.exerciseProfile);
        exerciseProfile.setOnClickListener(this);
        loginProfile = findViewById(R.id.loginProfile);
        loginProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.aboutProfile) {
            Intent aboutPage = new Intent(ProfileActivity.this , AboutProfileActivity.class);
            startActivity(aboutPage);
        } else if (view.getId() == R.id.exerciseProfile) {
            Intent exercisePage = new Intent(ProfileActivity.this , QuizActivity.class);
            startActivity(exercisePage);
        } else if (view.getId() == R.id.loginProfile) {
            Intent lgPage = new Intent(ProfileActivity.this, LoginProfileActivity.class);
            startActivity(lgPage);
        }
    }
}