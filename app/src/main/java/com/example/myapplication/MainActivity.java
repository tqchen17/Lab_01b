package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    Button decrementButton;
    Switch switchMode;
    ConstraintLayout background;
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
        switchMode = findViewById(R.id.night);
        background = findViewById(R.id.background);
        if (switchMode.isChecked()) {
            switchMode.setText("Click on the switch for a new message");
            switchMode.setTextColor(Color.argb(255, 255, 255, 255));
            background.setBackgroundColor(Color.argb(255, 0, 0, 0));
        } else {
            switchMode.setText("Fun mode");
            switchMode.setTextColor(Color.argb(255, 0, 0, 0));
            background.setBackgroundColor(Color.argb(255, 255, 255, 255));
        }

        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switchMode.setText("Click on the switch for a new message");
                    switchMode.setTextColor(Color.argb(255, 255, 255, 255));
                    background.setBackgroundColor(Color.argb(255, 0, 0, 0));
                } else {
                    switchMode.setText("Fun mode");
                    switchMode.setTextColor(Color.argb(255, 0, 0, 0));
                    background.setBackgroundColor(Color.argb(255, 255, 255, 255));
                }
            }
        });

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

