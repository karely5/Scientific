package com.example.scientific;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView previusCalculation;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        previusCalculation = findViewById(R.id.previusCalculationView);
        display = findViewById(R.id.displayEditText);
    }

    private void updateText(String strToAdd){
        display.setText(strToAdd);
    }

    public void zeroBTNPush(View view){
        updateText("0");
    }
}