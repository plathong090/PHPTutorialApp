package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class OperatorsActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_operator);

        Button backoper = findViewById(R.id.backoperator);
        Button nextoper = findViewById(R.id.nextoperator);

        backoper.setOnClickListener(this);
        nextoper.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backoperator) {
            Intent back = new Intent(OperatorsActivity.this, PredefinedConstantsActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextoperator) {
            Intent next = new Intent(OperatorsActivity.this, IfElseActivity.class);
            startActivity(next);
        }

    }
}