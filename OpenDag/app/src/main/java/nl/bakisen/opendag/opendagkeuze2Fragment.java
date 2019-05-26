package nl.bakisen.opendag;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class opendagkeuze2Fragment extends Fragment {
    Button commopen2, Infopen2, CMDopen2, techopen2, cmgtopen2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze2, container, false);

        commopen2= (Button) view.findViewById(R.id.commopen2);
        Infopen2= (Button) view.findViewById(R.id.Infopen2);
        CMDopen2= (Button) view.findViewById(R.id.CMDopen2);
        techopen2= (Button) view.findViewById(R.id.techopen2);
        cmgtopen2= (Button) view.findViewById(R.id.cmgtopen2);


        commopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopen2 = getFragmentManager().beginTransaction();
                commopen2.replace(R.id.fragment_container, new OpenDag2CommFragment());
                commopen2.addToBackStack(null).commit();
            }
        });

        Infopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopen2 = getFragmentManager().beginTransaction();
                Infopen2.replace(R.id.fragment_container, new OpenDag2InformaticaFragment());
                Infopen2.addToBackStack(null).commit();
            }
        });

        CMDopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction CMDopen2 = getFragmentManager().beginTransaction();
                CMDopen2.replace(R.id.fragment_container, new OpenDag2CMDFragment());
                CMDopen2.addToBackStack(null).commit();
            }
        });

        techopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction techopen2 = getFragmentManager().beginTransaction();
                techopen2.replace(R.id.fragment_container, new OpenDag2TechnischeInformaticaFragment());
                techopen2.addToBackStack(null).commit();
            }
        });

        cmgtopen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction cmgtopen2 = getFragmentManager().beginTransaction();
                cmgtopen2.replace(R.id.fragment_container, new OpenDag2CMGTFragment());
                cmgtopen2.addToBackStack(null).commit();
            }
        });
        return view;

    }

}
