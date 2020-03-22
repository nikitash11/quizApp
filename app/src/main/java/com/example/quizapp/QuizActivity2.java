package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity2 extends AppCompatActivity {
    private Button submitButton;
    private int score;
    private RadioGroup numFourRadioGroup;
    private RadioGroup numfiveradioGroup;
    private RadioGroup numSixRadioGroup;
    private RadioButton groundRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        submitButton=findViewById(R.id.submit_button);
        numFourRadioGroup= findViewById(R.id.num_four_radio_group);
        numfiveradioGroup= findViewById(R.id.num_five_radio_group);
        numSixRadioGroup= findViewById(R.id.num_six_radio_group);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(QuizActivity2.this, ScoreActivity.class);
                intent.putExtra("Score", "6/6");
                startActivity(intent);
            }


        });
    }

    public RadioGroup getNumFourRadioGroup() {
        numFourRadioGroup= findViewById(R.id.num_one_radio_group);
        numFourRadioGroup.clearCheck();
        numFourRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.Pepper)
                    score +=1;
            }
        });
        return numFourRadioGroup;
    }
}
