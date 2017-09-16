package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

        Log.v("NumberActivity", "Content of numbersArray[0]: " + numbersArray[0]);
        Log.v("NumberActivity", "Content of numbersArray[1]: " + numbersArray[1]);
        Log.v("NumberActivity", "Content of numbersArray[2]: " + numbersArray[2]);
        Log.v("NumberActivity", "Content of numbersArray[3]: " + numbersArray[3]);
        Log.v("NumberActivity", "Content of numbersArray[4]: " + numbersArray[4]);
        Log.v("NumberActivity", "Content of numbersArray[5]: " + numbersArray[5]);
        Log.v("NumberActivity", "Content of numbersArray[6]: " + numbersArray[6]);
        Log.v("NumberActivity", "Content of numbersArray[7]: " + numbersArray[7]);
        Log.v("NumberActivity", "Content of numbersArray[8]: " + numbersArray[8]);
        Log.v("NumberActivity", "Content of numbersArray[9]: " + numbersArray[9]);
    }
}
