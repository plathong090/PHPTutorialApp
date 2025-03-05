package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listmenu;
    String[] itemsmenu = {
            "บทนำ" , "การติดตั้ง PHP" , "Syntax PHP" , "การ comment" , "การตั้งตัวแปร Variables" ,
            "คำสั่ง echo และ print" , "ประเภทของข้อมูล" , "Strings" , "Numbers" , "Casting" ,
            "ตัวแปรคณิตศาสตร์" , "ค่าคงที่" , "ค่าคงที่ที่กำหนดไว้ล่วงหน้า" , "ตัวดำเนินการ" , "if-else" ,
            "Switch" , "Loop" , "ฟังก์ชัน" , "อาเรย์" , "ตัวแปรแบบ Globals" , "Regular Expressions"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listmenu = findViewById(R.id.listmenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemsmenu);
        listmenu.setAdapter(adapter);
        listmenu.setOnItemClickListener(this);

        Button backButton = findViewById(R.id.bckButton);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue = (String) listmenu.getItemAtPosition(position);
        Toast.makeText(this, "Position: " + position + " Item clicked: " + itemValue, Toast.LENGTH_SHORT).show();
    }
}
