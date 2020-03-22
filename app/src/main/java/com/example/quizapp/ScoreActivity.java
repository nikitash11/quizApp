package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView textView;
    private Button backQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        textView= findViewById(R.id.textView);

        Intent intent= getIntent();
        String score= intent.getStringExtra("Score");
        textView.setText(score);

        backQuiz= findViewById(R.id.back_quiz);
        backQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
