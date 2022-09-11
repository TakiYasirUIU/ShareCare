package com.example.sharecaredesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LogINActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

    }

    public void launchLogInHome(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
