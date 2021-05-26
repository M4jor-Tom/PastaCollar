package com.example.pastacollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainTextView = (TextView)findViewById(R.id.mainTextView);
        mainTextView.setText("Ah... Rien aujourd'hui...");

        Date date = new Date();

        int year =
                Integer.valueOf(
                        new SimpleDateFormat("yyyy", Locale.getDefault()).format(date)
                );

        int month =
                Integer.valueOf(
                    new SimpleDateFormat("MM", Locale.getDefault()).format(date)
                );

        int day =
                Integer.valueOf(
                    new SimpleDateFormat("dd", Locale.getDefault()).format(date)
                );
    }
}