package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    Button decrementButton;
    TextView greetingDisplay;
    TextView num;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText(R.string.greet_dad);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.incrementButton);
        decrementButton = findViewById(R.id.decrementButton);
        greetingDisplay = findViewById(R.id.textView);
        num = findViewById(R.id.number);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("incrementing: " + ++count);
                num.setText(""+count);
            }
        });
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("decrementing: " + --count);
                num.setText(""+count);
            }
        });

    }

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }
}

