package com.example.readpactk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnboardingActivity2 extends AppCompatActivity {

    Button write_next,write_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);

        write_next = findViewById(R.id.writeNext);
        write_back = findViewById(R.id.writeBack);

        write_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardingActivity2.this, MainActivity.class));
                finish();
            }
        });
        write_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardingActivity2.this, OnboardingActivity.class));
                finish();
            }
        });
    }
}