package com.example.exercise5sujide;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.TextView);
        inputText = (EditText) findViewById(R.id.inputText);


    }

    public void updateText(View view){

        textView.setText("Hello! " + inputText.getText());

    }
}