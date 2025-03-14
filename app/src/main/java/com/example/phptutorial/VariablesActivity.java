package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class VariablesActivity extends AppCompatActivity implements View.OnClickListener{
    Button backvariables , nextvariables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_variables);

        backvariables = findViewById(R.id.backvariables);
        nextvariables = findViewById(R.id.nextvariable);
        backvariables.setOnClickListener(this);
        nextvariables.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backvariables) {
            Intent back = new Intent(VariablesActivity.this, CommentsActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextvariable) {
            Intent next = new Intent(VariablesActivity.this, EchoPrintActivity.class);
            startActivity(next);
        } //can not next file
    }
}