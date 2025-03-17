package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RegexActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_regex);

        Button backregex = findViewById(R.id.backregex);
        Button nextregex = findViewById(R.id.nextregex);

        backregex.setOnClickListener(this);
        nextregex.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backregex) {
            Intent back = new Intent(RegexActivity.this, GlobalsActivity.class);
            startActivity(back);
        }

    }
}
