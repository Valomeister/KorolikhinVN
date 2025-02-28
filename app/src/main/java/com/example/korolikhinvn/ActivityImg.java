package com.example.korolikhinvn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityImg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_img);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void startActivityText(View v) {
        Intent intent = new Intent(this, ActivityText.class);
        startActivity(intent);
    }
    public void startActivityButton(View v) {
        Intent intent = new Intent(this, ActivityButton.class);
        startActivity(intent);
    }

    public void startActivityInput(View v) {
        Intent intent = new Intent(this, ActivityInput.class);
        startActivity(intent);
    }

    public void startActivityImg(View v) {
        Intent intent = new Intent(this, ActivityImg.class);
        startActivity(intent);
    }

}