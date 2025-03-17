package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class GlobalsActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_superglobals);

        Button backsuper = findViewById(R.id.backsuper);
        Button nextsuper = findViewById(R.id.nextsuper);

        backsuper.setOnClickListener(this);
        nextsuper.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backsuper) {
            Intent back = new Intent(GlobalsActivity.this, ArrayActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextsuper) {
            Intent next = new Intent(GlobalsActivity.this,RegexActivity.class);
            startActivity(next);
        }

    }
}
