package com.example.valueconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button basicCalcButton = findViewById(R.id.basicCalculatorButton);
       basicCalcButton.setOnClickListener((View v)->{
            Intent switchActivity = new Intent(this, BasicCalcActivity.class);
            startActivity(switchActivity);
        });

       Button projectileCalcButton = findViewById(R.id.projectileCalcButton);
        projectileCalcButton.setOnClickListener((View v)->{
           Intent switchActivity = new Intent(this, PhysicsActivity.class);
           startActivity(switchActivity);
        });
    }


}