package nl.bakisen.opendag;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

import nl.bakisen.opendag.Database.BackgroundTask;
import nl.bakisen.opendag.Domain.Aanmelding;
import nl.bakisen.opendag.Domain.GMailSender;

public class InschrijvenFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    String gender, name, lastName, phone, email, education, date, chosenEducation;
    Aanmelding newAanmelding;



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_inschrijven, container, false);

        final EditText inputGender = view.findViewById(R.id.inputGender) ;
        final EditText inputName = view.findViewById(R.id.inputName);
        final EditText inputLastname = view.findViewById(R.id.inputLastname);
        final EditText inputPhone = view.findViewById(R.id.inputPhone);
        final EditText inputMail = view.findViewById(R.id.inputMail);
        final EditText inputDateBirth = view.findViewById(R.id.inputDateBirth);
        final EditText inputEducation = view.findViewById(R.id.inputEducation);

        Spinner educationSpinner = (Spinner)view.findViewById(R.id.educationSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(view.getContext(), R.array.education_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        educationSpinner.setAdapter(adapter);


        educationSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chosenEducation = parent.getItemAtPosition(position).toString();
//                Toast.makeText(parent.getContext(), chosenEducation, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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

                String method = "insert data november";
                BackgroundTask bgtask = new BackgroundTask(v.getContext());
                bgtask.execute(method, gender, name, lastName, phone, email, date, education, chosenEducation);

                final GMailSender sender = new GMailSender("inschrijvenopendag@gmail.com", "Inschrijvenopendag123");
                newAanmelding = new Aanmelding(gender, name, lastName, date, email, phone, education);
                final String subject = "Inschrijving Open Dag 2 november";
                final String bodystudent = "Beste " + newAanmelding.getFirstName() + " " + newAanmelding.getLastName() + ",\n\nBedankt voor je inschrijving voor de open dag van 2 november 2018.\nWij zien je graag op deze dag!!\n\nHogeschool Rotterdam";
                final String recipient = newAanmelding.getMail();
                final String senderMail = sender.getUser();

                final String recipientSignup = sender.getUser();
                final String subjectSignup = "Nieuwe inschrijving Open Dag 2 november";

                final String body = "Er is een nieuwe inschrijving gedaan voor 2 november:\n\nNaam: "+ newAanmelding.getFirstName() + " " + newAanmelding.getLastName() +
                        "\nE-mail: " + newAanmelding.getMail() + "\nVorige opleiding: " + newAanmelding.getEducation() + "\nTelefoon nummer: " + newAanmelding.getPhone() + "\n";


                new AsyncTask<Void, Void, Void>() {
                    @Override
                    public Void doInBackground(Void... arg) {
                        try {
                            sender.sendMail(subject, bodystudent,senderMail, recipient);
                            System.out.println("sending to: " + newAanmelding.getMail());
                        } catch (Exception e) {
                            Log.e("SendMail", e.getMessage(), e);
                        }

                        try {
                            sender.sendMail(subjectSignup, body,senderMail, recipientSignup);
                            System.out.println("sending to: " + senderMail);
                        } catch (Exception e) {
                            Log.e("SendMail", e.getMessage(), e);
                        }
                        return null;

                    }
                }.execute();

                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new MailOntvangenFragment());
                home.commit();
            }
        });

        return view;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}