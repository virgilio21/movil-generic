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

public class OrderFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View fragment = inflater.inflate(R.layout.fragment_order,container,false);
        final ArrayList<Order> lista = new ArrayList<Order>();




        final RecyclerView contenedor = (RecyclerView) fragment.findViewById(R.id.reclycerOrder);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        contenedor.setLayoutManager(layoutManager);


        lista.add(new Order("Chetos torciditos 100gr", "Barcel", R.drawable.cheetos, 24, 10, 240));
        lista.add(new Order("Chetos torciditos 100gr", "Barcel", R.drawable.cheetos, 24, 10, 240));
        lista.add(new Order("Chetos torciditos 100gr", "Barcel", R.drawable.cheetos, 24, 10, 240));
        lista.add(new Order("Chetos torciditos 100gr", "Barcel", R.drawable.cheetos, 24, 10, 240));





        //contenedor.setHasFixedSize(true);




        AdapterOrders adapter = new AdapterOrders(lista);
        contenedor.setAdapter(adapter);

        return fragment;
    }
}
