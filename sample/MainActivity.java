package com.example.program2; // Make sure this matches your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure your layout file is named activity_main.xml

        // Initialize the views
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        Button submitButton = findViewById(R.id.submitButton);
        resultTextView = findViewById(R.id.resultTextView); // Initialize the TextView

        // Set an OnClickListener for the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from all EditText fields
                String name = editText1.getText().toString().trim();
                String address = editText2.getText().toString().trim();
                String phone = editText3.getText().toString().trim();
                String gender = editText4.getText().toString().trim();
                String city = editText5.getText().toString().trim();
                String pincode = editText6.getText().toString().trim();

                // Combine the inputs into a single string with descriptive labels
                String combinedInputs = "Hi: " + name + "\n" +
                        "Address: " + address + "\n" +
                        "Phone: " + phone + "\n" +
                        "Gender: " + gender + "\n" +
                        "City: " + city + "\n" +
                        "Pincode: " + pincode;

                // the combined text to the TextView
                resultTextView.setText(combinedInputs);
            }
        });
    }
}