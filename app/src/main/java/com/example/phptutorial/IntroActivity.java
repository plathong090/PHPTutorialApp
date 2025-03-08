package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener {

    Button backintro, nextintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);

        backintro = findViewById(R.id.backintro);
        nextintro = findViewById(R.id.nextintro);
        backintro.setOnClickListener(this);
        nextintro.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(IntroActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(IntroActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
//                } else if (item.getItemId() == R.id.exercise) {
//                    intent = new Intent(MainActivity.this, ExerciseActivity.class);
//                    startActivity(intent);
//                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(IntroActivity.this, ProfileActivity.class);
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

        if (view.getId() == R.id.backintro) {
            Intent back = new Intent(IntroActivity.this, MenuActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextintro) {
            Intent next = new Intent(IntroActivity.this, InstallActivity.class);
            startActivity(next);
        }
    }
}
