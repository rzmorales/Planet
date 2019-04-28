package com.example.planet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CounterHelper extends AppCompatActivity {

    private static int consumption_score;
    private int consumption;
    private int recycled_score;

    public static final String TAG_CONSUMPTION_SCORE = "Consumption Score";
    public static final String TAG_RECYCLED_SCORE = "Recycled Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }

    public void increaseConsumptionScore() {
        consumption_score++;

//        toCounterActivity();
    }

    public static int getConsumption_score() {
        return consumption_score;
    }

//    private void toCounterActivity() {
//        Intent consumption_score_intent = new Intent(this, CounterActivity.class);
//        consumption = consumption_score;
//        consumption_score_intent.putExtra(TAG_CONSUMPTION_SCORE, consumption);
//        startActivity(consumption_score_intent);
//    }
}
