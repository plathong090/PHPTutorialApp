package com.example.phptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listmenu;
    String[] itemsmenu = {
            "สิ่งที่ควรรู้เกี่ยวกับ PHP" , "ไวยากรณ์พื้นฐาน" , "คำสั่ง echo และ print" , "การเขียน Comment" , "ชนิดของข้อมูล" ,
            "การตั้งตัวแปร Variables" , "ตัวดำเนินการ" , "การใช้ if-else" ,
            "การใช้ Switch" , "การใช้ Loop" , "ฟังก์ชัน" , "อาเรย์"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String UserID = getIntent().getStringExtra("UserID");
        String Username = getIntent().getStringExtra("Username");

        listmenu = findViewById(R.id.listmenu);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemsmenu);
        listmenu.setAdapter(adapter);
        listmenu.setOnItemClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.lessons);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(MenuActivity.this, MainActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.lessons) {
                    intent = new Intent(MenuActivity.this, MenuActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.exercise) {
                    intent = new Intent(MenuActivity.this, QuizActivity.class);
                    intent.putExtra("UserID" , UserID);
                    intent.putExtra("Username" , Username);
                    startActivity(intent);
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    intent = new Intent(MenuActivity.this, ProfileActivity.class);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemValue = (String) listmenu.getItemAtPosition(position);
        Intent intent = null;

        String UserID = getIntent().getStringExtra("UserID");
        String Username = getIntent().getStringExtra("Username");

        if (itemValue.equals("สิ่งที่ควรรู้เกี่ยวกับ PHP")) {
            intent = new Intent(MenuActivity.this, IntroActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("ไวยากรณ์พื็นฐาน")) {
            intent = new Intent(MenuActivity.this, SyntaxActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("คำสั่ง echo และ print")) {
            intent = new Intent(MenuActivity.this, EchoPrintActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("การเขียน Comment")) {
            intent = new Intent(MenuActivity.this, CommentsActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("ชนิดของข้อมูล")) {
            intent = new Intent(MenuActivity.this, DataTypesActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("การตั้งตัวแปร Variables")) {
            intent = new Intent(MenuActivity.this, VariablesActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("ตัวดำเนินการ")) {
            intent = new Intent(MenuActivity.this, OperatorsActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("การใช้ if-else")) {
            intent = new Intent(MenuActivity.this, IfElseActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("การใช้ Switch")) {
            intent = new Intent(MenuActivity.this, SwitchActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("การใช้ Loop")) {
            intent = new Intent(MenuActivity.this, LoopActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("ฟังก์ชัน")) {
            intent = new Intent(MenuActivity.this, FunctionActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        } else if (itemValue.equals("อาเรย์")) {
            intent = new Intent(MenuActivity.this, ArrayActivity.class);
            intent.putExtra("UserID" , UserID);
            intent.putExtra("Username" , Username);
        }

        if (intent != null) {
            startActivity(intent);
        }
    }
}
