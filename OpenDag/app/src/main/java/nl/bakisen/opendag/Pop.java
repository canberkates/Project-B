package nl.bakisen.opendag;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Pop extends Activity {

    int background;
    private ImageView zoombackground;
    private Float scale = 1f;
    private ScaleGestureDetector SGD;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        Bundle extras = getIntent().getExtras();
        RelativeLayout layout = findViewById(R.id.popwindow);
        zoombackground = (ImageView) findViewById(R.id.zoombackground);

        SGD = new ScaleGestureDetector(this, new ScaleListener());

        if (extras != null) {
            background = extras.getInt("plattegrond");
        }

        if (background == 1) {
            zoombackground.setImageResource(R.drawable.beganegrond);
            /*layout.setBackgroundResource(R.drawable.beganegrond);*/
        }
        else if (background == 2) {
            zoombackground.setImageResource(R.drawable.etage1);
            /*layout.setBackgroundResource(R.drawable.etage1);*/
        }
        else if (background == 3) {
            zoombackground.setImageResource(R.drawable.etage2);
            /*layout.setBackgroundResource(R.drawable.etage2);*/
        }
        else if (background == 4) {
            zoombackground.setImageResource(R.drawable.etage3);
            /*layout.setBackgroundResource(R.drawable.etage3);*/
        }
        else if (background == 5) {
            zoombackground.setImageResource(R.drawable.etage4);
            /*layout.setBackgroundResource(R.drawable.etage4);*/
        }
        else if (background == 6) {
            zoombackground.setImageResource(R.drawable.etage5);
            /*layout.setBackgroundResource(R.drawable.etage5);*/
        }

        

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width),(int)(height*.2));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);


    }

    @Override
    public boolean onTouchEvent(MotionEvent ev){
        SGD.onTouchEvent(ev);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            scale = scale * detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            zoombackground.setScaleX(scale);
            zoombackground.setScaleY(scale);
            return true;

        }
    }
}
