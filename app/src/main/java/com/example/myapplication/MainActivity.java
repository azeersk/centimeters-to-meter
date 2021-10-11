package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void ConvertMeters(View view){
        EditText MeterText = (EditText) findViewById(R.id.MeterText);
        String StringText = MeterText.getText().toString();
        Double DoubleText = Double.parseDouble(StringText);
        Double Meters = DoubleText/100;
        String ToMeters = Meters.toString();
        int a = ToMeters.indexOf(".");
        String MetersOf = ToMeters.substring(0,a+3);
        Toast.makeText(this, MetersOf, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}