package com.genericsl.genericsl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailFragment extends Fragment {

    TextView empresaD, precioD, rankingD, productoD;
    ImageView fotoD;
    Bundle extras;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View fragment = inflater.inflate(R.layout.activity_product_detail,container,false);

        empresaD = fragment.findViewById(R.id.empresaD);
        productoD = fragment.findViewById(R.id.productoD);
        precioD = fragment.findViewById(R.id.precioD);
        rankingD = fragment.findViewById(R.id.rankingD);
        fotoD = fragment.findViewById(R.id.fotoD);

        Bundle bundle = this.getArguments();
        String empresa = bundle.getString("empresa");
        String producto = bundle.getString("producto");
        float precio = bundle.getFloat("precio");
        float ranking = bundle.getFloat("ranking");
        int imagen = bundle.getInt("imagen");


        empresaD.setText("Empresa: "+ empresa);
        productoD.setText("Producto: " + producto);
        precioD.setText("Precio: " + precio);
        rankingD.setText("Ranking: "+ ranking);
        fotoD.setImageResource(imagen);

        return  fragment;
    }
}