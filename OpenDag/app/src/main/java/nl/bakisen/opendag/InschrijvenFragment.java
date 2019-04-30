package nl.bakisen.opendag;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InschrijvenFragment extends Fragment {

    Button signUpButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inschrijven, container, false);
        final QuestionInput Student = new QuestionInput("Gender", "Firstname", "Lastname", "Email", "DateOfBirth", "PreviousSchool", "Phonenumber");

        signUpButton = (Button) view.findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    GMailSender sender = new GMailSender("inschrijvenopendag@gmail.com", "Inschrijvenopendag123");
                    sender.sendMail("Inschrijving",
                            Student.getGender(),
                            "inschrijvenopendag@gmail.com",
                            "k.cngz38@hotmail.com");
                    Log.e("tag", "Email send");
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }

            }
        });



        return view;
    }



}