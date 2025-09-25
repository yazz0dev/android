package com.example.pgm8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String msg = getIntent().getExtras().getString("name");
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity2.this, MainActivity.class);
            i.putExtra("name","yaseen");
            startActivity(i);
        });
    }
}