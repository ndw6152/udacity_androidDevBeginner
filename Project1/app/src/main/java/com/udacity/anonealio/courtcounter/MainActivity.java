package com.udacity.anonealio.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /// Code for buttons
    public void threePointButtonClick(View view) {
        score += 3;
        displayForTeamA(score);
    }

    public void twoPointButtonClick(View view) {
        score += 2;
        displayForTeamA(score);
    }

    public void freeThrowButtonClick(View view) {
        score += 1;
        displayForTeamA(score);
    }

    public void resetOnClick(View view) {
        score = 0;
        displayForTeamA(score);
    }


}
