package nl.bakisen.opendag;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OverzichtFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_overzicht, container, false);

        Button opendag1 = (Button) view.findViewById(R.id.opendag1);
        opendag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fropendag1 = getFragmentManager().beginTransaction();
                fropendag1.replace(R.id.fragment_container, new OverzichtOpenDag1Fragment());
                fropendag1.addToBackStack(null).commit();
            }
        });

        Button opendag2 = (Button) view.findViewById(R.id.opendag2);
        opendag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fropendag2 = getFragmentManager().beginTransaction();
                fropendag2.replace(R.id.fragment_container, new OverzichtOpenDag2Fragment());
                fropendag2.addToBackStack(null).commit();
            }
        });

        Button opendag3 = (Button) view.findViewById(R.id.opendag3);
        opendag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fropendag3 = getFragmentManager().beginTransaction();
                fropendag3.replace(R.id.fragment_container, new OverzichtOpenDag3Fragment());
                fropendag3.addToBackStack(null).commit();
            }
        });


        return view;

    }
}
