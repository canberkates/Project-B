package nl.bakisen.opendag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverzichtFragment extends AppCompatActivity {
    private Button opendag1overzicht;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_overzicht);

        opendag1overzicht = (Button) findViewById(R.id.button);
        opendag1overzicht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOverzicht2();

            }
        });
    }

    public void openOverzicht2() {
        Intent intent = new Intent(this, OverzichtOpenDag1.class);
        startActivity(intent);
    }
}
