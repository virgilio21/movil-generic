package com.genericsl.genericsl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

        final ArrayList<Source> lista = new ArrayList<Source>();
        lista.add(new Source("Goku Super Saiyajin","hola",5.0f, 1.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 2","hola 2",50.0f, 2.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 3","hola 3",500.0f, 3.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 4","hola 4",5000.0f, 4.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 5","hola 5",4000.0f, 5.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 6","hola 6",400.0f, 6.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 7","hola 7",40.0f, 7.0f,R.drawable.p1));
        lista.add(new Source("Goku Super Saiyajin 8","hola 8",4.0f, 8.0f,R.drawable.p1));

        final RecyclerView contenedor = (RecyclerView) fragment.findViewById(R.id.contenedor);
        contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(fragment.getContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);

        Adapter adapter = new Adapter(lista);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(fragment.getContext(),"Seleccionado el item: "+lista.get(contenedor.getChildAdapterPosition(v)).getCompany()+
                                lista.get(contenedor.getChildAdapterPosition(v)).getPrice()+lista.get(contenedor.getChildAdapterPosition(v)).getRanking()
                        ,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getContext(),ProductDetailActivity.class);
                startActivity(intent);



            }
        });

        contenedor.setAdapter(adapter);
        contenedor.setLayoutManager(layout);

        return fragment;
    }
}
