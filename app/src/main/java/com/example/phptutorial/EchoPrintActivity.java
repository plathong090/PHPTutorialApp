package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class EchoPrintActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_echoprint);

        Button backecho = findViewById(R.id.backecho);
        Button nextecho = findViewById(R.id.nextecho);

        backecho.setOnClickListener(this);
        nextecho.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backsyntax) {
            Intent back = new Intent(EchoPrintActivity.this, VariablesActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextsyntax) {
//            Intent next = new Intent(EchoPrintActivity.this,DataTypesActivity.class);
//            startActivity(next);
        }
    }
}