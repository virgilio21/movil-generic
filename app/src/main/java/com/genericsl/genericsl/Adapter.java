package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<viewHolder> implements View.OnClickListener{

    List<Source> ListaObjetos;
    private View.OnClickListener listener;

    public Adapter(List<Source> listaObjetos) {
        ListaObjetos = listaObjetos;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item,viewGroup,false);
        vista.setOnClickListener(this);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int position) {
        viewHolder.titulo.setText(ListaObjetos.get(position).getCompany()+" - "+ListaObjetos.get(position).getProduct());
        viewHolder.imagen.setImageResource(ListaObjetos.get(position).getImagen());
        viewHolder.precio.setText("Precio: $"+ListaObjetos.get(position).getPrice());
        viewHolder.ranking.setText("Ranking: "+ListaObjetos.get(position).getRanking());
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
