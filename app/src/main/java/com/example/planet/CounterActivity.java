package com.example.planet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    private int consumption_score;
    private int recycled_score;

    private TextView txtv_consumption_score;
    private TextView txtv_recycled_score;

    static final String STATE_CONSUMPTION_SCORE = "Consumption Score";
    static final String STATE_RECYCLED_SCORE = "Recycled Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

//        txtv_consumption_score = findViewById(R.id.consumption_score);
        txtv_recycled_score = findViewById(R.id.recycled_score);
//
//        Intent intent = getIntent();
//        consumption_score = intent.getIntExtra(CounterHelper.TAG_CONSUMPTION_SCORE,-1);
        if (savedInstanceState != null) {
            consumption_score = savedInstanceState.getInt(STATE_CONSUMPTION_SCORE);
            recycled_score = savedInstanceState.getInt(STATE_RECYCLED_SCORE);

            txtv_consumption_score.setText( String.valueOf(CounterHelper.getConsumption_score()));

            txtv_consumption_score.setText(String.valueOf(CounterHelper.getConsumption_score()));
            txtv_recycled_score.setText(String.valueOf(recycled_score));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(STATE_CONSUMPTION_SCORE, consumption_score);
        outState.putInt(STATE_RECYCLED_SCORE, recycled_score);
        super.onSaveInstanceState(outState);
    }


}
