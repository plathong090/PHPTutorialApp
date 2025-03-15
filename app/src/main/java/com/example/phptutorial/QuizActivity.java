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
    String[] itemsquiz = {"แบบทดสอบก่อนเรียน" , "แบบทดสอบ : ไวยากรณ์" , "แบบทดสอบ : Comment" , "แบบทดสอบ : Variables" ,
            "แบบทดสอบ : คำสั่ง echo และ print" , "แบบทดสอบ : ประเภทของข้อมูล" , "แบบทดสอบ : Strings" ,
            "แบบทดสอบ : Numbers" , "แบบทดสอบ : การเปลี่ยนแปลงประเภทข้อมูล" ,"แบบทดสอบ : ตัวแปรคณิตศาสตร์" ,
            "แบบทดสอบ : ค่าคงที่" , "แบบทดสอบ : ค่าคงที่ที่กำหนดไว้ล่วงหน้า" , "แบบทดสอบ : ตัวดำเนินการ" ,
            "แบบทดสอบ : if-else" , "แบบทดสอบ : Switch" , "แบบทดสอบ : Loop" ,
            "แบบทดสอบ : ฟังก์ชัน" , "แบบทดสอบ : อาเรย์" , "แบบทดสอบ : ตัวแปรแบบ Globals" ,
            "แบบทดสอบ : Regular Expressions"};
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
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
