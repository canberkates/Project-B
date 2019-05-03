package nl.bakisen.opendag;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nl.bakisen.opendag.Domain.Aanmelding;

public class InschrijvenFragment extends Fragment {

    String gender, name, lastName, phone, email, education, date;
    Aanmelding newAanmelding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inschrijven, container, false);

        final EditText inputGender = view.findViewById(R.id.inputGender) ;
        final EditText inputName = view.findViewById(R.id.inputName);
        final EditText inputLastname = view.findViewById(R.id.inputLastname);
        final EditText inputPhone = view.findViewById(R.id.inputPhone);
        final EditText inputMail = view.findViewById(R.id.inputMail);
        final EditText inputDateBirth = view.findViewById(R.id.inputDateBirth);
        final EditText inputEducation = view.findViewById(R.id.inputEducation);



        Button signUpButton;

        GMailSender sender = new GMailSender("inschrijvenopendag@gmail.com","Inschrijvenopendag123");

        signUpButton = (Button) view.findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                gender = inputGender.getText().toString();
                name = inputName.getText().toString();
                lastName = inputLastname.getText().toString();
                phone = inputPhone.getText().toString();
                email = inputMail.getText().toString();
                date = inputDateBirth.getText().toString();
                education = inputEducation.getText().toString();

                final GMailSender sender = new GMailSender("inschrijvenopendag@gmail.com", "Inschrijvenopendag123");
                newAanmelding = new Aanmelding(gender, name, lastName, date, email, phone, education);
                final String subject = "Inschrijving Open Dag 4 april";
                final String body = "Beste " + newAanmelding.getFirstName() + " " + newAanmelding.getLastName() + ",\n\nBedankt voor je inschrijving voor de open dag van 4 april 2018.\nWij zien je graag op deze dag!!\n\nHogeschool Rotterdam";
                final String recipient = newAanmelding.getMail();
                final String senderMail = sender.getUser();

                new AsyncTask<Void, Void, Void>() {
                    @Override
                    public Void doInBackground(Void... arg) {
                        try {
                            sender.sendMail(subject, body,senderMail, recipient);
                            System.out.println("sending to: " + newAanmelding.getMail());
                        } catch (Exception e) {
                            Log.e("SendMail", e.getMessage(), e);
                        }
                        return null;
                    }
                }.execute();


                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new HomeFragment());
                home.commit();
            }
        });

        return view;
    }

}