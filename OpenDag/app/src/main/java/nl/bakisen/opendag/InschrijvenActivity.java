package nl.bakisen.opendag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;


public class InschrijvenActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String name, lastname, email, date;
    int phone;

    EditText inputName;
    EditText inputLastname;
    EditText inputPhone;
    EditText inputMail;
    EditText inputDateBirth;

    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inschrijven);


        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        inputName = (EditText) findViewById(R.id.inputName);
        inputLastname = (EditText) findViewById(R.id.inputLastname);
        inputPhone = (EditText) findViewById(R.id.inputPhone);
        inputMail = (EditText) findViewById(R.id.inputMail);
        inputDateBirth = (EditText) findViewById(R.id.inputDateBirth);

        signUpButton = (Button) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = inputName.getText().toString();
                lastname = inputLastname.getText().toString();
                phone = Integer.valueOf(inputPhone.getText().toString());
                email = inputMail.getText().toString();
                date = inputDateBirth.getText().toString();
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

