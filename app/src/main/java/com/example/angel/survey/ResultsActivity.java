package com.example.angel.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;




public class ResultsActivity extends AppCompatActivity {

    TextView mYesCount;
   TextView mNoCount;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        Intent launchIntent = getIntent();

        mYesCount = (TextView) findViewById(R.id.yes_answer_count);
        mNoCount = (TextView) findViewById(R.id.no_answer_count);

        int yesTotal = launchIntent.getIntExtra(SurveyActivity.YES_COUNT, 100);
        mYesCount.setText("The Yes total is " + yesTotal);
        int noTotal = launchIntent.getIntExtra(SurveyActivity.NO_COUNT, 100);
        mNoCount.setText("The No total is " + noTotal);




    }
}
