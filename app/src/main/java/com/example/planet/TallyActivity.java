package com.example.planet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TallyActivity extends AppCompatActivity {

    private int consumption_score;
    private int recycled_score;

    private TextView txtv_consumption_score;
    private TextView txtv_recycled_score;

    static final String STATE_CONSUMPTION_SCORE = "Consumption Score";
    static final String STATE_RECYCLED_SCORE = "Recycled Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tally);

        txtv_consumption_score = findViewById(R.id.consumption_score);
        txtv_recycled_score = findViewById(R.id.recycled_score);

        if (savedInstanceState != null) {
            consumption_score = savedInstanceState.getInt(STATE_CONSUMPTION_SCORE);
            recycled_score = savedInstanceState.getInt(STATE_RECYCLED_SCORE);

            txtv_consumption_score.setText(String.valueOf(consumption_score));
            txtv_recycled_score.setText(String.valueOf(recycled_score));
        }
    }
}
