package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button instaKnop = (Button)findViewById(R.id.instaKnop);
        instaKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),VolgendeActiviteit.class);
                startIntent.putExtra("com.example.myapplication.Iets","Hello World");
                startActivity(startIntent);
            }
        });

        Button faceKnop = (Button)findViewById(R.id.faceKnop);
        faceKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/hogeschoolrotterdam/";
                Uri webadres = Uri.parse(facebook);

                Intent gotoFacebook = new Intent(Intent.ACTION_VIEW,webadres);
                if (gotoFacebook.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoFacebook);
                }
            }
        });

        Button twitterKnop = (Button)findViewById(R.id.twitterKnop);
        twitterKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String twitter = "https://twitter.com/hsrotterdam";
                Uri webadres = Uri.parse(twitter);
                Intent gotoTwitter = new Intent(Intent.ACTION_VIEW, webadres);
                if (gotoTwitter.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoTwitter);
                }
            }
        });



    }
}
