package nl.bakisen.opendag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button opendag1 = (Button) view.findViewById(R.id.opendag1);
        Button opleidingen = (Button) view.findViewById(R.id.opleidingen);
        opleidingen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fropleidingen = getFragmentManager().beginTransaction();
                fropleidingen.replace(R.id.fragment_container, new OpleidingenFragment());
                fropleidingen.commit();

            }
        });
        opendag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fropendag1 = getFragmentManager().beginTransaction();
                fropendag1.replace(R.id.fragment_container, new OverzichtOpenDag1Fragment());
                fropendag1.commit();
            }
        });

        return view;

    }



}
