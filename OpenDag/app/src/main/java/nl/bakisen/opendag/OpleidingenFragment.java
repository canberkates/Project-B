package nl.bakisen.opendag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OpleidingenFragment extends Fragment {
    Button communicatiedeel, Informaticadeel, communicatievol, CMDvol, informaticavol, techinformaticavol;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_opleidingen, container, false);

        communicatiedeel = (Button) view.findViewById(R.id.communicatiedeel);
        Informaticadeel = (Button) view.findViewById(R.id.Informaticadeel);
        communicatievol = (Button) view.findViewById(R.id.communicatievol);
        CMDvol = (Button) view.findViewById(R.id.CMDvol);
        informaticavol = (Button) view.findViewById(R.id.informaticavol);
        techinformaticavol = (Button) view.findViewById(R.id.techinformaticavol);

        communicatiedeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction communicatiedeel = getFragmentManager().beginTransaction();
                communicatiedeel.replace(R.id.fragment_container, new CommunicatieDTFragment());
                communicatiedeel.addToBackStack(null).commit();

            }
        });

        Informaticadeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Informaticadeel = getFragmentManager().beginTransaction();
                Informaticadeel.replace(R.id.fragment_container, new InformaticaDTFragment());
                Informaticadeel.addToBackStack(null).commit();

            }
        });

        communicatievol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction communicatievol = getFragmentManager().beginTransaction();
                communicatievol.replace(R.id.fragment_container, new CommunicatieVTFragment());
                communicatievol.addToBackStack(null).commit();

            }
        });

        CMDvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction CMDvol = getFragmentManager().beginTransaction();
                CMDvol.replace(R.id.fragment_container, new CMDVTFragment());
                CMDvol.addToBackStack(null).commit();

            }
        });

        informaticavol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction informaticavol = getFragmentManager().beginTransaction();
                informaticavol.replace(R.id.fragment_container, new InformaticaVTFragment());
                informaticavol.addToBackStack(null).commit();

            }
        });

        techinformaticavol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction techinformaticavol = getFragmentManager().beginTransaction();
                techinformaticavol.replace(R.id.fragment_container, new TechnischeInformaticaVTFragment());
                techinformaticavol.addToBackStack(null).commit();

            }
        });
        return view;
    }
}
