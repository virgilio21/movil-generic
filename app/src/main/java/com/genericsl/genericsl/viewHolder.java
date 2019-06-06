package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHolder extends RecyclerView.ViewHolder {



    TextView titulo, precio, ranking;
    ImageView imagen;


    public viewHolder(@NonNull View itemView) {
        super(itemView);
        titulo = (TextView) itemView.findViewById(R.id.titulo);
        precio = (TextView) itemView.findViewById(R.id.precio);
        ranking = (TextView) itemView.findViewById(R.id.ranking);
        imagen = (ImageView) itemView.findViewById(R.id.imagen);

    }
}
