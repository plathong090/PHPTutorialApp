package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CommentsActivity extends AppCompatActivity implements View.OnClickListener{
    Button backcomment, nextcomment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_comments);

        backcomment = findViewById(R.id.backcomment);
        nextcomment = findViewById(R.id.nextcomment);
        backcomment.setOnClickListener(this);
        nextcomment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.backcomment) {
            Intent back = new Intent(CommentsActivity.this, SyntaxActivity.class);
            startActivity(back);
        } else if (view.getId() == R.id.nextcomment) {
            Intent next = new Intent(CommentsActivity.this, VariablesActivity.class);
            startActivity(next);
        }
    }
}