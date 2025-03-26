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

public class Quiz6Activity extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3;
    Button backquiz5, nextquiz7, check;
    Database DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);

        String UserID = getIntent().getStringExtra("UserID");
        String Username = getIntent().getStringExtra("Username");

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        backquiz5 = findViewById(R.id.back);
        nextquiz7 = findViewById(R.id.next);
        check = findViewById(R.id.check);

        backquiz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz6Activity.this, Quiz5Activity.class);
                intent.putExtra("UserID" , UserID);
                intent.putExtra("Username" , Username);
                startActivity(intent);
                finish();
            }
        });

        nextquiz7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz6Activity.this, Quiz7Activity.class);
                intent.putExtra("UserID" , UserID);
                intent.putExtra("Username" , Username);
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
                    intent = new Intent(Quiz6Activity.this, MainActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(Quiz6Activity.this, MenuActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(Quiz6Activity.this, QuizActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(Quiz6Activity.this, ProfileActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
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
            Toast.makeText(Quiz6Activity.this, "กรุณาตอบคำถามให้ครบ", Toast.LENGTH_SHORT).show();
        } else {
            String message = "คำตอบที่ถูกต้อง:\n";
            int score = 0;

            int selectedId1 = radioGroup1.getCheckedRadioButtonId();
            RadioButton selectedButton1 = findViewById(selectedId1);
            if (selectedButton1 != null && selectedButton1.getText().toString().equals("ตัวอักษร A-Z, a-z, เครื่องหมาย _ และตัวเลข (ยกเว้นตัวเลขที่ตำแหน่งแรก)")) {
                message += "ข้อ 1: ถูกต้อง\n";
                score++;
            } else {
                message += "ข้อ 1: ผิด\n";
            }

            int selectedId2 = radioGroup2.getCheckedRadioButtonId();
            RadioButton selectedButton2 = findViewById(selectedId2);
            if (selectedButton2 != null && selectedButton2.getText().toString().equals("$")) {
                message += "ข้อ 2: ถูกต้อง\n";
                score++;
            } else {
                message += "ข้อ 2: ผิด\n";
            }

            int selectedId3 = radioGroup3.getCheckedRadioButtonId();
            RadioButton selectedButton3 = findViewById(selectedId3);
            if (selectedButton3 != null && selectedButton3.getText().toString().equals("$")) {
                message += "ข้อ 3: ถูกต้อง\n";
                score++;
            } else {
                message += "ข้อ 3: ผิด\n";
            }

            String UserID = getIntent().getStringExtra("UserID");
            DB = new Database(this);
            boolean res = DB.insertScore(Integer.parseInt(UserID),6, score);
            if (res) {
                Toast.makeText(Quiz6Activity.this, "ได้คะแนนทั้งหมด : " + score + " คะแนน", Toast.LENGTH_LONG).show();
                Toast.makeText(Quiz6Activity.this, message, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(Quiz6Activity.this, "เกิดข้อผิดพลาด", Toast.LENGTH_LONG).show();
            }
        }
    }
}