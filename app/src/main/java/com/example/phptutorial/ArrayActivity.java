package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ArrayActivity  extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_arrays);

        Button backarray = findViewById(R.id.backarrays);
        Button nextarray = findViewById(R.id.nextarrays);

        backarray.setOnClickListener(this);
        nextarray.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backarrays) {
            Intent back = new Intent(ArrayActivity.this, FunctionActivity.class);
            startActivity(back);
        } 

    }
}

