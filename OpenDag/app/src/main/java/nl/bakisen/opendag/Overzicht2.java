package nl.bakisen.opendag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Overzicht2 extends AppCompatActivity {
    TextView txt1;
    Button btn1, btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overzicht2);
        txt1 = (TextView) findViewById(R.id.button1txt);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Studievoorlicht]xing is hét aanspreekpunt voor informatie over alle opleidingen, toelatingseisen en de aanmeldprocedure. Ook is hier praktische informatie te krijgen over toelatingsexamens, voorbereidingscursussen, buitenlandse diploma’s, proefstuderen en studiekosten. De studievoorlichters kunnen je tevens helpen als je nog twijfels hebt over je studiekeuze, bijvoorbeeld met een workshop of een individueel studiekeuzetraject.");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Bij de balie van Studenten Service Center kun je terecht met vragen over aanmelden, jouw (her)inschrijving, collegegeld en de betaling daarvan. Daarnaast kun je tijdens de open dag documenten inleveren die nodig zijn voor je aanmelding.");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Wil je een hbo-opleiding volgen, maar beschik je nog niet over de juiste vooropleiding? Dan kun je examen doen via het Toelatingsonderzoek 21+, het Onderzoek deficiëntie of het Onderzoek NT2 om alsnog toegelaten te worden tot jouw opleiding.");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Student a/an Zet is de plek waar je als student binnen kunt lopen voor specifieke ondersteuning. Denk bijvoorbeeld aan studeren met een functiebeperking of studeren op latere leeftijd. We bieden diverse workshops, bijeenkomsten en keuzevakken aan die inspelen op de huidige trends en ontwikkelingen in het onderwijs en de samenleving. Een team van professionals en ervaringsdeskundigen staat klaar om jou te voorzien van inspiratie, advies, support en training.");
            }
        });
    }
}
