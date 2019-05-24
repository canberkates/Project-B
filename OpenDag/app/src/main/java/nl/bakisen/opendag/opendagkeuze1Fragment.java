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


public class opendagkeuze1Fragment extends Fragment {
//    Button commopen, Infopen, CMDopen, techopen, cmgtopen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze1, container, false);

//        commopen= (Button) view.findViewById(R.id.commopen);
//        Infopen= (Button) view.findViewById(R.id.Infopen);
//        CMDopen= (Button) view.findViewById(R.id.CMDopen);
//        techopen= (Button) view.findViewById(R.id.techopen);
//        cmgtopen= (Button) view.findViewById(R.id.cmgtopen);
//
//
//        commopen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction commopen = getFragmentManager().beginTransaction();
//                commopen.replace(R.id.fragment_container, new ...());
//                commopen.addToBackStack(null).commit();
//            }
//        });
//
//        Infopen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction Infopen = getFragmentManager().beginTransaction();
//                Infopen.replace(R.id.fragment_container, new ...());
//                Infopen.addToBackStack(null).commit();
//            }
//        });
//
//        CMDopen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction CMDopen = getFragmentManager().beginTransaction();
//                CMDopen.replace(R.id.fragment_container, new ...());
//                CMDopen.addToBackStack(null).commit();
//            }
//        });
//
//        techopen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction techopen = getFragmentManager().beginTransaction();
//                techopen.replace(R.id.fragment_container, new ...());
//                techopen.addToBackStack(null).commit();
//            }
//        });
//
//        cmgtopen.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction cmgtopen = getFragmentManager().beginTransaction();
//                cmgtopen.replace(R.id.fragment_container, new ...());
//                cmgtopen.addToBackStack(null).commit();
//            }
//        });
        return view;

    }

}
