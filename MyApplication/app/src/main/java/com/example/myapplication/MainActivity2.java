package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton instaKnop = (ImageButton)findViewById(R.id.instaKnop);
        instaKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagram = "https://www.instagram.com/hogeschoolrotterdam/";
                Uri webadres = Uri.parse(instagram);

                Intent gotoInstagram = new Intent(Intent.ACTION_VIEW,webadres);
                if (gotoInstagram.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoInstagram);
                }
            }
        });

        ImageButton faceKnop = (ImageButton)findViewById(R.id.faceKnop);
        faceKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/sharer.php?u=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2Fvoorlichting%2Fhulp-bij-studiekeuze%2Fopen-dag%2F";
                Uri webadres = Uri.parse(facebook);

                Intent gotoFacebook = new Intent(Intent.ACTION_VIEW,webadres);
                if (gotoFacebook.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoFacebook);
                }
            }
        });

        ImageButton twitterKnop = (ImageButton)findViewById(R.id.twitterKnop);
        twitterKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String twitter = "https://twitter.com/intent/tweet?url=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2F&text=Home%3A&original_referer=";
                Uri webadres = Uri.parse(twitter);
                Intent gotoTwitter = new Intent(Intent.ACTION_VIEW, webadres);
                if (gotoTwitter.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoTwitter);
                }
            }
        });

        ImageButton linkedKnop = (ImageButton)findViewById(R.id.linkedKnop);
        linkedKnop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String LinkedIn = "https://www.linkedin.com/sharing/share-offsite/?url=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2Fvoorlichting%2Fhulp-bij-studiekeuze%2Fopen-dag%2F";
                Uri webadres = Uri.parse(LinkedIn);
                Intent gotoLinkedIn = new Intent(Intent.ACTION_VIEW, webadres);
                if (gotoLinkedIn.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoLinkedIn);
                }
            }
        });



    }
}


