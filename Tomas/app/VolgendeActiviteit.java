package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VolgendeActiviteit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volgende_activiteit);

        if (getIntent().hasExtra("com.example.myapplication.Iets")){
            TextView tv = (TextView)findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.myapplication.Iets");
            tv.setText(text);
        }
    }
}
