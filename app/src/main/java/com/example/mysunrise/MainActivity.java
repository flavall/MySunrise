package com.example.mysunrise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получим ссылку на солнце
        ImageView sunImageView = findViewById(R.id.sun);
        // Анимация для восхода солнца
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
//        sunRiseAnimation.setRepeatCount(5);
        // Подключаем анимацию к нужному View
        sunImageView.startAnimation(sunRiseAnimation);

        ImageView clockImageView = findViewById(R.id.clock);
        Animation clockAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockAnimation);

        ImageView hourImageView = findViewById(R.id.hour_hand);
        Animation hourAnim = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        hourImageView.startAnimation(hourAnim);

    }
}
