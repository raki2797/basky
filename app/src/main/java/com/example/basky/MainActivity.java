package com.example.basky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int ScoreA=0;
    int ScoreB=0;
    public void displayForTeamA(int Score){
        TextView Scoreview=(TextView) findViewById(R.id.score_a_text_view);
        Scoreview.setText(String.valueOf(Score));

    }
    public void addThreeA(View view){
        ScoreA=ScoreA+3;
        displayForTeamA(ScoreA);
    }
    public void addTwoA(View view){
        ScoreA=ScoreA+2;
        displayForTeamA(ScoreA);
    }
    public void addOneA(View view){
        ScoreA=ScoreA+1;
        displayForTeamA(ScoreA);
    }
    public void displayForTeamB(int Score){
        TextView Scoreview=(TextView) findViewById(R.id.score_b_text_view);
        Scoreview.setText(String.valueOf(Score));

    }
    public void addThreeB(View view){
        ScoreB=ScoreB+3;
        displayForTeamB(ScoreB);
    }
    public void addTwoB(View view){
        ScoreB=ScoreB+2;
        displayForTeamB(ScoreB);
    }
    public void addOneB(View view){
        ScoreB=ScoreB+1;
        displayForTeamB(ScoreB);
    }
    public void reset(View view){
        ScoreA=0;
        ScoreB=0;
        displayForTeamB(ScoreB);
        displayForTeamA(ScoreA);
    }
}


