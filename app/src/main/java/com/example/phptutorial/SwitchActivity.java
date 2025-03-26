package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SwitchActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_switch);

        Button backswitch = findViewById(R.id.backswitch);
        Button nextswitch = findViewById(R.id.nextswitch);

        backswitch.setOnClickListener(this);
        nextswitch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backswitch) {
            Intent back = new Intent(SwitchActivity.this, IfElseActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextswitch) {
           Intent next = new Intent(SwitchActivity.this,LoopActivity.class);
            startActivity(next);
        }

    }
}
