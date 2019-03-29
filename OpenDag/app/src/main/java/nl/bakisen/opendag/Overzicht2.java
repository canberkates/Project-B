package nl.bakisen.opendag;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Overzicht2 extends Fragment {

    TextView txt1;
    private Button btn1, btn2, btn3, btn4;
    String Studievoorlichting = "Studievoorlichting is hét aanspreekpunt voor informatie over alle opleidingen, toelatingseisen en de aanmeldprocedure. Ook is hier praktische informatie te krijgen over toelatingsexamens, voorbereidingscursussen, buitenlandse diploma’s, proefstuderen en studiekosten. De studievoorlichters kunnen je tevens helpen als je nog twijfels hebt over je studiekeuze, bijvoorbeeld met een workshop of een individueel studiekeuzetraject.";
    String Inschrijving = "Bij de balie van Studenten Service Center kun je terecht met vragen over aanmelden, jouw (her)inschrijving, collegegeld en de betaling daarvan. Daarnaast kun je tijdens de open dag documenten inleveren die nodig zijn voor je aanmelding.";
    String Toelatingsexamen = "Wil je een hbo-opleiding volgen, maar beschik je nog niet over de juiste vooropleiding? Dan kun je examen doen via het Toelatingsonderzoek 21+, het Onderzoek deficiëntie of het Onderzoek NT2 om alsnog toegelaten te worden tot jouw opleiding.";
    String StudentAanZet = "Student a/an Zet is de plek waar je als student binnen kunt lopen voor specifieke ondersteuning. Denk bijvoorbeeld aan studeren met een functiebeperking of studeren op latere leeftijd. We bieden diverse workshops, bijeenkomsten en keuzevakken aan die inspelen op de huidige trends en ontwikkelingen in het onderwijs en de samenleving. Een team van professionals en ervaringsdeskundigen staat klaar om jou te voorzien van inspiratie, advies, support en training.";


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_overzicht2, null);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Studievoorlichting);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Inschrijving);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Toelatingsexamen);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(StudentAanZet);
            }
        });
        return root;
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button btn1 = (Button) view.findViewById(R.id.buttonstudievoorlichting);
        Button btn2 = (Button) view.findViewById(R.id.buttoninschrijving);
        Button btn3 = (Button) view.findViewById(R.id.buttontoelatingsexamen);
        Button btn4 = (Button) view.findViewById(R.id.buttonstudentaanzet);
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

}