package com.example.charactersheetapprevised;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    private Button newButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        newButton = findViewById(R.id.newSheet);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewSheet();
            }
        });
    }

    public void openNewSheet()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
