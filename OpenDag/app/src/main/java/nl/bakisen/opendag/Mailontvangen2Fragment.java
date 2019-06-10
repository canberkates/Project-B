package nl.bakisen.opendag;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Calendar;


public class Mailontvangen2Fragment extends Fragment {
    ImageButton instaKnop, faceKnop, twitterKnop;
    Button home, agenda;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mailontvangen2, container, false);

        home = (Button) view.findViewById(R.id.backtohome);
        agenda = (Button) view.findViewById(R.id.calender_button2);
        instaKnop = (ImageButton) view.findViewById(R.id.instaKnop);
        twitterKnop = (ImageButton) view.findViewById(R.id.twitterKnop);
        faceKnop = (ImageButton) view.findViewById(R.id.faceKnop);

        instaKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagram = "https://www.instagram.com/hogeschoolrotterdam/";
                Uri webadres = Uri.parse(instagram);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);
            }
        });

        twitterKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String twitter = "https://twitter.com/intent/tweet?text=Ik ga naar de open dag van hogeschool rotterdam op 2 februari!&original_referer=";
                Uri webadres = Uri.parse(twitter);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);
            }
        });

        faceKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/sharer.php?u=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2Fvoorlichting%2Fhulp-bij-studiekeuze%2Fopen-dag%2F";
                Uri webadres = Uri.parse(facebook);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);

                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new HomeFragment());
                home.commit();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new HomeFragment());
                home.addToBackStack(null).commit();
            }
        });

        agenda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar calendarEvent = Calendar.getInstance();
                Calendar beginTime = calendarEvent.getInstance();
                long startMillis = 0;
                long endMillis = 0;
                beginTime.set(2020,1,2,16,55);
                startMillis = beginTime.getTimeInMillis();
                Calendar endTime = calendarEvent.getInstance();
                endTime.set(2020,1,2,20,00);
                endMillis = endTime.getTimeInMillis();
                Intent i = new Intent(Intent.ACTION_EDIT);
                i.setType("vnd.android.cursor.item/event");
                i.putExtra("beginTime", startMillis);
                i.putExtra("rule", "FREQ=YEARLY");
                i.putExtra("endTime", endMillis);
                i.putExtra("title", "Open dag Hogeschool Rotterdam");
                i.putExtra("eventLocation", "Wijnhaven 107, Rotterdam");
                startActivity(i);
            }

        });

        return view;
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}