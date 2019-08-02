package com.genericsl.genericsl;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle togle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(togle);
        togle.syncState();


        if(savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
           // navigationView.setCheckedItem(R.id.nav_producto);
        }


        FloatingActionButton btnCar = (FloatingActionButton) findViewById(R.id.btnCarrito);
        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Si funciona",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int item = menuItem.getItemId();

        switch (item){
            case R.id.nav_producto:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ProductFragment()).commit();
                break;

            case R.id.nav_categoria:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CategoryFragment()).commit();
                break;

            case R.id.nav_establecimiento:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EstablishmentFragment()).commit();
                break;

            case R.id.nav_pedido:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new OrderFragment()).commit();
                break;

            case R.id.nav_configuracion:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ConfigurationFragment()).commit();
                break;


            case R.id.nav_help:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HelpFragment()).commit();
                break;
        }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
