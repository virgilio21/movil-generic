package com.genericsl.genericsl;


import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    FloatingActionButton btnCarrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        btnCarrito = (FloatingActionButton) findViewById(R.id.btnCarrito);
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intencion = new Intent(getApplicationContext(),Carrito.class);
               // startActivity(intencion);
                Toast.makeText(getApplicationContext(),"Si funciona",Toast.LENGTH_SHORT).show();
                Intent intecion = new Intent(getApplicationContext(),CarActivity.class);
                startActivity(intecion);
            }
        });






        final ArrayList<Fuente> lista = new ArrayList<Fuente>();
        lista.add(new Fuente("Goku Super Saiyajin",R.drawable.p1,500.0f, 5.0f));
        lista.add(new Fuente("Gohan Mistico",R.drawable.p2,50.0f, 1.0f));
        lista.add(new Fuente("Vegueta",R.drawable.p3,100.0f, 2.0f));
        lista.add(new Fuente("Piccoro",R.drawable.p4,250.0f, 3.0f));
        lista.add(new Fuente("Yamcha",R.drawable.p5,320.0f, 4.0f));
        lista.add(new Fuente("Maestro Roshi",R.drawable.p6,100.0f, 5.0f));
        lista.add(new Fuente("Bills",R.drawable.p7,220.0f, 6.0f));

        final RecyclerView contenedor = (RecyclerView) findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);

        Adaptador adapter = new Adaptador(lista);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Seleccionado el item: "+lista.get(contenedor.getChildAdapterPosition(v)).getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });

        contenedor.setAdapter(adapter);
        contenedor.setLayoutManager(layout);
    }
}
