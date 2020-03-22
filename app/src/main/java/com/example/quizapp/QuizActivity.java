package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    private Button nextPage;
    private int score;
    private RadioGroup numOneRadioGroup;
    private RadioGroup numTwoRadioGroup;
    private EditText editText;
    private CheckBox nit;
    private CheckBox ni;
    private CheckBox nitr;
    private CheckBox n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        nextPage=findViewById(R.id.next_page);
        nit= (CheckBox) findViewById(R.id.nit);
        ni= (CheckBox) findViewById(R.id.ni);

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nit.isChecked() && nit.isChecked() && !nit.isChecked() && !nit.isChecked()){
                    score +=1;
                }

                Intent intent= new Intent(QuizActivity.this, QuizActivity2.class);
                startActivity(intent);
            }


        });

        numOneRadioGroup= findViewById(R.id.num_one_radio_group);
        numOneRadioGroup.clearCheck();
        numOneRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.Pepper)
                    score +=1;
            }
        });

        numTwoRadioGroup= findViewById(R.id.num_two_radio_group);
        numTwoRadioGroup.clearCheck();
        numTwoRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.Pumpkin)
                    score +=1;
            }
        });

    }
}
