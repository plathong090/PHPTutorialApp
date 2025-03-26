package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz9Activity extends AppCompatActivity {

    // RadioGroup สำหรับแต่ละข้อคำถาม
    RadioGroup radioGroup1, radioGroup2, radioGroup3;
    Button backquiz8, nextquiz10, check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz9);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        backquiz8 = findViewById(R.id.back);
        nextquiz10 = findViewById(R.id.next);
        check = findViewById(R.id.check);

        backquiz8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz9Activity.this, Quiz8Activity.class);
                startActivity(intent);
                finish();
            }
        });

        nextquiz10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz9Activity.this, Quiz10Activity.class);
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
            Toast.makeText(Quiz9Activity.this, "กรุณาตอบคำถามให้ครบ", Toast.LENGTH_SHORT).show();
        } else {
            String message = "คำตอบที่ถูกต้อง:\n";

            int selectedId1 = radioGroup1.getCheckedRadioButtonId();
            RadioButton selectedButton1 = findViewById(selectedId1);
            if (selectedButton1 != null && selectedButton1.getText().toString().equals("ตรวจสอบค่าของตัวแปรและดำเนินการตามกรณีที่ตรงกับเงื่อนไข")) {
                message += "ข้อ 1: ถูกต้อง\n";
            } else {
                message += "ข้อ 1: ผิด\n";
            }

            int selectedId2 = radioGroup2.getCheckedRadioButtonId();
            RadioButton selectedButton2 = findViewById(selectedId2);
            if (selectedButton2 != null && selectedButton2.getText().toString().equals("Tuesday")) {
                message += "ข้อ 2: ถูกต้อง\n";
            } else {
                message += "ข้อ 2: ผิด\n";
            }

            int selectedId3 = radioGroup3.getCheckedRadioButtonId();
            RadioButton selectedButton3 = findViewById(selectedId3);
            if (selectedButton3 != null && selectedButton3.getText().toString().equals("break")) {
                message += "ข้อ 3: ถูกต้อง\n";
            } else {
                message += "ข้อ 3: ผิด\n";
            }
            Toast.makeText(Quiz9Activity.this, message, Toast.LENGTH_LONG).show();
        }
    }
}
