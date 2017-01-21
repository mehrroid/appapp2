package com.myapp.mehrnaz.appapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mehrnaz on 1/21/2017.
 */

public class Lev extends Activity {
    private LinearLayout container;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        container = (android.widget.LinearLayout) findViewById(R.id.activity_main);
        draw(getResources().getStringArray(R.array.type),3);

        //addad 6 o 8 nbyad sabet bashn va byd motaghr bashn
        //bjay ll tablelayout bashe

    }

    private void draw(String[] strs, int column) {


        int row = strs.length / column;
        int index = 0;

        for (int i = 0; i < row; i++) {
            LinearLayout ll = new LinearLayout(Lev.this);
            LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
            ll.setWeightSum(6);
            ll.setOrientation(android.widget.LinearLayout.HORIZONTAL);
            ll.setLayoutParams(llParams);
            container.addView(ll);
            for (int j = 0; j < column; j++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(5, 5, 5, 5);
                params.weight = 1;
                TextView tv = new TextView(Lev.this);
                Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
                //r.string bayad motagheyr bashe na sabet
                tv.setText(strs[index]);
                tv.setTypeface(font);
                tv.setTextSize(40);
                tv.setPadding(5, 5, 5, 5);
                tv.setGravity(Gravity.CENTER);
                tv.setLayoutParams(params);
                tv.setTag(i + "" + j);
                tv.setBackgroundResource(R.color.colorCloud);
                ll.addView(tv);
                tv.setOnClickListener(clickListener);
                index++;
            }

        }
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getTag().toString()) {
                case "11":
//                       TextView tv = new TextView(Menu.this);
                    //       tv.setBackgroundResource(R.color.colorIcons);
                    Intent intent = new Intent(Lev.this, test.class);
                    startActivity(intent);
                    break;
                case "01":
                    break;
                case "02":
                    break;
                case "03":
                    break;
                case "04":
                    break;
                case "05":
                    break;
            }
        }
    };
}



