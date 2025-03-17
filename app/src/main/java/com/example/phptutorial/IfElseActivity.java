package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class IfElseActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ifelseelseif);

        Button backifelse = findViewById(R.id.backifelse);
        Button nextifelse = findViewById(R.id.nextifelse);

        backifelse.setOnClickListener(this);
        nextifelse.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backifelse) {
            Intent back = new Intent(IfElseActivity.this, OperatorsActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextifelse) {
            Intent next = new Intent(IfElseActivity.this,SwitchActivity.class);
            startActivity(next);
        }

    }
}
