package nl.bakisen.opendag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Overzicht extends AppCompatActivity {
    private Button opendag1overzicht;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overzicht);

        opendag1overzicht = (Button) findViewById(R.id.opendag1);
        opendag1overzicht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOverzicht2();

            }
        });
    }

    public void openOverzicht2() {
        Intent intent = new Intent(this, Overzicht2.class);
        startActivity(intent);
    }
}
