package com.example.prog9;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnGoToRegister;
    private TextView tvDetails;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoToRegister = findViewById(R.id.btnGoToRegister);
        tvDetails = findViewById(R.id.tvDetails);

        sharedPreferences = getSharedPreferences("user_details", MODE_PRIVATE);

        btnGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String username = sharedPreferences.getString("username", null);
        String email = sharedPreferences.getString("email", null);

        if (username != null && email != null) {
            tvDetails.setText("Username: " + username + "\nEmail: " + email);
        } else {
            tvDetails.setText("No registration details found.");
        }
    }
}