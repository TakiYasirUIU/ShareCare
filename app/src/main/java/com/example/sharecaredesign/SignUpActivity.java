package com.example.sharecaredesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void submitSignUp(View view) {
        Intent intent = new Intent(this,LogINActivity.class);
        startActivity(intent);
    }
}
