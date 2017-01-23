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
    TextView txtIconPlay1;
    TextView txtIconPlay2;
    TextView txtIconPlay4;
    TextView txtIconSetting;
    TextView txtIconUser;
    TextView txtIconPlay;
    TextView playGameBg;
    TextView txtIconMenu;
    TextView txtIconMenuBg;
    TextView txtIconSquare;
    TextView txtIconPlus;
    TextView txtIconStar;
    TextView txtStarBg;
    TextView txtUserPlus;
    TextView txtPlusBg;
    TextView txtSq2;
    TextView txtSq3;
    TextView userPlusbg;
    TextView txtSq2Bg;
    TextView txtSq3Bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        //UI mainpage
        //iconplay haman mosalasha hastan
        font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        txtIconPlay1 = (TextView) findViewById(R.id.txticonplay1);
        txtIconPlay1.setTypeface(font);
        txtIconPlay2 = (TextView) findViewById(R.id.txticonplay2);
        txtIconPlay2.setTypeface(font);
        txtIconPlay4 = (TextView) findViewById(R.id.iconplay4);
        txtIconPlay4.setTypeface(font);
        txtIconSetting = (TextView) findViewById(R.id.txtIconSetting);
        txtIconSetting.setTypeface(font);
        txtIconUser = (TextView) findViewById(R.id.txtIconUser);
        txtIconUser.setTypeface(font);
        txtIconPlay = (TextView) findViewById(R.id.txtIconPlay);
        txtIconPlay.setTypeface(font);
        playGameBg = (TextView) findViewById(R.id.txtIconPlaybg);
        playGameBg.setTypeface(font);
        txtIconMenu = (TextView) findViewById(R.id.txtIconMenu);
        txtIconMenu.setTypeface(font);
        txtIconMenuBg = (TextView) findViewById(R.id.txtIconMenubg);
        txtIconMenuBg.setTypeface(font);
        txtIconSquare = (TextView) findViewById(R.id.txtsquare);
        txtIconSquare.setTypeface(font);
        txtIconPlus = (TextView) findViewById(R.id.txtplus);
        txtIconPlus.setTypeface(font);
        txtIconStar = (TextView) findViewById(R.id.txtstar);
        txtIconStar.setTypeface(font);
        txtStarBg = (TextView) findViewById(R.id.txtstarbg);
        txtStarBg.setTypeface(font);
        txtUserPlus = (TextView) findViewById(R.id.txtUserPlus);
        txtUserPlus.setTypeface(font);
        txtPlusBg = (TextView) findViewById(R.id.txtplusbg);
        txtPlusBg.setTypeface(font);
        txtSq2 = (TextView) findViewById(R.id.txtsquare2);
        txtSq2.setTypeface(font);
        txtSq3 = (TextView) findViewById(R.id.txtsquare3);
        txtSq3.setTypeface(font);
        userPlusbg = (TextView) findViewById(R.id.txtUserPlusbg);
        userPlusbg.setTypeface(font);
        //sq=square baraye background icon estfade shode
        txtSq2Bg = (TextView) findViewById(R.id.txtsquare2bg);
        txtSq2Bg.setTypeface(font);
        txtSq3Bg = (TextView) findViewById(R.id.txtsquare3bg);
        txtSq3Bg.setTypeface(font);
        //Go to Level Activity
        txtIconSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationDrawer.this, com.myapp.mehrnaz.appapp.Lev.class);
                startActivity(intent);
            }
        });
        //Go to Level Activity
        txtIconUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavigationDrawer.this, com.myapp.mehrnaz.appapp.Lev.class);
                startActivity(intent);
            }
        });

//Rotate texviedw iconplay
        RotateAnimation rotate = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.rotateanimation);
        txtIconPlay1.setAnimation(rotate);
        RotateAnimation rotate2 = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.animate2);


        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        txtIconMenu.setOnClickListener(new View.OnClickListener() {
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
