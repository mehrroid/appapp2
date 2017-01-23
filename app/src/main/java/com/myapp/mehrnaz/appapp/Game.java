package com.myapp.mehrnaz.appapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Mehrnaz on 1/21/2017.
 */

public class Game extends Activity {
    // textviews for game
    TextView txt_item1;
    TextView txt_item2;
    TextView txt_item3;
    TextView txt_item4;
    TextView txt_item5;
    TextView txt_item6;
    TextView txt_item7;
    TextView txt_item8;
    TextView txt_item9;
    Typeface font;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        txt_item1 = (TextView) findViewById(R.id.txt_item1);
        txt_item2 = (TextView) findViewById(R.id.txt_item2);
        txt_item3 = (TextView) findViewById(R.id.txt_item3);
        txt_item4 = (TextView) findViewById(R.id.txt_item4);
        txt_item5 = (TextView) findViewById(R.id.txt_item5);
        txt_item6 = (TextView) findViewById(R.id.txt_item6);
        txt_item7 = (TextView) findViewById(R.id.txt_item7);
        txt_item8 = (TextView) findViewById(R.id.txt_item8);
        txt_item9 = (TextView) findViewById(R.id.txt_item9);

        //get value from Lev activity

        String item = getIntent().getExtras().getString("item");
        txt_item1.setText(item);
        txt_item1.setTypeface(font);
        txt_item2.setText(item);
        txt_item2.setTypeface(font);
        txt_item3.setText(item);
        txt_item3.setTypeface(font);
        txt_item4.setText(item);
        txt_item4.setTypeface(font);
        txt_item5.setText(item);
        txt_item5.setTypeface(font);
        txt_item6.setText(item);
        txt_item6.setTypeface(font);
        txt_item7.setText(item);
        txt_item7.setTypeface(font);
        txt_item8.setText(item);
        txt_item8.setTypeface(font);
        txt_item9.setText(item);
        txt_item9.setTypeface(font);


    }
}