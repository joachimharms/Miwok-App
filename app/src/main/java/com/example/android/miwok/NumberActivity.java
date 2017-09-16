package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.y;
import static com.example.android.miwok.R.id.numbers;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

    String[] numbersArray = new String[10];
        numbersArray[0] = "one";
        numbersArray[1] = "two";
        numbersArray[2] = "three";
        numbersArray[3] = "four";
        numbersArray[4] = "five";
        numbersArray[5] = "six";
        numbersArray[6] = "seven";
        numbersArray[7] = "eight";
        numbersArray[8] = "nine";
        numbersArray[9] = "ten";
    }
}
