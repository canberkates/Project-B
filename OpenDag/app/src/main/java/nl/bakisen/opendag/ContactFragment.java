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
import android.widget.TextView;

public class ContactFragment extends Fragment {
    Button btnbeganegrond, btnetage1, btnetage2, btnetage3, btnetage4, btnetage5;
    ImageView plattegrond;
    int [] images = new int [] {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        plattegrond = (ImageView) view.findViewById(R.id.plattegrond);
        btnbeganegrond = (Button) view.findViewById(R.id.btnbeganegrond);
        btnetage1 = (Button) view.findViewById(R.id.btnetage1);
        btnetage2 = (Button) view.findViewById(R.id.btnetage2);
        btnetage3 = (Button) view.findViewById(R.id.btnetage3);
        btnetage4 = (Button) view.findViewById(R.id.btnetage4);
        btnetage5 = (Button) view.findViewById(R.id.btnetage5);

        btnbeganegrond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[0]);
                btnbeganegrond.setVisibility(View.VISIBLE);

            }
        });

        btnetage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[1]);
                btnetage1.setVisibility(View.VISIBLE);

            }
        });

        btnetage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[2]);
                btnetage2.setVisibility(View.VISIBLE);

            }
        });

        btnetage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[3]);
                btnetage3.setVisibility(View.VISIBLE);

            }
        });

        btnetage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[4]);
                btnetage4.setVisibility(View.VISIBLE);

            }
        });

        btnetage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plattegrond.setImageResource(images[5]);
                btnetage5.setVisibility(View.VISIBLE);

            }
        });

        return view;

    }
}
