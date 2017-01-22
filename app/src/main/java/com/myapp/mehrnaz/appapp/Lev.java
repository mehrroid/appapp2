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
                TextView tv = new TextView(Lev.this);
                Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
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
                case "00":
                    Intent intent = new Intent(Lev.this, Game.class);

                    intent.putExtra("item1", getString(R.string.icon_plus));
                    startActivity(intent);
                    break;
                case "01":
                    Intent intent2 = new Intent(Lev.this, Game.class);
                    intent2.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent2);
                    break;
                case "02":
                    Intent intent3 = new Intent(Lev.this, Game.class);
                    intent3.putExtra("item1", getString(R.string.icon_setting));
                    startActivity(intent3);
                    break;
                case "03":
                    Intent intent4 = new Intent(Lev.this, Game.class);
                    intent4.putExtra("item1", getString(R.string.icon_feed));
                    startActivity(intent4);
                    break;
                case "10":
                    Intent intent5 = new Intent(Lev.this, Game.class);
                    intent5.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent5);
                    break;
                case "11":
                    Intent intent6 = new Intent(Lev.this, Game.class);
                    intent6.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent6);
                    break;
                case "12":
                    Intent intent7 = new Intent(Lev.this, Game.class);
                    intent7.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent7);
                    break;
                case "20":
                    Intent intent8 = new Intent(Lev.this, Game.class);
                    intent8.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent8);
                    break;
                case "21":
                    Intent intent9 = new Intent(Lev.this, Game.class);
                    intent9.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent9);
                    break;
                case "22":
                    Intent intent10 = new Intent(Lev.this, Game.class);
                    intent10.putExtra("item1", getString(R.string.icon_cloud));
                    startActivity(intent10);
                    break;
            }
        }
    };
}
