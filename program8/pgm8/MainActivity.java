package com.example.pgm8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            i.putExtra("name","yaseen");
            startActivity(i);
        });
    }
}