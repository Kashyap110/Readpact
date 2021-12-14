package com.example.readpactk;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ReadWriteActivity extends AppCompatActivity {

    Button readBtn, writeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_write);

        readBtn = findViewById(R.id.readBtn);
        writeBtn = findViewById(R.id.writeBtn);

        readBtn.setOnClickListener(v -> {
            startActivity(new Intent(ReadWriteActivity.this,ApiMainActivity.class));
            //finish();
        });

        writeBtn.setOnClickListener(v -> {
            startActivity(new Intent(ReadWriteActivity.this,PostJournalActivity.class));
            //finish();
        });
    }
}