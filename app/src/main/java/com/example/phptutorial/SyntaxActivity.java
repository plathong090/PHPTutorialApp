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

public class SyntaxActivity extends AppCompatActivity implements View.OnClickListener{
    Button backsyntax, nextsyntax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_syntax);

        backsyntax = findViewById(R.id.backsyntax);
        nextsyntax = findViewById(R.id.nextsyntax);
        backsyntax.setOnClickListener(this);
        nextsyntax.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;
                if (item.getItemId() == R.id.home) {
                    intent = new Intent(SyntaxActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(SyntaxActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(SyntaxActivity.this, ExerciseActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(SyntaxActivity.this, ProfileActivity.class);
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
        if (view.getId() == R.id.backsyntax) {
            Intent back = new Intent(SyntaxActivity.this, InstallActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextsyntax) {
            Intent next = new Intent(SyntaxActivity.this, CommentsActivity.class);
            startActivity(next);
        }
    }
}