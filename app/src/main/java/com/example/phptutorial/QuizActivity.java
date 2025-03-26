package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {
    ListView listquiz;
    String[] itemsquiz = {
            "แบบทดสอบก่อนเรียน" , "แบบทดสอบ : ไวยากรณ์พื้นฐาน" , "แบบทดสอบ : คำสั่ง echo และ print" , "แบบทดสอบ : การเขียน Comment" ,
            "แบบทดสอบ : ชนิดของข้อมูล" , "แบบทดสอบ : การตั้งตัวแปร Variables" , "แบบทดสอบ : ตัวดำเนินการ" , "แบบทดสอบ : การใช้ if-else" ,
            "แบบทดสอบ : การใช้ Switch" , "แบบทดสอบ : การใช้ Loop" , "แบบทดสอบ : ฟังก์ชัน" , "แบบทดสอบ : อาเรย์"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        listquiz = findViewById(R.id.listquiz);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemsquiz);
        listquiz.setAdapter(adapter);
        listquiz.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = (String) listquiz.getItemAtPosition(i);
        Intent intent = null;

        if (item.equals("แบบทดสอบก่อนเรียน")) {
            intent = new Intent(QuizActivity.this, Quiz1Activity.class);
        } else if (item.equals("แบบทดสอบ : ไวยากรณ์พื้นฐาน")) {
            intent = new Intent(QuizActivity.this, Quiz2Activity.class);
        } else if (item.equals("แบบทดสอบ : คำสั่ง echo และ print")) {
            intent = new Intent(QuizActivity.this, Quiz3Activity.class);
        } else if (item.equals("แบบทดสอบ : การเขียน Comment")) {
            intent = new Intent(QuizActivity.this, Quiz4Activity.class);
        } else if (item.equals("แบบทดสอบ : ชนิดของข้อมูล")) {
            intent = new Intent(QuizActivity.this, Quiz5Activity.class);
        } else if (item.equals("แบบทดสอบ : การตั้งตัวแปร Variables")) {
            intent = new Intent(QuizActivity.this, Quiz6Activity.class);
        } else if (item.equals("แบบทดสอบ : ตัวดำเนินการ")) {
            intent = new Intent(QuizActivity.this, Quiz7Activity.class);
        } else if (item.equals("แบบทดสอบ : การใช้ if-else")) {
            intent = new Intent(QuizActivity.this, Quiz8Activity.class);
        } else if (item.equals("แบบทดสอบ : การใช้ Switch")) {
            intent = new Intent(QuizActivity.this, Quiz9Activity.class);
        } else if (item.equals("แบบทดสอบ : การใช้ Loop")) {
            intent = new Intent(QuizActivity.this, Quiz10Activity.class);
        } else if (item.equals("แบบทดสอบ : ฟังก์ชัน")) {
            intent = new Intent(QuizActivity.this, Quiz11Activity.class);
        } else if (item.equals("แบบทดสอบ : อาเรย์")) {
            intent = new Intent(QuizActivity.this, Quiz12Activity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
