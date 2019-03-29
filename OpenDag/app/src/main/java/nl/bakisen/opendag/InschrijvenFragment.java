package nl.bakisen.opendag;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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

    String gender, name, lastname, email, date, education;
    int phone;

    EditText inputGender;
    EditText inputName;
    EditText inputLastname;
    EditText inputPhone;
    EditText inputMail;
    EditText inputDateBirth;
    EditText inputEducation;


    Button signUpButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        gender = inputGender.getText().toString();
        name = inputName.getText().toString();
        lastname = inputLastname.getText().toString();
        phone = Integer.valueOf(inputPhone.getText().toString());
        email = inputMail.getText().toString();
        date = inputDateBirth.getText().toString();
        education = inputEducation.getText().toString();

        showToast(gender);
        showToast(name);
        showToast(lastname);
        showToast(String.valueOf(phone));
        showToast(email);
        showToast(date);
        showToast(education);

        return inflater.inflate(R.layout.fragment_inschrijven, container, false);
    }

    public void showToast(String text) {
//        Toast.makeText(InschrijvenFragment.this, text, Toast.LENGTH_SHORT).show();
    }
}