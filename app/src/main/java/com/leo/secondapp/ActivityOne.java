package com.leo.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void OpenActOneAppOne (View view) {
        Intent intent = new Intent("com.leo.firstapp.ActivityTwo");
        startActivity(intent);
    }
}
