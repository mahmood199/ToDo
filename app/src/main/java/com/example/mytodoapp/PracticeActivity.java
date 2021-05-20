package com.example.mytodoapp;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PracticeActivity extends AppCompatActivity {

    ImageButton test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        test = findViewById(R.id.test);


        test.setOnClickListener(v -> {

            test.setAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise_180));
            //test.setBackgroundResource(R.drawable.down);

        });

    }
}