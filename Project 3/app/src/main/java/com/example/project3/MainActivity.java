package com.example.project3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnRed, btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        imageView = findViewById(R.id.imageView);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);

        // Set button click listeners
        btnRed.setOnClickListener(v -> changeImage(R.drawable.image1));
        btnGreen.setOnClickListener(v -> changeImage(R.drawable.image2));
        btnBlue.setOnClickListener(v -> changeImage(R.drawable.image3));
    }

    // Method to change the image with animation
    private void changeImage(int imageResource) {
        imageView.setImageResource(imageResource);
        imageView.animate().alpha(0).setDuration(300).withEndAction(() -> {
            imageView.setImageResource(imageResource);
            imageView.animate().alpha(1).setDuration(300).start();
        }).start();
    }
}