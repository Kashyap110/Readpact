package com.example.readpactk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        text = findViewById(R.id.title);

        //text.animate().translationY(1600).setStartDelay(2000).setDuration(1000).start();


        Thread timer = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(3000);
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    super.run();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        timer.start();
    }
}