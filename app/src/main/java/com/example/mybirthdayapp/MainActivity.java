package com.example.mybirthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.mybirthdayapp.MAKECARD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.black)));
    }

    public void makeCard(View view) {
        EditText inputName = (EditText) findViewById(R.id.nameEditText);
        String name = inputName.getText().toString();

        Intent intent = new Intent(this,WishActivity.class);
        intent.putExtra(MSG, name);
        startActivity(intent);
    }
}