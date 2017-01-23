package com.myapp.mehrnaz.appapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

// This is mainpage
public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    Typeface font;
    //az icon play baraye mosalasha estfade shode
    TextView txticonplay1;
    TextView txticonplay2;
    TextView txticonplay4;
    TextView txticonsetting;
    TextView txticonuser;
    TextView txticonplay;
    TextView playgamebg;
    TextView txticonmenu;
    TextView txticonmenubg;
    TextView txticonsquare;
    TextView txticonplus;
    TextView txtstar;
    TextView txtstarbg;
    TextView txtuserplus;
    TextView txtplusbg;
    TextView txtsq2;
    TextView txtsq3;
    TextView userplusbg;
    TextView txtsq2bg;
    TextView txtsq3bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        //UI mainpage
        //iconplay haman mosalasha hastan
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        txticonplay1 = (TextView) findViewById(R.id.txticonplay1);
        txticonplay1.setTypeface(font);
        txticonplay2 = (TextView) findViewById(R.id.txticonplay2);
        txticonplay2.setTypeface(font);
        txticonplay4 = (TextView) findViewById(R.id.iconplay4);
        txticonplay4.setTypeface(font);
        txticonsetting = (TextView) findViewById(R.id.txtIconSetting);
        txticonsetting.setTypeface(font);
        txticonuser = (TextView) findViewById(R.id.txtIconUser);
        txticonuser.setTypeface(font);
        txticonplay = (TextView) findViewById(R.id.txtIconPlay);
        txticonplay.setTypeface(font);
        playgamebg = (TextView) findViewById(R.id.txtIconPlaybg);
        playgamebg.setTypeface(font);
        txticonmenu = (TextView) findViewById(R.id.txtIconMenu);
        txticonmenu.setTypeface(font);
        txticonmenubg = (TextView) findViewById(R.id.txtIconMenubg);
        txticonmenubg.setTypeface(font);
        txticonsquare = (TextView) findViewById(R.id.txtsquare);
        txticonsquare.setTypeface(font);
        txticonplus = (TextView) findViewById(R.id.txtplus);
        txticonplus.setTypeface(font);
        txtstar = (TextView) findViewById(R.id.txtstar);
        txtstar.setTypeface(font);
        txtstarbg = (TextView) findViewById(R.id.txtstarbg);
        txtstarbg.setTypeface(font);
        txtuserplus = (TextView) findViewById(R.id.txtUserPlus);
        txtuserplus.setTypeface(font);
        txtplusbg = (TextView) findViewById(R.id.txtplusbg);
        txtplusbg.setTypeface(font);
        txtsq2 = (TextView) findViewById(R.id.txtsquare2);
        txtsq2.setTypeface(font);
        txtsq3 = (TextView) findViewById(R.id.txtsquare3);
        txtsq3.setTypeface(font);
        userplusbg = (TextView) findViewById(R.id.txtUserPlusbg);
        userplusbg.setTypeface(font);
        //sq=square baraye background icon estfade shode
        txtsq2bg = (TextView) findViewById(R.id.txtsquare2bg);
        txtsq2bg.setTypeface(font);
        txtsq3bg = (TextView) findViewById(R.id.txtsquare3bg);
        txtsq3bg.setTypeface(font);
        //Go to Level Activity
        txticonsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationDrawer.this, com.myapp.mehrnaz.appapp.Lev.class);
                startActivity(intent);
            }
        });
        //Go to Level Activity
        txticonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationDrawer.this, com.myapp.mehrnaz.appapp.Lev.class);
                startActivity(intent);
            }
        });

//Rotate texviedw iconplay
        RotateAnimation rotate = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.rotateanimation);
        txticonplay1.setAnimation(rotate);
        RotateAnimation rotate2 = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.animate2);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        txticonmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);

            }
        });


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
