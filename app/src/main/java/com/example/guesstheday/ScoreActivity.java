package com.example.guesstheday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_layout);

        Intent intent = getIntent();
        int num = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView Score = (TextView)findViewById(R.id.scor3);

        Score.setText("" + num);
    }
}
