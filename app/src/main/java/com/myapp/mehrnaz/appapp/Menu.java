package com.myapp.mehrnaz.appapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Mehrnaz on 1/17/2017.
 */

public class Menu extends Activity {
    public int [][] items;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
       // LinearLayout container = (LinearLayout) findViewById(R.id.LinearLayout01);

      //TableLayout tb = (TableLayout) findViewById(R.id.TableLayout03);

        View.OnClickListener clickListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getTag().toString()) {
                    case "11":
//                       TextView tv = new TextView(Menu.this);
                        //       tv.setBackgroundResource(R.color.colorIcons);
                        Intent intent=new Intent(Menu.this,test.class);
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
        //addad 6 o 8 nbyad sabet bashn va byd motaghr bashn
        //bjay ll tablelayout bashe
        for (int i = 1; i <= 8; i++) {
           // LinearLayout ll = new LinearLayout(Menu.this);
            TableLayout tableLayout=new TableLayout(Menu.this);
            //LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            TableLayout.LayoutParams llParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);

            tableLayout.setWeightSum(6);
            tableLayout.setOrientation(LinearLayout.HORIZONTAL);
            tableLayout.setLayoutParams(llParams);
            //container.addView(tableLayout);
            for (int j = 1; j <= 6; j++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT);
                params.setMargins(5,5,5,5);
                params.weight = 1;
                TextView tv = new TextView(Menu.this);
                Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
                //r.string bayad motagheyr bashe na sabet
                tv.setText(this.getString(R.string.icon_cloud));
                tv.setTypeface(font);
                tv.setTextSize(40);
                tv.setPadding(5,5,5,5);
                tv.setGravity(Gravity.CENTER);
                tv.setLayoutParams(params);
                tv.setTag(i + "" + j);
                tv.setBackgroundResource(R.color.colorCloud);
                tableLayout.addView(tv);
                tv.setOnClickListener(clickListener);
            }

        }
    }
}