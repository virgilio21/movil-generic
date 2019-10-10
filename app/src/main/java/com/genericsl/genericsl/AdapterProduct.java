package com.genericsl.genericsl;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<viewHolderProduct> implements View.OnClickListener{

    List<Product> ListaObjetos;
    private View.OnClickListener listener;

    public AdapterProduct(List<Product> listaObjetos) {
        ListaObjetos = listaObjetos;
    }

    @NonNull
    @Override
    public viewHolderProduct onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_product,viewGroup,false);
        vista.setOnClickListener(this);
        return new viewHolderProduct(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderProduct viewHolder, int position) {
        viewHolder.txtProduct.setText(ListaObjetos.get(position).getProduct());
        viewHolder.txtCompany.setText(ListaObjetos.get(position).getCompany());
        viewHolder.imageProduct.setImageResource(ListaObjetos.get(position).getImagen());
        viewHolder.txtPrice.setText("Precio: $"+ListaObjetos.get(position).getPrice());
        viewHolder.txtRanking.setText("Ranking: "+ListaObjetos.get(position).getRanking());
    }

    @Override
    public int getItemCount() {
        return ListaObjetos.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }
}
