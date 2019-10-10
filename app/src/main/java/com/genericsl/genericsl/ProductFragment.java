package com.genericsl.genericsl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductFragment extends Fragment {


    private Button btnSiguiente;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View fragment = inflater.inflate(R.layout.fragment_product,container,false);

        final ArrayList<Product> lista = new ArrayList<Product>();
        lista.add(new Product("Sabritas","Doritos 40g",11, 5,R.drawable.doritos));
        lista.add(new Product("Barcel","Takis 60g",11, 6,R.drawable.takis));


        final RecyclerView contenedor = (RecyclerView) fragment.findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(fragment.getContext());
        layout.setOrientation(LinearLayoutManager.HORIZONTAL);

        AdapterProduct adapter = new AdapterProduct(lista);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fragment.getContext(),"Seleccionado el item: "+lista.get(contenedor.getChildAdapterPosition(v)).getCompany()+
                                lista.get(contenedor.getChildAdapterPosition(v)).getPrice()+lista.get(contenedor.getChildAdapterPosition(v)).getRanking()
                        ,Toast.LENGTH_SHORT).show();

                ProductDetailFragment nuevo = new ProductDetailFragment();
                Bundle bundle = new Bundle();

                //pasar datos de un fragment a otro
                bundle.putString("empresa",lista.get(contenedor.getChildAdapterPosition(v)).getCompany());
                bundle.putString("producto",lista.get(contenedor.getChildAdapterPosition(v)).getProduct());
                bundle.putFloat("precio",lista.get(contenedor.getChildAdapterPosition(v)).getPrice());
                bundle.putFloat("ranking",lista.get(contenedor.getChildAdapterPosition(v)).getRanking());
                bundle.putInt("imagen",lista.get(contenedor.getChildAdapterPosition(v)).getImagen());
                nuevo.setArguments(bundle);


                // Abrir el otro fragmente
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, nuevo);
                transaction.addToBackStack(null);
                transaction.commit();


            }
        });


        FloatingActionButton btnCar = (FloatingActionButton) fragment.findViewById(R.id.btnCarrito);
        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Si funciona",Toast.LENGTH_SHORT).show();
            }
        });


        contenedor.setAdapter(adapter);
        contenedor.setLayoutManager(layout);

        return fragment;
    }
}