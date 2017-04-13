package com.udacity.bkoumtak.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "com.udacity.bkoumtak.androidjokelibrary.JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeView = (TextView) findViewById(R.id.txt_joke);
        jokeView.setText(joke);

    }
}
