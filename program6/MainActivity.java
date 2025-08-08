package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize all the views from the layout
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        RadioGroup radioGroupGender = findViewById(R.id.radioGroupGender);
        CheckBox checkBoxTerms = findViewById(R.id.checkBoxTerms);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        // 2. Set the click listener and place all logic inside it
        buttonSubmit.setOnClickListener(view -> {

            // 3. Get input from all fields
            String name = editTextName.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString();

            // 4. Perform validation in a compact if-else-if chain
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            } else if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            }
             else if (password.isEmpty()) {
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
            }
            //password contain 8 charcater special, number, capital letter and small letter
            else if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
                Toast.makeText(this, "Password must contain 8 characters, special, number, capital letter and small letter", Toast.LENGTH_SHORT).show();
            } else if (radioGroupGender.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please select your gender", Toast.LENGTH_SHORT).show();
            } else if (!checkBoxTerms.isChecked()) {
                Toast.makeText(this, "You must agree to the Terms", Toast.LENGTH_SHORT).show();
            } else {
                // 5. If all fields are valid, show a success message
                Toast.makeText(this, "Success!", Toast.LENGTH_LONG).show();
            }
        });
    }
}