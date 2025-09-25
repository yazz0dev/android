package com.example.program7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean s = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        ImageView img = findViewById(R.id.imageView);
        ImageView img2 = findViewById(R.id.imageView2);

        btn.setOnClickListener(
                v ->{
                    if (s)
                    {
                        img.setVisibility(View.GONE);
                        img2.setVisibility(View.VISIBLE);
                    }
                    else
                    {
                        img2.setVisibility(View.GONE);
                    img.setVisibility(View.VISIBLE);
                            }
                    s=!s;
                }
                );
    }
}