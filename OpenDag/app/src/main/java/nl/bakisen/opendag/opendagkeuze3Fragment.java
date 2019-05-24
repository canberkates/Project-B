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


public class opendagkeuze3Fragment extends Fragment {
//    Button commopen3, Infopen3, CMDopen3, techopen3, cmgtopen3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_opendagkeuze3, container, false);

//        commopen3= (Button) view.findViewById(R.id.commopen3);
//        Infopen3= (Button) view.findViewById(R.id.Infopen3);
//        CMDopen3= (Button) view.findViewById(R.id.CMDopen3);
//        techopen3= (Button) view.findViewById(R.id.techopen3);
//        cmgtopen3= (Button) view.findViewById(R.id.cmgtopen3);
//
//
//        commopen3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction commopen3 = getFragmentManager().beginTransaction();
//                commopen3.replace(R.id.fragment_container, new ...());
//                commopen3.addToBackStack(null).commit();
//            }
//        });
//
//        Infopen3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction Infopen3 = getFragmentManager().beginTransaction();
//                Infopen3.replace(R.id.fragment_container, new ...());
//                Infopen3.addToBackStack(null).commit();
//            }
//        });
//
//        CMDopen3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction CMDopen3 = getFragmentManager().beginTransaction();
//                CMDopen3.replace(R.id.fragment_container, new ...());
//                CMDopen3.addToBackStack(null).commit();
//            }
//        });
//
//        techopen3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction techopen3 = getFragmentManager().beginTransaction();
//                techopen3.replace(R.id.fragment_container, new ...());
//                techopen3.addToBackStack(null).commit();
//            }
//        });
//
//        cmgtopen3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentTransaction cmgtopen3 = getFragmentManager().beginTransaction();
//                cmgtopen3.replace(R.id.fragment_container, new ...());
//                cmgtopen3.addToBackStack(null).commit();
//            }
//        });
        return view;

    }

}
