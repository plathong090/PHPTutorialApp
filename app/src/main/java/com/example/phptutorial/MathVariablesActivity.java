package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MathVariablesActivity extends AppCompatActivity implements View.OnClickListener{
    Button backmagic , nextmagic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_magicconstants);

        backmagic = findViewById(R.id.backmagic);
        nextmagic = findViewById(R.id.nextmagic);
        backmagic.setOnClickListener(this);
        nextmagic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backmagic) {
            Intent back = new Intent(MathVariablesActivity.this, CastingActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextmagic) {
            Intent next = new Intent(MathVariablesActivity.this, ConstantsActivity.class);
            startActivity(next);
        }
    }
}