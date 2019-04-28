package com.example.planet;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {
    ImageView splashImage;
    private static int SPLASH_SCREEN_TIMER = 5750;
    private Intent toLoginScreenIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashImage = findViewById(R.id.splash_image);

        Glide.with(SplashScreen.this)
                .load(R.drawable.earth_day)
                .into(splashImage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                toLoginScreenIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(toLoginScreenIntent);
                finish();
            }
        }, SPLASH_SCREEN_TIMER);
    }
}
