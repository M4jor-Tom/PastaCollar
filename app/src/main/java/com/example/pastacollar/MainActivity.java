package com.example.pastacollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTextView = (TextView)findViewById(R.id.mainTextView);
        mainTextView.setText("Ah... Rien aujourd'hui...");
    }
}