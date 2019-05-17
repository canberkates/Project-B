package nl.bakisen.opendag;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Pop extends Activity {

    int background;

    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        Bundle extras = getIntent().getExtras();
        RelativeLayout layout = findViewById(R.id.popwindow);
        if (extras != null) {
            background = extras.getInt("plattegrond");
        }

        if (background == 1) {
            layout.setBackgroundResource(R.drawable.beganegrond);
        }
        else if (background == 2) {
            layout.setBackgroundResource(R.drawable.etage1);
        }
        else if (background == 3) {
            layout.setBackgroundResource(R.drawable.etage2);
        }
        else if (background == 4) {
            layout.setBackgroundResource(R.drawable.etage3);
        }
        else if (background == 5) {
            layout.setBackgroundResource(R.drawable.etage4);
        }
        else if (background == 6) {
            layout.setBackgroundResource(R.drawable.etage5);
        }

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.9),(int)(height*.9));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
    }
}
