package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.startBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    // ถ้าเลือก Exercise, ไปที่ ExerciseActivity
                    intent = new Intent(MainActivity.this, ExerciseActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    // ถ้าเลือก Profile, ไปที่ ProfileActivity
                    intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}