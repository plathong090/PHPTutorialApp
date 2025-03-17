package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FunctionActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_function);

        Button backfunc = findViewById(R.id.backfunction);
        Button nextfunc = findViewById(R.id.nextfunction);

        backfunc.setOnClickListener(this);
        nextfunc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backfunction) {
            Intent back = new Intent(FunctionActivity.this, LoopActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextfunction) {
            Intent next = new Intent(FunctionActivity.this,ArrayActivity.class);
            startActivity(next);
        }

    }
}
