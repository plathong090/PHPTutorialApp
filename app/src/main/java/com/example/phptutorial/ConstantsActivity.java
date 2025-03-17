package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ConstantsActivity extends AppCompatActivity implements View.OnClickListener{
    Button backconstants , nextconstants;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_constants);

        backconstants = findViewById(R.id.backconstants);
        nextconstants = findViewById(R.id.nextconstants);
        backconstants.setOnClickListener(this);
        nextconstants.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backconstants) {
            Intent back = new Intent(ConstantsActivity.this, MathVariablesActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextconstants) {
            Intent next = new Intent(ConstantsActivity.this, PredefinedConstantsActivity.class);
            startActivity(next);
        }
    }
}