package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoopActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loops);

        Button backloops = findViewById(R.id.backloops);
        Button nextloops = findViewById(R.id.nextloops);

        backloops.setOnClickListener(this);
        nextloops.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backloops) {
            Intent back = new Intent(LoopActivity.this, SwitchActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextloops) {
            Intent next = new Intent(LoopActivity.this,FunctionActivity.class);
            startActivity(next);
        }
    }
}
