package nl.bakisen.opendag;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ContactFragment extends Fragment {
    Button btnbeganegrond, btnetage1, btnetage2, btnetage3, btnetage4, btnetage5, routeBeschrijving;
    ImageView plattegrond, googlemaps;
    int [] images = new int [] {R.drawable.beganegrond, R.drawable.etage1, R.drawable.etage2, R.drawable.etage3, R.drawable.etage4, R.drawable.etage5};
    int popwindow;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_contact, container, false);

        googlemaps = (ImageView) view.findViewById(R.id.location);
        routeBeschrijving = (Button) view.findViewById(R.id.routeBeschrijving);

        plattegrond = (ImageView) view.findViewById(R.id.plattegrond);
        btnbeganegrond = (Button) view.findViewById(R.id.btnbeganegrond);
        btnetage1 = (Button) view.findViewById(R.id.btnetage1);
        btnetage2 = (Button) view.findViewById(R.id.btnetage2);
        btnetage3 = (Button) view.findViewById(R.id.btnetage3);
        btnetage4 = (Button) view.findViewById(R.id.btnetage4);
        btnetage5 = (Button) view.findViewById(R.id.btnetage5);

        googlemaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapsIntentUri = Uri.parse("https://www.google.com/maps/search/?api=1&query=wijnhaven+107+3011+WN+Rotterdam+");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        routeBeschrijving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapsIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&destination=wijnhaven+107+3011+WN+Rotterdam+");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });


        btnbeganegrond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[0]);
                popwindow = 1;
                plattegrond.setImageResource(images[0]);
                btnbeganegrond.setVisibility(View.VISIBLE);

            }
        });

        btnetage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[1]);
                popwindow = 2;
                plattegrond.setImageResource(images[1]);
                btnetage1.setVisibility(View.VISIBLE);

            }
        });

        btnetage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[2]);
                popwindow = 3;
                plattegrond.setImageResource(images[2]);
                btnetage2.setVisibility(View.VISIBLE);

            }
        });

        btnetage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[3]);
                popwindow = 4;
                plattegrond.setImageResource(images[3]);
                btnetage3.setVisibility(View.VISIBLE);

            }
        });

        btnetage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[4]);
                popwindow = 5;
                plattegrond.setImageResource(images[4]);
                btnetage4.setVisibility(View.VISIBLE);

            }
        });

        btnetage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popwindow = (RelativeLayout) view.findViewById(R.id.popwindow);
//                popwindow.setBackgroundResource(images[5]);
                popwindow = 6;
                plattegrond.setImageResource(images[5]);
                btnetage5.setVisibility(View.VISIBLE);

            }
        });

        plattegrond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent in = new Intent(getActivity(), Pop.class);
                    in.putExtra("plattegrond", popwindow);
                    startActivity(in);
            }
        });

        return view;

    }
}
