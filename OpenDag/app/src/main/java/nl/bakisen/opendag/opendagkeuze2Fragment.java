package nl.bakisen.opendag;

import android.icu.text.IDNA;
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
    Button commopenvt2, commopendt2, Infopenvt2, Infopendt2, CMDopen2, techopen2, cmgtopen2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze2, container, false);

        commopenvt2= (Button) view.findViewById(R.id.commopenvt2);
        commopendt2= (Button) view.findViewById(R.id.commopendt2);
        Infopenvt2= (Button) view.findViewById(R.id.Infopenvt2);
        Infopendt2= (Button) view.findViewById(R.id.Infopendt2);
        CMDopen2= (Button) view.findViewById(R.id.CMDopen2);
        techopen2= (Button) view.findViewById(R.id.techopen2);
        cmgtopen2= (Button) view.findViewById(R.id.cmgtopen2);


        commopenvt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopenvt2 = getFragmentManager().beginTransaction();
                commopenvt2.replace(R.id.fragment_container, new OpenDag2CommvtFragment());
                commopenvt2.addToBackStack(null).commit();
            }
        });

        commopendt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopendt2 = getFragmentManager().beginTransaction();
                commopendt2.replace(R.id.fragment_container, new OpenDag2CommdtFragment());
                commopendt2.addToBackStack(null).commit();
            }
        });


        Infopenvt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopenvt2 = getFragmentManager().beginTransaction();
                Infopenvt2.replace(R.id.fragment_container, new OpenDag2InformaticavtFragment());
                Infopenvt2.addToBackStack(null).commit();
            }
        });


        Infopendt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopendt2 = getFragmentManager().beginTransaction();
                Infopendt2.replace(R.id.fragment_container, new OpenDag2InformaticadtFragment());
                Infopendt2.addToBackStack(null).commit();
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
