package com.example.mybirthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class WishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.black)));

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.MSG);

        TextView wishTextView = (TextView) findViewById(R.id.wishName);
        wishTextView.setText("Happy Birthday to you " + name);
    }
}