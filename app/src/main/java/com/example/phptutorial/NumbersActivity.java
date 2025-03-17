package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NumbersActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_numbers);

        Button backnumbers = findViewById(R.id.backnumbers);
        backnumbers.setOnClickListener(this);
        Button nextnumbers = findViewById(R.id.nextnumbers);
        nextnumbers.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backnumbers) {
            Intent back = new Intent(NumbersActivity.this, StringsActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextnumbers) {
            Intent next = new Intent(NumbersActivity.this,CastingActivity.class);
            startActivity(next);
        }
    }
}
