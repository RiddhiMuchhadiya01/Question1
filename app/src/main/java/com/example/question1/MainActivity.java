package com.example.question1;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);

        findViewById(R.id.arrowUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox("up");
            }
        });

        findViewById(R.id.arrowDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox("down");
            }
        });

        findViewById(R.id.arrowLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox("left");
            }
        });

        findViewById(R.id.arrowRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateBox("right");
            }
        });
    }

    private void animateBox(String direction) {
        float translationX = 0;
        float translationY = 0;

        switch (direction) {
            case "up":
                translationY = -500f;  // Move up
                break;
            case "down":
                translationY = 500f;  // Move down
                break;
            case "left":
                translationX = -500f;  // Move left
                break;
            case "right":
                translationX = 500f;  // Move right
                break;
        }

        ObjectAnimator animatorX = ObjectAnimator.ofFloat(box, "translationX", 0f, translationX);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(box, "translationY", 0f, translationY);

        animatorX.setDuration(500);
        animatorY.setDuration(500);

        animatorX.start();
        animatorY.start();
    }
}