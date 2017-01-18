package com.udacity.anonealio.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;

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

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    /// Code for buttons
    public void threePointButtonClick(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void twoPointButtonClick(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowButtonClick(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void threePoint_b_ButtonClick(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void twoPoint_b_ButtonClick(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void freeThrow_b_ButtonClick(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void resetButtonClick(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


}
