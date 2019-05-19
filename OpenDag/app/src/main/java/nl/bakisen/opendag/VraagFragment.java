package nl.bakisen.opendag;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nl.bakisen.opendag.Domain.GMailSender;
import nl.bakisen.opendag.Domain.Vraag;

public class VraagFragment extends Fragment {

    String firstName, lastName, email, question;
    Vraag newVraag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vraag, container, false);

        final EditText inputfirstName = view.findViewById(R.id.inputName) ;
        final EditText inputlastName= view.findViewById(R.id.inputLastname);
        final EditText inputemail = view.findViewById(R.id.inputMail);
        final EditText inputquestion = view.findViewById(R.id.inputQuestion);

        Button sendButton;

        sendButton = (Button) view.findViewById(R.id.questionButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                firstName = inputfirstName.getText().toString();
                lastName = inputlastName.getText().toString();
                email = inputemail.getText().toString();
                question = inputquestion.getText().toString();

                final GMailSender sender = new GMailSender("inschrijvenopendag@gmail.com", "Inschrijvenopendag123");
                newVraag = new Vraag(firstName, lastName, email, question);

                final String subject = "Vraag over een open dag";
                final String body = "Hallo " + newVraag.getFirstName() + " " + newVraag.getLastName() + ",\n\nBedankt voor jouw vraag. Wij zullen zo spoedig mogelijk met een antwoord komen.\n" +
                        "heb je nog een andere vraag, stuur dat dan door via de applicatie.\n\nMet vriendelijke groet,\nHR Opendagen";
                final String recipient = newVraag.getMail();
                final String senderMail = sender.getUser();
                final String bodySender = "Er is een nieuwe vraag ingezonden.\n\n " + newVraag.getFirstName() + " " + newVraag.getLastName() + " stelde de vraag: \n\n" + newVraag.getQuestion() + "\n\nVraag beantwoorden kan via het volgende e-mailadres: " + newVraag.getMail();




                new AsyncTask<Void, Void, Void>() {
                    @Override
                    public Void doInBackground(Void... arg) {
                        try {
                            sender.sendMail(subject, body,senderMail, recipient);
                            System.out.println("sending to: " + newVraag.getMail());
                        } catch (Exception e) {
                            Log.e("SendMail", e.getMessage(), e);
                        }




                        return null;
                    }
                }.execute();

                Toast.makeText(getContext(),"Je vraag is ontvangen bij ons. Je krijgt zo spoedig mogelijk een antwoord.",Toast.LENGTH_SHORT).show();

                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new HomeFragment());
                home.commit();
            }
        });
        return view;
    }
}
