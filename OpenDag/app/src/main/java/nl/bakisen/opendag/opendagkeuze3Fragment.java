package nl.bakisen.opendag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class opendagkeuze3Fragment extends Fragment {
    Button commopenvt3, commopendt3, Infopenvt3, Infopendt3, CMDopen3, techopen3, cmgtopen3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze3, container, false);

        commopenvt3= (Button) view.findViewById(R.id.commopenvt3);
        commopendt3= (Button) view.findViewById(R.id.commopendt3);
        Infopenvt3= (Button) view.findViewById(R.id.Infopenvt3);
        Infopendt3= (Button) view.findViewById(R.id.Infopendt3);
        CMDopen3= (Button) view.findViewById(R.id.CMDopen3);
        techopen3= (Button) view.findViewById(R.id.techopen3);
        cmgtopen3= (Button) view.findViewById(R.id.cmgtopen3);


        commopenvt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopenvt3 = getFragmentManager().beginTransaction();
                commopenvt3.replace(R.id.fragment_container, new OpenDag3CommvtFragment());
                commopenvt3.addToBackStack(null).commit();
            }
        });

        commopendt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopendt3 = getFragmentManager().beginTransaction();
                commopendt3.replace(R.id.fragment_container, new OpenDag3CommdtFragment());
                commopendt3.addToBackStack(null).commit();
            }
        });

        Infopenvt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopenvt3 = getFragmentManager().beginTransaction();
                Infopenvt3.replace(R.id.fragment_container, new OpenDag3InformaticavtFragment());
                Infopenvt3.addToBackStack(null).commit();
            }
        });

        Infopendt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopendt3 = getFragmentManager().beginTransaction();
                Infopendt3.replace(R.id.fragment_container, new OpenDag3InformaticadtFragment());
                Infopendt3.addToBackStack(null).commit();
            }
        });

        CMDopen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction CMDopen3 = getFragmentManager().beginTransaction();
                CMDopen3.replace(R.id.fragment_container, new OpenDag3CMDFragment());
                CMDopen3.addToBackStack(null).commit();
            }
        });

        techopen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction techopen3 = getFragmentManager().beginTransaction();
                techopen3.replace(R.id.fragment_container, new OpenDag3TechnischeInformaticaFragment());
                techopen3.addToBackStack(null).commit();
            }
        });

        cmgtopen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction cmgtopen3 = getFragmentManager().beginTransaction();
                cmgtopen3.replace(R.id.fragment_container, new OpenDag3CMGTFragment());
                cmgtopen3.addToBackStack(null).commit();
            }
        });
        return view;

    }

}
