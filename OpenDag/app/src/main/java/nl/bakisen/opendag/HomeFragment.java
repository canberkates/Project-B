package nl.bakisen.opendag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    private Button opendag1overzicht;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.O);

        opendag1overzicht = (Button) getView().findViewById((R.id.opendag1));
        opendag1overzicht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOverzicht2();

            }
        });
    }

    public void openOverzicht2() {
        Intent intent = new Intent(getActivity(),Overzicht2.class);
        startActivity(intent);
    }

}
