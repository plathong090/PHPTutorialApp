package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listmenu;
    String[] itemsmenu = {
            "บทนำ" , "การติดตั้ง PHP" , "Syntax PHP" , "การ comment" , "การตั้งตัวแปร Variables" ,
            "คำสั่ง echo และ print" , "ประเภทของข้อมูล" , "Strings" , "Numbers" , "Casting" ,
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
//                } else if (item.getItemId() == R.id.exercise) {
//                    // ถ้าเลือก Exercise, ไปที่ ExerciseActivity
//                    intent = new Intent(MenuActivity.this, ExerciseActivity.class);
//                    startActivity(intent);
//                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    // ถ้าเลือก Profile, ไปที่ ProfileActivity
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

        if (itemValue.equals("บทนำ")) {
            intent = new Intent(MenuActivity.this, IntroActivity.class);
        } else if (itemValue.equals("การติดตั้ง PHP")) {
            intent = new Intent(MenuActivity.this, InstallActivity.class); // หน้า InstallPHPActivity
        }/*  else if (itemValue.equals("Syntax PHP")) {
            intent = new Intent(MenuActivity.this, SyntaxPHPActivity.class); // หน้า SyntaxPHPActivity
        } else if (itemValue.equals("การ comment")) {
            intent = new Intent(MenuActivity.this, CommentActivity.class); // หน้า CommentActivity
        } else if (itemValue.equals("การตั้งตัวแปร Variables")) {
            intent = new Intent(MenuActivity.this, VariablesActivity.class); // หน้า VariablesActivity
        } else if (itemValue.equals("คำสั่ง echo และ print")) {
            intent = new Intent(MenuActivity.this, EchoPrintActivity.class); // หน้า EchoPrintActivity
        } else if (itemValue.equals("ประเภทของข้อมูล")) {
            intent = new Intent(MenuActivity.this, DataTypesActivity.class); // หน้า DataTypesActivity
        } else if (itemValue.equals("Strings")) {
            intent = new Intent(MenuActivity.this, StringsActivity.class); // หน้า StringsActivity
        } else if (itemValue.equals("Numbers")) {
            intent = new Intent(MenuActivity.this, NumbersActivity.class); // หน้า NumbersActivity
        } else if (itemValue.equals("Casting")) {
            intent = new Intent(MenuActivity.this, CastingActivity.class); // หน้า CastingActivity
        } else if (itemValue.equals("ตัวแปรคณิตศาสตร์")) {
            intent = new Intent(MenuActivity.this, MathVariablesActivity.class); // หน้า MathVariablesActivity
        } else if (itemValue.equals("ค่าคงที่")) {
            intent = new Intent(MenuActivity.this, ConstantsActivity.class); // หน้า ConstantsActivity
        } else if (itemValue.equals("ค่าคงที่ที่กำหนดไว้ล่วงหน้า")) {
            intent = new Intent(MenuActivity.this, PredefinedConstantsActivity.class); // หน้า PredefinedConstantsActivity
        } else if (itemValue.equals("ตัวดำเนินการ")) {
            intent = new Intent(MenuActivity.this, OperatorsActivity.class); // หน้า OperatorsActivity
        } else if (itemValue.equals("if-else")) {
            intent = new Intent(MenuActivity.this, IfElseActivity.class); // หน้า IfElseActivity
        } else if (itemValue.equals("Switch")) {
            intent = new Intent(MenuActivity.this, SwitchActivity.class); // หน้า SwitchActivity
        } else if (itemValue.equals("Loop")) {
            intent = new Intent(MenuActivity.this, LoopActivity.class); // หน้า LoopActivity
        } else if (itemValue.equals("ฟังก์ชัน")) {
            intent = new Intent(MenuActivity.this, FunctionActivity.class); // หน้า FunctionActivity
        } else if (itemValue.equals("อาเรย์")) {
            intent = new Intent(MenuActivity.this, ArrayActivity.class); // หน้า ArrayActivity
        } else if (itemValue.equals("ตัวแปรแบบ Globals")) {
            intent = new Intent(MenuActivity.this, GlobalsActivity.class); // หน้า GlobalsActivity
        } else if (itemValue.equals("Regular Expressions")) {
            intent = new Intent(MenuActivity.this, RegexActivity.class); // หน้า RegexActivity
        } */

        if (intent != null) {
            startActivity(intent);
        } else {
            //ถ้าเมนูที่กดไม่มี
            Toast.makeText(MenuActivity.this, "ไม่พบหน้าที่เลือก", Toast.LENGTH_SHORT).show();
        }
    }
}
