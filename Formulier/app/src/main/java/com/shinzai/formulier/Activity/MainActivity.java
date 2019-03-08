package com.shinzai.formulier.Activity;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.shinzai.formulier.Domain.Form;
import com.shinzai.formulier.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickSend(View v) {

//        making link with the input text to get the given information from user
        TextInputEditText email = (TextInputEditText)findViewById(R.id.GiveEmail);
        TextInputEditText question = (TextInputEditText)findViewById(R.id.GiveQuestion);

//        Making a form to bundle email and question
        String email1 = email.getText().toString();
        String question1 = question.getText().toString();
        Form questionForm = new Form(email1,question1);

//        Using Log to check output
//        System.out.println(questionForm.toString());
        Log.d("Test in MainActivity",questionForm.toString());

//        Toast to show that the question has been sent
        Toast.makeText(this,"Question sent~!", Toast.LENGTH_LONG).show();


//        Clearing input for next question
        email.getText().clear();
        question.getText().clear();

    }


}
