package com.example.exercise5sujide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChoiceA = findViewById(R.id.buttonChoiceA);
        Button buttonChoiceB = findViewById(R.id.buttonChoiceB);
        Button buttonProceed = findViewById(R.id.buttonProceed);
        final EditText choiceInput = findViewById(R.id.choiceInput);

        buttonChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Activity A when button A is clicked
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Activity B when button B is clicked
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check the input and navigate accordingly
                String choice = choiceInput.getText().toString().toUpperCase();
                if (choice.equals("A")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else if (choice.equals("B")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}