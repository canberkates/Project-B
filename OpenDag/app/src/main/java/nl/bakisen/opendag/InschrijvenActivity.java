package nl.bakisen.opendag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import android.widget.Spinner;


public class InschrijvenActivity extends AppCompatActivity{

//    private Spinner spinner1, spinner2;
//    private Button btnSubmit;

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inschrijven);

//        addListenerOnButton();
//        addListenerOnSpinnerItemSelection();


        inputGender = (EditText) findViewById(R.id.inputGender);
        inputName = (EditText) findViewById(R.id.inputName);
        inputLastname = (EditText) findViewById(R.id.inputLastname);
        inputPhone = (EditText) findViewById(R.id.inputPhone);
        inputMail = (EditText) findViewById(R.id.inputMail);
        inputDateBirth = (EditText) findViewById(R.id.inputDateBirth);
        inputEducation = (EditText) findViewById(R.id.inputEducation);

//        signUpButton = (Button) findViewById(R.id.signUpButton);

//    }
//    public void addListenerOnSpinnerItemSelection() {
//        spinner1 = (Spinner) findViewById(R.id.geslacht);
//        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }
//
//    public void addListenerOnButton() {
//
//        spinner1 = (Spinner) findViewById(R.id.geslacht);
//        btnSubmit = (Button) findViewById(R.id.btnSubmit);
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

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

            Toast.makeText(InschrijvenActivity.this,
                    "OnClickListener : " +
                            "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()),
                    Toast.LENGTH_SHORT).show();
        }
    });
    }

    public void showToast(String text) {
        Toast.makeText(InschrijvenActivity.this, text, Toast.LENGTH_SHORT).show();
    }

}

