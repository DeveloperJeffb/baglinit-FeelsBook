package com.example.baglinit_feelsbook;

import android.widget.TextView;



//Purpose: increase count of emotion when button is clicked
//Design Rational: created seperate class to reduce code repetition in main activity
//No outstanding issues


public class IncreaseCount {
    void increment(TextView emotion){
        String countValue = emotion.getText().toString(); //Store starting value in countvalue
        int intCountValue= Integer.parseInt(countValue); // convert string value to integer
        intCountValue++;
        emotion.setText(String.valueOf(intCountValue));
    }
}
