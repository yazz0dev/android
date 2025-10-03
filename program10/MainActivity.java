package com.example.prog10;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;

    // Data for spinner
    String[] items = {"Select", "Java", "Kotlin", "Python", "C++", "JavaScript"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

        // Create adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        // Event Handling
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = items[position];
                if (!value.equals("Select")) {
                    textView.setText("You selected: " + value);
                    Toast.makeText(MainActivity.this, "Selected: " + value, Toast.LENGTH_SHORT).show();
                } else {
                    textView.setText("Select an Item");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("No item selected");
            }
        });
    }
}
