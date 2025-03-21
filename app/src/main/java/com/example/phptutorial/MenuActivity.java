package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listmenu;
    String[] itemsmenu = {
            "สิ่งที่ควรรู้เกี่ยวกับ PHP" , "ไวยากรณ์" , "การเขียน Comment" , "การตั้งตัวแปร Variables" ,
            "คำสั่ง echo และ print" , "ประเภทของข้อมูล" , "Strings" , "Numbers" , "การเปลี่ยนแปลงประเภทข้อมูล" ,
            "ตัวแปรคณิตศาสตร์" , "ค่าคงที่" , "ค่าคงที่ที่กำหนดไว้ล่วงหน้า" , "ตัวดำเนินการ" , "if-else" ,
            "Switch" , "Loop" , "ฟังก์ชัน" , "อาเรย์" , "ตัวแปรแบบ Globals" , "Regular Expressions",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listmenu = findViewById(R.id.listmenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemsmenu);
        listmenu.setAdapter(adapter);
        listmenu.setOnItemClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(MenuActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(MenuActivity.this, MenuActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(MenuActivity.this, QuizActivity.class);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(MenuActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue = (String) listmenu.getItemAtPosition(position);
        Intent intent = null;

        if (itemValue.equals("สิ่งที่ควรรู้เกี่ยวกับ PHP")) {
            intent = new Intent(MenuActivity.this, IntroActivity.class);
        } else if (itemValue.equals("ไวยากรณ์")) {
            intent = new Intent(MenuActivity.this, SyntaxActivity.class);
        } else if (itemValue.equals("การเขียน Comment")) {
            intent = new Intent(MenuActivity.this, CommentsActivity.class);
        } else if (itemValue.equals("การตั้งตัวแปร Variables")) {
            intent = new Intent(MenuActivity.this, VariablesActivity.class);
        } else if (itemValue.equals("คำสั่ง echo และ print")) {
            intent = new Intent(MenuActivity.this, EchoPrintActivity.class);
        } else if (itemValue.equals("ประเภทของข้อมูล")) {
            intent = new Intent(MenuActivity.this, DataTypesActivity.class);
        } else if (itemValue.equals("Strings")) {
            intent = new Intent(MenuActivity.this, StringsActivity.class);
        } else if (itemValue.equals("Numbers")) {
            intent = new Intent(MenuActivity.this, NumbersActivity.class);
        } else if (itemValue.equals("การเปลี่ยนแปลงประเภทข้อมูล")) {
            intent = new Intent(MenuActivity.this, CastingActivity.class);
        } else if (itemValue.equals("ตัวแปรคณิตศาสตร์")) {
            intent = new Intent(MenuActivity.this, MathVariablesActivity.class);
        } else if (itemValue.equals("ค่าคงที่")) {
            intent = new Intent(MenuActivity.this, ConstantsActivity.class);
        } else if (itemValue.equals("ค่าคงที่ที่กำหนดไว้ล่วงหน้า")) {
            intent = new Intent(MenuActivity.this, PredefinedConstantsActivity.class);
        } else if (itemValue.equals("ตัวดำเนินการ")) {
            intent = new Intent(MenuActivity.this, OperatorsActivity.class);
        } else if (itemValue.equals("if-else")) {
            intent = new Intent(MenuActivity.this, IfElseActivity.class);
        } else if (itemValue.equals("Switch")) {
            intent = new Intent(MenuActivity.this, SwitchActivity.class);
        } else if (itemValue.equals("Loop")) {
            intent = new Intent(MenuActivity.this, LoopActivity.class);
        } else if (itemValue.equals("ฟังก์ชัน")) {
            intent = new Intent(MenuActivity.this, FunctionActivity.class);
        } else if (itemValue.equals("อาเรย์")) {
            intent = new Intent(MenuActivity.this, ArrayActivity.class);
        } else if (itemValue.equals("ตัวแปรแบบ Globals")) {
            intent = new Intent(MenuActivity.this, GlobalsActivity.class);
        } else if (itemValue.equals("Regular Expressions")) {
            intent = new Intent(MenuActivity.this, RegexActivity.class);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
