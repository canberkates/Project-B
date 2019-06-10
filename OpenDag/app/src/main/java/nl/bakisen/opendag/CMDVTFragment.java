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

public class CMDVTFragment extends Fragment {
    Button backbutton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cmdvt, container, false);

        backbutton= (Button) view.findViewById(R.id.backbutton);


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction backbutton = getFragmentManager().beginTransaction();
                backbutton.replace(R.id.fragment_container, new OpleidingenFragment());
                backbutton.addToBackStack(null).commit();
            }
        });
        return view;

    }
}