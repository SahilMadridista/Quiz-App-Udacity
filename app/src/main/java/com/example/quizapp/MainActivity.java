package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   RadioGroup radioGroupone,radioGrouptwo;
   RadioButton AnswerOne,AnswerThree;
   EditText ucl,stadium;
   CheckBox FiveRightOne,FiveRightTwo,FiveWrongOne,FiveWrongTwo;
   private int Correct_Answers = 0;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      radioGroupone = findViewById(R.id.radio_group_one);
      radioGrouptwo = findViewById(R.id.radio_group_two);
      AnswerOne = findViewById(R.id.answerone);
      AnswerThree = findViewById(R.id.answerthree);
      ucl = findViewById(R.id.ucl_et);
      stadium = findViewById(R.id.stadium_et);
      FiveRightOne = findViewById(R.id.five_correct_one);
      FiveRightTwo = findViewById(R.id.five_correct_two);

      FiveWrongOne = findViewById(R.id.five_wrong_one);
      FiveWrongTwo = findViewById(R.id.five_wrong_two);



   }

   public void submitQuiz(View v){

      String answertwo = "13";
      String answerfour = "santiago bernabeu";

      if(AnswerOne.isChecked()){
         Correct_Answers = Correct_Answers +1;
      }

      if(ucl.getText().toString().equals(answertwo)){
         Correct_Answers = Correct_Answers +1;
      }

      if(AnswerThree.isChecked()){
         Correct_Answers = Correct_Answers +1;
      }

      if(stadium.getText().toString().toLowerCase().equals(answerfour)){
         Correct_Answers = Correct_Answers +1;
      }

      if(FiveRightOne.isChecked() && FiveRightTwo.isChecked()){

         if(!(FiveWrongOne.isChecked() || FiveWrongTwo.isChecked())){
            Correct_Answers = Correct_Answers +1;
         }

      }

      Toast.makeText(getApplicationContext(),"Correct answers: "+ Correct_Answers+"/5",Toast.LENGTH_LONG).show();

      Correct_Answers = 0;

   }

}