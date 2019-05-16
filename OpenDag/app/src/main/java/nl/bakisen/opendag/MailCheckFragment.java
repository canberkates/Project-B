package nl.bakisen.opendag;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MailCheckFragment extends Fragment {

    ImageButton instaKnop, faceKnop, twitterKnop;

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_overzichtopendag1, container, false);

        instaKnop = (ImageButton) view.findViewById(R.id.instaKnop);
        twitterKnop = (ImageButton) view.findViewById(R.id.twitterKnop);
        faceKnop = (ImageButton) view.findViewById(R.id.faceKnop);

        instaKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagram = "https://www.instagram.com/hogeschoolrotterdam/";
                Uri webadres = Uri.parse(instagram);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);
            }
        });

        twitterKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String twitter = "https://twitter.com/intent/tweet?url=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2F&text=Home%3A&original_referer=";
                Uri webadres = Uri.parse(twitter);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);
            }
        });

        faceKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/sharer.php?u=http%3A%2F%2Fwww.hogeschoolrotterdam.nl%2Fvoorlichting%2Fhulp-bij-studiekeuze%2Fopen-dag%2F";
                Uri webadres = Uri.parse(facebook);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(webadres);
                getActivity().startActivity(i);

                FragmentTransaction home = getFragmentManager().beginTransaction();
                home.replace(R.id.fragment_container, new HomeFragment());
                home.commit();
            }
        });
        return view;
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
