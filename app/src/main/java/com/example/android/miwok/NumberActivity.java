package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.y;
import static com.example.android.miwok.R.id.numbers;
import static java.lang.System.in;

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

//        Log.v("NumberActivity", "Content of words index 0: " + words.get(0));
//        Log.v("NumberActivity", "Content of words index 1: " + words.get(1));
//        Log.v("NumberActivity", "Content of words index 2: " + words.get(2));
//        Log.v("NumberActivity", "Content of words index 3: " + words.get(3));
//        Log.v("NumberActivity", "Content of words index 4: " + words.get(4));
//        Log.v("NumberActivity", "Content of words index 5: " + words.get(5));
//        Log.v("NumberActivity", "Content of words index 6: " + words.get(6));
//        Log.v("NumberActivity", "Content of words index 7: " + words.get(7));
//        Log.v("NumberActivity", "Content of words index 8: " + words.get(8));
//        Log.v("NumberActivity", "Content of words index 9: " + words.get(9));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordsView = new TextView(this);
//        wordsView.setText(words.get(0));
//        rootView.addView(wordsView);
//
//        TextView wordsView1 = new TextView(this);
//        wordsView1.setText(words.get(1));
//        rootView.addView(wordsView1);
//
//        TextView wordsView2 = new TextView(this);
//        wordsView2.setText(words.get(2));
//        rootView.addView(wordsView2);

        int count = 0;
        while(count < words.size()){
            TextView wordsView = new TextView(this);
            wordsView.setText(words.get(count));
            rootView.addView(wordsView);
            count++;
        }



    }
}
