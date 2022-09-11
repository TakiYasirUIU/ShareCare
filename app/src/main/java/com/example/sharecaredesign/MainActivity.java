package com.example.sharecaredesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchLogIn(View view) {
        Intent intent = new Intent(this,LogINActivity.class);
        startActivity(intent);
    }
    public void launchSingUP(View view) {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}