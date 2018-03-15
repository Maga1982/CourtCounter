package com.example.harshu.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int score=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three(View view)
    {
        score=3+score;
        displayForTeamA(score);
    }
    public void two(View view)
    {
        score=2+score;
        displayForTeamA(score);
    }
    public void free(View view)
    {
        score=1+score;
        displayForTeamA(score);
    }
    public void displayForTeamA(int b) {
        this.score=b;
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void three_b(View view)
    {
        scoreB=3+scoreB;
        displayForTeamB(scoreB);
    }
    public void two_b(View view)
    {
        scoreB=2+scoreB;
        displayForTeamB(scoreB);
    }
    public void free_b(View view)
    {
        scoreB=1+scoreB;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int b) {
this.scoreB=b;
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void reset(View view){
        displayForTeamA(0);

        displayForTeamB(0);
    }
}
