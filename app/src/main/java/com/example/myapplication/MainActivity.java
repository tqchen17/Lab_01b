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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    Button decrementButton;
    Switch switchMode;
    ConstraintLayout background;
    TextView greetingDisplay;
    TextView num;
    List<String> l = new ArrayList<>();
    int incCount = 0;
    int loop = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l.add("Nice to meet ya, Tommy Chen!");
        l.add("Hello there");
        l.add("Bonjour AmithP");
        l.add("Happy Birthday Pranav!");
        l.add("2024tchen, it's a pleasure to make your acquaintance.");
        l.add("Hi, Mr. Tra!");
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.incrementButton);
        decrementButton = findViewById(R.id.decrementButton);
        greetingDisplay = findViewById(R.id.textView);
        num = findViewById(R.id.number);
        switchMode = findViewById(R.id.night);
        background = findViewById(R.id.background);
        if (switchMode.isChecked()) {
            switchMode.setText("Click on the switch for a new message");
            switchMode.setTextColor(Color.argb(255, 255, 255, 255));
            background.setBackgroundColor(Color.argb(255, 0, 0, 0));
            num.setTextColor(Color.argb(255, 255, 255, 255));
        } else {
            switchMode.setText("Fun mode");
            switchMode.setTextColor(Color.argb(255, 0, 0, 0));
            background.setBackgroundColor(Color.argb(255, 255, 255, 255));
            num.setTextColor(Color.argb(255, 0, 0, 0));

        }

        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switchMode.setText("Click on the switch for a new message");
                    switchMode.setTextColor(Color.argb(255, 255, 255, 255));
                    background.setBackgroundColor(Color.argb(255, 0, 0, 0));
                    num.setTextColor(Color.argb(255, 255, 255, 255));

                } else {
                    switchMode.setText("Fun mode");
                    switchMode.setTextColor(Color.argb(255, 0, 0, 0));
                    background.setBackgroundColor(Color.argb(255, 255, 255, 255));
                    loop++;
                    if(loop >= l.size()) { loop = 0; }
                    greetingDisplay.setText(l.get(loop));
                    num.setTextColor(Color.argb(255, 0, 0, 0));
                }
            }
        });

        num = findViewById(R.id.number);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("incrementing: " + ++incCount);
                num.setText(""+incCount);
            }
        });
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("decrementing: " + --incCount);
                num.setText(""+incCount);
            }
        });

    }

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }
}

