package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import static android.R.attr.y;
import static com.example.android.miwok.R.id.numbers;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.v("NumberActivity", "Content of words index 0: " + words.get(0));
        Log.v("NumberActivity", "Content of words index 1: " + words.get(1));
        Log.v("NumberActivity", "Content of words index 2: " + words.get(2));
        Log.v("NumberActivity", "Content of words index 3: " + words.get(3));
        Log.v("NumberActivity", "Content of words index 4: " + words.get(4));
        Log.v("NumberActivity", "Content of words index 5: " + words.get(5));
        Log.v("NumberActivity", "Content of words index 6: " + words.get(6));
        Log.v("NumberActivity", "Content of words index 7: " + words.get(7));
        Log.v("NumberActivity", "Content of words index 8: " + words.get(8));
        Log.v("NumberActivity", "Content of words index 9: " + words.get(9));
    }
}
