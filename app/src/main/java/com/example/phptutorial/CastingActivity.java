package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CastingActivity extends AppCompatActivity implements View.OnClickListener{
    Button backcasting , nextcasting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_casting);

        backcasting = findViewById(R.id.backcasting);
        nextcasting = findViewById(R.id.nextcasting);
        backcasting.setOnClickListener(this);
        nextcasting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backcasting) {
            Intent back = new Intent(CastingActivity.this, NumbersActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextcasting) {
            Intent next = new Intent(CastingActivity.this, MathVariablesActivity.class);
            startActivity(next);
        }
    }
}