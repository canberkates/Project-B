package nl.bakisen.opendag;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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

public class InschrijvenFragment extends Fragment {

//    String gender, name, lastname, email, date, education;
//    int phone;
//
//    EditText inputGender;
//    EditText inputName;
//    EditText inputLastname;
//    EditText inputPhone;
//    EditText inputMail;
//    EditText inputDateBirth;
//    EditText inputEducation;
//
//

    Button signUpButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inschrijven, container, false);

//        inputGender = view.findViewById(R.id.inputGender);

//        name = inputName.getText().toString();
//        lastname = inputLastname.getText().toString();
//        phone = Integer.valueOf(inputPhone.getText().toString());
//        email = inputMail.getText().toString();
//        date = inputDateBirth.getText().toString();
//        education = inputEducation.getText().toString();

        signUpButton = (Button) view.findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getContext();
                CharSequence text = "Bedankt voor het inschrijven. je krijgt zo spoedig mogelijk een e-mail.";
                Toast toast = Toast.makeText(context, text,Toast.LENGTH_SHORT);
                toast.show();

                FragmentTransaction fraanmeldingklaar = getFragmentManager().beginTransaction();
                fraanmeldingklaar.replace(R.id.fragment_container, new HomeFragment());
                fraanmeldingklaar.commit();
            }
        });

        return view;
    }

//    public void showToast(String text) {
//        Toast.makeText(InschrijvenFragment.this, text, Toast.LENGTH_SHORT).show();
//    }

}