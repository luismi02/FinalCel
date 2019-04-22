package com.example.dell.finalcel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.dell.finalcel.fragmentos.accion;
import com.example.dell.finalcel.fragmentos.comedia;
import com.example.dell.finalcel.fragmentos.drama;
import com.example.dell.finalcel.fragmentos.infantil;
import com.example.dell.finalcel.fragmentos.terror;
import com.example.dell.finalcel.interfaces.IFragments;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,IFragments {

    CarouselPicker carouselPicker;
    Button btnEst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        carouselPicker = (CarouselPicker)findViewById(R.id.carousel);
        btnEst =(Button)findViewById(R.id.btnEstrenos);

        List <CarouselPicker.PickerItem> itemImg= new ArrayList<>();
        itemImg.add(new CarouselPicker.DrawableItem(R.drawable.palomitas));
        itemImg.add(new CarouselPicker.DrawableItem(R.drawable.camara));
        itemImg.add(new CarouselPicker.DrawableItem(R.drawable.movie));
        itemImg.add(new CarouselPicker.DrawableItem(R.drawable.cola));
        itemImg.add(new CarouselPicker.DrawableItem(R.drawable.hotdog));
        CarouselPicker.CarouselViewAdapter imageAdapter = new CarouselPicker.CarouselViewAdapter(this,itemImg,0);
        carouselPicker.setAdapter(imageAdapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Estrenos.class);
                startActivity(i);
            }
        });
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

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment mifragmento = null;
        boolean fragmentoSeleccionado = false;

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            mifragmento = new accion();
            fragmentoSeleccionado = true;

        } else if (id == R.id.nav_gallery) {
            mifragmento = new comedia();
            fragmentoSeleccionado = true;
        } else if (id == R.id.nav_slideshow) {
            mifragmento = new infantil();
            fragmentoSeleccionado = true;
        } else if (id == R.id.nav_manage) {
            mifragmento = new drama();
            fragmentoSeleccionado = true;
        } else if (id == R.id.nav_terror) {
            mifragmento = new terror();
            fragmentoSeleccionado = true;
        }
        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        if(fragmentoSeleccionado)
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,mifragmento).commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
