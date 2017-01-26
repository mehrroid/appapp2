package com.myapp.mehrnaz.appapp;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
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
        setContentView(R.layout.level);
        container = (android.widget.LinearLayout) findViewById(R.id.activity_main);
        //yek array dar string be esm type tarif shode ast
        draw(getResources().getStringArray(R.array.type), 3);
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
                TextView card = new TextView(Lev.this);
                Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
                card.setText(strs[index]);
                card.setTypeface(font);
                card.setTextSize(40);
                card.setPadding(5, 5, 5, 5);
                card.setGravity(Gravity.CENTER);
                card.setLayoutParams(params);
                card.setTag(i +""+ j);
                card.setBackgroundResource(R.color.colorCloud);
                ll.addView(card);
               card.setOnClickListener(clickListener);
                index++;
            }
        }
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Lev.this, Game.class);
            
            switch (v.getTag().toString()) {
                case "00":
                    Log.i("goneToGame()","case 00");
                    intent.putExtra("item", getString(R.string.icon_plus));
                    intent.putExtra("levelNo", (Integer)10);
                    startActivity(intent);
                    break;
                case "01":
                    Log.i("goneToGame()","case 01");
               //     Intent intent2 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_cloud));
                    intent.putExtra("levelNo", (Integer)12);
                    startActivity(intent);
                    break;
                case "02":
                    Log.i("goneToGame()","case 02");
                    //Intent intent3 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_setting));
                    intent.putExtra("levelNo", (Integer)14);
                    startActivity(intent);
                    break;
                case "10":
                    Log.i("goneToGame()","case 03");
                    //Intent intent4 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_setting));
                    intent.putExtra("levelNo", (Integer)8);
                    startActivity(intent);
                    break;
                case "11":
                    Log.i("goneToGame()","case 04");
                    //Intent intent4 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_feed));
                    intent.putExtra("levelNo", (Integer)12);
                    startActivity(intent);
                    break;
                case "12":
                    Log.i("goneToGame()","case 05");
                    //Intent intent4 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_feed));
                    intent.putExtra("levelNo", (Integer)14);
                    startActivity(intent);
                    break;
                case "20":
                    Log.i("goneToGame()","case 06");
                    //Intent intent4 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_feed));
                    intent.putExtra("levelNo", (Integer)16);
                    startActivity(intent);
                    break;
                case "21":
                 //   Intent intent = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_feed));
                    intent.putExtra("levelNo", (Integer)18);
                    startActivity(intent);
                    break;
                case "22":
                    //tent intent6 = new Intent(Lev.this, Game.class);
                    intent.putExtra("item", getString(R.string.icon_cloud));
                    startActivity(intent);
                    intent.putExtra("levelNo", (Integer)20);
                    break;

            }
        }
    };
}
