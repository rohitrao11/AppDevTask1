package com.example.guesstheday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.example.guesstheday.EXTRA_NUMBER";
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonCh1;
    private Button mButtonCh2;
    private Button mButtonCh3;
    private Button mButtonCh4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonCh1 = (Button) findViewById(R.id.ch1);
        mButtonCh2 = (Button) findViewById(R.id.ch2);
        mButtonCh3 = (Button) findViewById(R.id.ch3);
        mButtonCh4 = (Button) findViewById(R.id.ch4);

        updateQuestion();

        mButtonCh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonCh1.getText() == mAnswer){
                    mScore = mScore +1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else {
                            Log.d(TAG,"onClick: Clicked ch1.");
                            TextView Score = (TextView)findViewById(R.id.score);
                            int num = Integer.parseInt(Score.getText().toString());

                            Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                            intent.putExtra(EXTRA_NUMBER, num);
                            startActivity(intent);
                }
            }
        });
        mButtonCh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonCh2.getText() == mAnswer){
                    mScore = mScore +1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else {
                            Log.d(TAG, "onClick: Clicked ch2.");
                            TextView Score = (TextView)findViewById(R.id.score);
                            int num = Integer.parseInt(Score.getText().toString());

                            Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                            intent.putExtra(EXTRA_NUMBER, num);
                            startActivity(intent);
                }
            }
        });
        mButtonCh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonCh3.getText() == mAnswer){
                    mScore = mScore +1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else {
                            Log.d(TAG, "OnClick: Clicked ch3.");
                            TextView Score = (TextView)findViewById(R.id.score);
                            int num = Integer.parseInt(Score.getText().toString());

                            Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                            intent.putExtra(EXTRA_NUMBER, num);
                            startActivity(intent);
                }
            }
        });
        mButtonCh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonCh4.getText() == mAnswer){
                    mScore = mScore +1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }else {
                            Log.d(TAG, "OnClick: Clicked ch4.");
                            TextView Score = (TextView)findViewById(R.id.score);
                            int num = Integer.parseInt(Score.getText().toString());

                            Intent intent = new Intent(MainActivity.this, ScoreActivity.class);
                            intent.putExtra(EXTRA_NUMBER, num);
                            startActivity(intent);
                }
            }
        });
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonCh1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonCh2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonCh3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonCh4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    private void updateScore(int point){mScoreView.setText("" + mScore);}
}