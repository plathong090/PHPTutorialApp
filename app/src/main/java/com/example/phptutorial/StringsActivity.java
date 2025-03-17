package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StringsActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_strings);

        Button backstrings = findViewById(R.id.backstrings);
        backstrings.setOnClickListener(this);
        Button nextstrings = findViewById(R.id.nextstrings);
        nextstrings.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backstrings) {
            Intent back = new Intent(StringsActivity.this, DataTypesActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextstrings) {
            Intent next = new Intent(StringsActivity.this,NumbersActivity.class);
            startActivity(next);
        }
    }
}
