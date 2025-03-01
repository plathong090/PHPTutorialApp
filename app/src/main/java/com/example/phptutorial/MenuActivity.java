package com.example.phptutorial;

import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] itemsmenu = {"บทนำ" , "การติดตั้ง PHP" , "Syntax PHP" , "การ comment" , "การตั้งตัวแปร Variables" ,
                        "คำสั่ง echo และ print" , "ประเภทของข้อมูล" , "Strings" , "Numbers" , "Casting" ,
                        "ตัวแปรคณิตศาสตรื" , "ค่าคงที่" , "ค่าคงที่ที่กำหนดไว้ล่วงหน้า" , "ตัวดำเนินการ" , "if-else" ,
                        "Switch" , "Loop" , "ฟังก์ชัน" , "อาเรย์" , "ตัวแปรแบบ Globals" , "Regular Expressions"};
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
