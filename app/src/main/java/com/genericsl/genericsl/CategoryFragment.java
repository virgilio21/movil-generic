package com.genericsl.genericsl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Locale;

public class CategoryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        final View fragment = inflater.inflate(R.layout.fragment_category,container,false);
        final ArrayList<Categories> lista = new ArrayList<Categories>();

        final RecyclerView contenedor = (RecyclerView) fragment.findViewById(R.id.recycleCategories);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setLayoutManager(layoutManager);


        lista.add( new Categories("Comida Rapida", R.drawable.tmg_article_default_mobile));
        lista.add( new Categories("Comida Rapida", R.drawable.tmg_article_default_mobile));
        lista.add( new Categories("Comida Rapida", R.drawable.tmg_article_default_mobile));
        lista.add( new Categories("Comida Rapida", R.drawable.tmg_article_default_mobile));
        lista.add( new Categories("Comida Rapida", R.drawable.tmg_article_default_mobile));



        AdapterCategories adapter = new AdapterCategories(lista);
        contenedor.setAdapter(adapter);

        return fragment;

    }
}
