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


public class opendagkeuze1Fragment extends Fragment {
    Button commopendt, commopenvt, Infopenvt, Infopendt, CMDopen, techopen, cmgtopen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze1, container, false);

        commopenvt= (Button) view.findViewById(R.id.commopenvt);
        commopendt= (Button) view.findViewById(R.id.commopendt);
        Infopenvt= (Button) view.findViewById(R.id.Infopenvt);
        Infopendt= (Button) view.findViewById(R.id.Infopendt);
        CMDopen= (Button) view.findViewById(R.id.CMDopen);
        techopen= (Button) view.findViewById(R.id.techopen);
        cmgtopen= (Button) view.findViewById(R.id.cmgtopen);


        commopenvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopenvt = getFragmentManager().beginTransaction();
                commopenvt.replace(R.id.fragment_container, new OpenDag1CommvtFragment());
                commopenvt.addToBackStack(null).commit();
            }
        });

        commopendt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction commopendt = getFragmentManager().beginTransaction();
                commopendt.replace(R.id.fragment_container, new OpenDag1CommdtFragment());
                commopendt.addToBackStack(null).commit();
            }
        });


        Infopenvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopenvt = getFragmentManager().beginTransaction();
                Infopenvt.replace(R.id.fragment_container, new OpenDag1InformaticavtFragment());
                Infopenvt.addToBackStack(null).commit();
            }
        });

        Infopendt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Infopendt = getFragmentManager().beginTransaction();
                Infopendt.replace(R.id.fragment_container, new OpenDag1InformaticavtFragment());
                Infopendt.addToBackStack(null).commit();
            }
        });


        CMDopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction CMDopen = getFragmentManager().beginTransaction();
                CMDopen.replace(R.id.fragment_container, new OpenDag1CMDFragment());
                CMDopen.addToBackStack(null).commit();
            }
        });

        techopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction techopen = getFragmentManager().beginTransaction();
                techopen.replace(R.id.fragment_container, new OpenDag1TechnischeInformaticaFragment());
                techopen.addToBackStack(null).commit();
            }
        });

        cmgtopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction cmgtopen = getFragmentManager().beginTransaction();
                cmgtopen.replace(R.id.fragment_container, new OpenDag1CMGTFragment());
                cmgtopen.addToBackStack(null).commit();
            }
        });
        return view;

    }

}
