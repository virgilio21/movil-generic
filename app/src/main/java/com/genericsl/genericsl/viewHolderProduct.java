package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHolderProduct extends RecyclerView.ViewHolder {


    TextView txtProduct, txtPrice, txtRanking, txtCompany;
    ImageView imageProduct;



    public viewHolderProduct(@NonNull View itemView) {
        super(itemView);
        txtProduct = (TextView) itemView.findViewById(R.id.txtProductName);
        txtCompany = (TextView) itemView.findViewById(R.id.txtCompanyName);
        txtPrice = (TextView) itemView.findViewById(R.id.txtPriceProduct);
        txtRanking = (TextView) itemView.findViewById(R.id.txtRankingProduct);
        imageProduct = (ImageView) itemView.findViewById(R.id.imageViewProduct);


    }
}