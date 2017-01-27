package com.myapp.mehrnaz.appapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by Mehrnaz on 1/27/2017.
 */

public class Splash_Screen extends Activity {
    TextView txtLoading;
    Typeface font;
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        txtLoading = (TextView) findViewById(R.id.txtLoading);
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        txtLoading.setTypeface(font);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                Intent intent = new Intent(Splash_Screen.this, NavigationDrawer.class);
                startActivity(intent);


                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
