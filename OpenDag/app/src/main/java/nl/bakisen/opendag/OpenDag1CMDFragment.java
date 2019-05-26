package nl.bakisen.opendag;

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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class OpenDag1CMDFragment extends Fragment {
    int counter = 1;
    Button btn1, btn2, btn3, btn4, revealButton, aanmelden, agenda;
    ImageButton instaKnop, faceKnop, twitterKnop, linkedKnop;
    TextView txt1;
    String Studievoorlichting = "Studievoorlichting is hét aanspreekpunt voor informatie over alle opleidingen, toelatingseisen en de aanmeldprocedure. Ook is hier praktische informatie te krijgen over toelatingsexamens, voorbereidingscursussen, buitenlandse diploma’s, proefstuderen en studiekosten. De studievoorlichters kunnen je tevens helpen als je nog twijfels hebt over je studiekeuze, bijvoorbeeld met een workshop of een individueel studiekeuzetraject.";
    String Inschrijving = "Bij de balie van Studenten Service Center kun je terecht met vragen over aanmelden, jouw (her)inschrijving, collegegeld en de betaling daarvan. Daarnaast kun je tijdens de open dag documenten inleveren die nodig zijn voor je aanmelding.";
    String Toelatingsexamen = "Wil je een hbo-opleiding volgen, maar beschik je nog niet over de juiste vooropleiding? Dan kun je examen doen via het Toelatingsonderzoek 21+, het Onderzoek deficiëntie of het Onderzoek NT2 om alsnog toegelaten te worden tot jouw opleiding.";
    String StudentAanZet = "Student aan Zet is de plek waar je als student binnen kunt lopen voor specifieke ondersteuning. Denk bijvoorbeeld aan studeren met een functiebeperking of studeren op latere leeftijd. We bieden diverse workshops, bijeenkomsten en keuzevakken aan die inspelen op de huidige trends en ontwikkelingen in het onderwijs en de samenleving. Een team van professionals en ervaringsdeskundigen staat klaar om jou te voorzien van inspiratie, advies, support en training.";



    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_overzichtopendag1cmd, container, false);

//        toont en verbergt de informatie van de open dag
        revealButton = (Button) view.findViewById(R.id.informatie_toggle);
        final LinearLayout infoLayout = (LinearLayout) view.findViewById(R.id.informatie_layout);

        revealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (counter) {
                    case 1:
                        infoLayout.setVisibility(View.VISIBLE);
                        counter += 1;
                        break;
                    case 2:
                        infoLayout.setVisibility(View.GONE);
                        counter -= 1;
                        break;
                    default:
                        infoLayout.setVisibility(View.GONE);
                        break;
                }
            }
        });

//        past overige informatie aan dat aansluit op de titel
        txt1 = (TextView) view.findViewById(R.id.textoverigeinfo);

        btn1 = (Button) view.findViewById(R.id.buttonstudievoorlichting);
        btn2 = (Button) view.findViewById(R.id.buttonstudentaanzet);
        btn3 = (Button) view.findViewById(R.id.buttontoelatingsexamen);
        btn4 = (Button) view.findViewById(R.id.buttoninschrijving);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Studievoorlichting);
                btn1.setVisibility(View.VISIBLE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(StudentAanZet);
                btn1.setVisibility(View.VISIBLE);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Toelatingsexamen);
                btn1.setVisibility(View.VISIBLE);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Inschrijving);
                btn1.setVisibility(View.VISIBLE);
            }
        });

        agenda = (Button) view.findViewById(R.id.calender_button);
        agenda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Calendar calendarEvent = Calendar.getInstance();
                Calendar beginTime = calendarEvent.getInstance();
                long startMillis = 0;
                long endMillis = 0;
                beginTime.set(2019,10,2,16,55);
                startMillis = beginTime.getTimeInMillis();
                Calendar endTime = calendarEvent.getInstance();
                endTime.set(2019,10,2,20,00);
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

//        naar volgende fragment
        aanmelden = (Button) view.findViewById(R.id.aanmeldknop_opendag);
        aanmelden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fraanmeldenOpendag = getFragmentManager().beginTransaction();
                fraanmeldenOpendag.replace(R.id.fragment_container, new InschrijvenFragment());
                fraanmeldenOpendag.addToBackStack(null).commit();
            }
        });

        instaKnop = (ImageButton) view.findViewById(R.id.instaKnop);
        twitterKnop = (ImageButton) view.findViewById(R.id.twitterKnop);
        faceKnop = (ImageButton) view.findViewById(R.id.faceKnop);
//        linkedKnop = (Button) view.findViewById(R.id.);

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
                String twitter = "https://twitter.com/intent/tweet?url=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2F&text=Home%3A&original_referer=";
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
            }
        });



//        instaKnop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String instagram = "https://www.instagram.com/hogeschoolrotterdam/";
//                Uri webadres = Uri.parse(instagram);
//
//                Intent gotoInstagram = new Intent(Intent.ACTION_VIEW,webadres);
//                if (gotoInstagram.resolveActivity(getActivity()) != null){
//                    startActivity(gotoInstagram);
//                }
//            }
//        });


        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}