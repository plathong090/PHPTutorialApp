package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Quiz5Activity extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3;
    Button backquiz4, nextquiz6, check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        backquiz4 = findViewById(R.id.back);
        nextquiz6 = findViewById(R.id.next);
        check = findViewById(R.id.check);

        backquiz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz5Activity.this, Quiz4Activity.class);
                startActivity(intent);
                finish();
            }
        });

        nextquiz6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz5Activity.this, Quiz6Activity.class);
                startActivity(intent);
                finish();
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswers();
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.exercise);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(Quiz5Activity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(Quiz5Activity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(Quiz5Activity.this, QuizActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(Quiz5Activity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void checkAnswers() {
        if (radioGroup1.getCheckedRadioButtonId() == -1 ||
                radioGroup2.getCheckedRadioButtonId() == -1 ||
                radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(Quiz5Activity.this, "กรุณาตอบคำถามให้ครบ", Toast.LENGTH_SHORT).show();
        } else {
            String message = "คำตอบที่ถูกต้อง:\n";

            int selectedId1 = radioGroup1.getCheckedRadioButtonId();
            RadioButton selectedButton1 = findViewById(selectedId1);
            if (selectedButton1 != null && selectedButton1.getText().toString().equals("int")) {
                message += "ข้อ 1: ถูกต้อง\n";
            } else {
                message += "ข้อ 1: ผิด\n";
            }

            int selectedId2 = radioGroup2.getCheckedRadioButtonId();
            RadioButton selectedButton2 = findViewById(selectedId2);
            if (selectedButton2 != null && selectedButton2.getText().toString().equals("string")) {
                message += "ข้อ 2: ถูกต้อง\n";
            } else {
                message += "ข้อ 2: ผิด\n";
            }

            int selectedId3 = radioGroup3.getCheckedRadioButtonId();
            RadioButton selectedButton3 = findViewById(selectedId3);
            if (selectedButton3 != null && selectedButton3.getText().toString().equals("boolean")) {
                message += "ข้อ 3: ถูกต้อง\n";
            } else {
                message += "ข้อ 3: ผิด\n";
            }
            Toast.makeText(Quiz5Activity.this, message, Toast.LENGTH_LONG).show();
        }
    }
}
