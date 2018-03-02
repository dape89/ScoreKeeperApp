package com.dape.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int onGoalA = 0;
    int onGoalB = 0;
    int offGoalA = 0;
    int offGoalB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayOnGoalA(onGoalA);
        displayOnGoalB(onGoalB);
        displayOffGoalA(offGoalA);
        displayOffGoalB(offGoalB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOnGoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.onGoalA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayOnGoalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.onGoalB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOffGoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offGoalA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayOffGoalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.offGoalB);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addOnGoalForTeamA(View view) {
        onGoalA = onGoalA + 1;
        displayOnGoalA(onGoalA);
    }

    public void addOnGoalForTeamB(View view) {
        onGoalB = onGoalB + 1;
        displayOnGoalB(onGoalB);
    }

    public void addOffGoalForTeamA(View view) {
        offGoalA = offGoalA + 1;
        displayOffGoalA(offGoalA);
    }

    public void addOffGoalForTeamB(View view) {
        offGoalB = offGoalB + 1;
        displayOffGoalB(offGoalB);
    }
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        onGoalA = 0;
        onGoalB = 0;
        offGoalA = 0;
        offGoalB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayOnGoalA(onGoalA);
        displayOnGoalB(onGoalB);
        displayOffGoalA(offGoalA);
        displayOffGoalB(offGoalB);
    }
}
