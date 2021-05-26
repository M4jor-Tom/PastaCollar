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

        int momAgeAfterBirthday = year - 1966;

        if(month == 5 && day == 30)
            mainTextView.setText("Bonne fête maman !!!");
        else if(month == 10 && day == 21)
            mainTextView.setText("Joyeux " + momAgeAfterBirthday + " ans maman !!!");
        else if(month == 12)
        {
            if(day == 25)
                mainTextView.setText("Joyeux noël maman !!!");
            else if(day == 31)
                mainTextView.setText("Bonne année maman !!!");
            else if(day > 25 && day < 31)
                mainTextView.setText("Bon bout d'an maman !!!");
        }
        else if(month == 1 && day == 1)
            mainTextView.setText("Bon réveillon maman !!!");
    }
}