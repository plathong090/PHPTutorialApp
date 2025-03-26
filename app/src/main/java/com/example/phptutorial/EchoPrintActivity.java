package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EchoPrintActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_echoprint);

        Button backecho = findViewById(R.id.backecho);
        Button nextecho = findViewById(R.id.nextecho);

        backecho.setOnClickListener(this);
        nextecho.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.lessons);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(EchoPrintActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(EchoPrintActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(EchoPrintActivity.this, QuizActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(EchoPrintActivity.this, ProfileActivity.class);
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
        if (view.getId() == R.id.backecho) {
            Intent back = new Intent(EchoPrintActivity.this, SyntaxActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextecho) {
            Intent next = new Intent(EchoPrintActivity.this,CommentsActivity.class);
            startActivity(next);
        }
    }
}