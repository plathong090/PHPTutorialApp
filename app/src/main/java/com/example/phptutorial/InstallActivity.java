package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class InstallActivity extends AppCompatActivity implements View.OnClickListener {
    Button backinstall, nextinstall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_install);

        backinstall = findViewById(R.id.backinstall);
        nextinstall = findViewById(R.id.nextinstall);
        backinstall.setOnClickListener(this);
        nextinstall.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(InstallActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(InstallActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(InstallActivity.this, ExerciseActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(InstallActivity.this, ProfileActivity.class);
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
        if (view.getId() == R.id.backinstall) {
            Intent back = new Intent(InstallActivity.this, IntroActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextinstall) {
            Intent next = new Intent(InstallActivity.this, SyntaxActivity.class);
            startActivity(next);
        }
    }
}