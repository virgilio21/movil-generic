package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdapterOrders extends RecyclerView.Adapter<viewHolderOrders>{

    List<Order> ListaOrdenes;
    private View.OnClickListener listener;

    public AdapterOrders(ArrayList<Order> lista) {

        this.ListaOrdenes = lista;
    }


    @NonNull
    @Override
    public viewHolderOrders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_orders_shopping,viewGroup,false);
        return new viewHolderOrders(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderOrders viewHolderOrders, int position) {
        viewHolderOrders.title.setText(ListaOrdenes.get(position).getTitle());
        viewHolderOrders.nameCompany.setText(ListaOrdenes.get(position).getNameCompany());
        viewHolderOrders.amount.setText(ListaOrdenes.get(position).getAmount()+"");
        viewHolderOrders.priceForUnit.setText("$"+ListaOrdenes.get(position).getPriceForUnit()+"");
        viewHolderOrders.priceTotal.setText("$"+ListaOrdenes.get(position).getPriceTotal()+"");
        viewHolderOrders.imageProduct.setImageResource(ListaOrdenes.get(position).getImageProduct());
    }

    @Override
    public int getItemCount() {

        return ListaOrdenes.size();
    }


}

