package com.example.mytodoapp;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomSheetActivity extends AppCompatActivity {

    BottomSheetBehavior bottomSheetBehavior;
    LinearLayout linearLayout;
    FloatingActionButton response;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);


        linearLayout = findViewById(R.id.bottom_sheet);
        response = findViewById(R.id.response);

        bottomSheetBehavior = BottomSheetBehavior.from(linearLayout);
        constraintLayout = findViewById(R.id.constraintLayout);

        constraintLayout.setOnClickListener(v -> {
            if(bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED)
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        });




        response.setOnClickListener(v->{
            if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

            }
        });
    }
}