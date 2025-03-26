package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LoopActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loops);

        Button backloops = findViewById(R.id.backloops);
        Button nextloops = findViewById(R.id.nextloops);

        backloops.setOnClickListener(this);
        nextloops.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.lessons);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(LoopActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(LoopActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(LoopActivity.this, QuizActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(LoopActivity.this, ProfileActivity.class);
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
        if (view.getId() == R.id.backloops) {
            Intent back = new Intent(LoopActivity.this, SwitchActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextloops) {
            Intent next = new Intent(LoopActivity.this,FunctionActivity.class);
            startActivity(next);
        }
    }
}
