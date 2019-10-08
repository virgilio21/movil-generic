package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class viewHolderOrders extends RecyclerView.ViewHolder {

    TextView title, priceForUnit, priceTotal, nameCompany, amount;
    ImageView imageProduct;


    public viewHolderOrders(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.nameProduct);
        imageProduct = (ImageView) itemView.findViewById(R.id.pictureProduct);
        nameCompany = (TextView) itemView.findViewById(R.id.nameCompany);
        priceForUnit = (TextView) itemView.findViewById(R.id.priceProduct);
        priceTotal = (TextView) itemView.findViewById(R.id.priceTotalProduct);
        amount = (TextView) itemView.findViewById(R.id.amountProduct);


    }
}
