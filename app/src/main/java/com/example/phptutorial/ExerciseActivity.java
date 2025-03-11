package com.example.phptutorial;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExerciseActivity extends AppCompatActivity implements View.OnClickListener {
    //Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        // Check the login status before setting the content view
//        SharedPreferences sharedPreferences = getSharedPreferences("isLogin", MODE_PRIVATE);
//        boolean isLoggedIn = sharedPreferences.getBoolean("isLogin", false);
//
//        if (isLoggedIn) {
            setContentView(R.layout.activity_exercise); // Set the layout for logged-in users
//        } else {
//            setContentView(R.layout.not_login); // Set the layout for not logged-in users
//        }
//
//        // Find the button after setting the content view
//        button = findViewById(R.id.button);
//        button.setOnClickListener(this);
//
//        // Display a message about the login status
//        Toast.makeText(this, "User Logged In: " + (isLoggedIn ? "Yes" : "No"), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        //if (view.getId() == R.id.button) {
//            SharedPreferences sharedPreferences = getSharedPreferences("isLogin", MODE_PRIVATE);
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putBoolean("isLogin", true); // Set the login status to true
//            editor.apply(); // Apply changes to SharedPreferences
//
//            // Show a toast message
//            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
//
//            // Update the layout after login (if needed)
//            setContentView(R.layout.activity_exercise);
        //}
    }
}
