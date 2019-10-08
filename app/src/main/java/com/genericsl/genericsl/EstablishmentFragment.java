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

public class EstablishmentFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View fragment = inflater.inflate(R.layout.fragment_establishment,container,false);
        final ArrayList<Enterprise> lista = new ArrayList<Enterprise>();

        final RecyclerView contenedor = (RecyclerView) fragment.findViewById(R.id.recycleEnterprise);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setLayoutManager(layoutManager);

        lista.add(new Enterprise("Farmacias del vazar", R.drawable.compan_ias_de_gas_natural, "Si", "Calle 13 x 17 y 20"));
        lista.add(new Enterprise("Farmacias del vazar", R.drawable.compan_ias_de_gas_natural, "Si", "Calle 13 x 17 y 20"));
        lista.add(new Enterprise("Farmacias del vazar", R.drawable.compan_ias_de_gas_natural, "Si", "Calle 13 x 17 y 20"));
        lista.add(new Enterprise("Farmacias del vazar", R.drawable.compan_ias_de_gas_natural, "Si", "Calle 13 x 17 y 20"));
        lista.add(new Enterprise("Farmacias del vazar", R.drawable.compan_ias_de_gas_natural, "Si", "Calle 13 x 17 y 20"));

        AdapterEnterprise adapter = new AdapterEnterprise(lista);
        contenedor.setAdapter(adapter);

        return fragment;
    }
}
