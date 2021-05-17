package com.example.mytodoapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.mytodoapp.R;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton open_next_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open_next_screen = findViewById(R.id.open_next_screen);


        open_next_screen.setOnClickListener(v -> {
            startActivity(new Intent(this, ShowTodoActivity.class));
        });

    }




}