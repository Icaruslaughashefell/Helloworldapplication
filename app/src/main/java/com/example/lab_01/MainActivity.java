package com.example.lab_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.textView);
    }

    public void event(View view){

        text1.setText("Helo - and the world say hello back");

    }

    public void colorChange(View view)
    {
        text1.setTextColor(Color.rgb(255,192,203));
    }

}