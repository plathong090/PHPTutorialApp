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

public class Quiz1Activity extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3;
    Button backquiz1, nextquiz1, check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        backquiz1 = findViewById(R.id.backquiz1);
        nextquiz1 = findViewById(R.id.nextquiz1);
        check = findViewById(R.id.check);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.exercise);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(Quiz1Activity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(Quiz1Activity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(Quiz1Activity.this, QuizActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(Quiz1Activity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                } else {
                    return false;
                }
            }
        });

        backquiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Activity.this, QuizActivity.class);
                startActivity(intent);
                finish();
            }
        });

        nextquiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Activity.this, Quiz2Activity.class);
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
    }

    private void checkAnswers() {
        if (radioGroup1.getCheckedRadioButtonId() == -1 ||
                radioGroup2.getCheckedRadioButtonId() == -1 ||
                radioGroup3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(Quiz1Activity.this, "กรุณาตอบคำถามให้ครบ", Toast.LENGTH_SHORT).show();
        } else {
            String message = "คำตอบที่ถูกต้อง:\n";

            //ข้อที่ 1
            int selectedId1 = radioGroup1.getCheckedRadioButtonId();
            RadioButton selectedButton1 = findViewById(selectedId1);
            if (selectedButton1 != null && selectedButton1.getText().toString().equals("Hypertext Preprocessor")) {
                message += "ข้อ 1: ถูกต้อง\n";
            } else {
                message += "ข้อ 1: ผิด\n";
            }

            //ข้อที่ 2
            int selectedId2 = radioGroup2.getCheckedRadioButtonId();
            RadioButton selectedButton2 = findViewById(selectedId2);
            if (selectedButton2 != null && selectedButton2.getText().toString().equals("echo()")) {
                message += "ข้อ 2: ถูกต้อง\n";
            } else {
                message += "ข้อ 2: ผิด\n";
            }

            //ข้อที่ 3
            int selectedId3 = radioGroup3.getCheckedRadioButtonId();
            RadioButton selectedButton3 = findViewById(selectedId3);
            if (selectedButton3 != null && selectedButton3.getText().toString().equals("Server")) {
                message += "ข้อ 3: ถูกต้อง\n";
            } else {
                message += "ข้อ 3: ผิด\n";
            }

            Toast.makeText(Quiz1Activity.this, message, Toast.LENGTH_LONG).show();
        }
    }
}
