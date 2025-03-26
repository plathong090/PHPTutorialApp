package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DataTypesActivity extends AppCompatActivity implements View.OnClickListener{
    Button backdatatype , nextdatatype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datatype);

        backdatatype = findViewById(R.id.backdatatype);
        nextdatatype = findViewById(R.id.nextdatatype);
        backdatatype.setOnClickListener(this);
        nextdatatype.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backdatatype) {
            Intent back = new Intent(DataTypesActivity.this, CommentsActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextdatatype) {
            Intent next = new Intent(DataTypesActivity.this, VariablesActivity.class);
            startActivity(next);
        }
    }
}