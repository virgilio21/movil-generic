package com.genericsl.genericsl;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHolderEnterprise extends RecyclerView.ViewHolder {


    TextView nameEnterprise, ubication, serviceDomicile;
    ImageView imageEnterprise;


    public viewHolderEnterprise(@NonNull View itemView) {
        super(itemView);
        nameEnterprise = (TextView) itemView.findViewById(R.id.textViewNameCompany);
        imageEnterprise = (ImageView) itemView.findViewById(R.id.pictureEnterprise);
        ubication = (TextView) itemView.findViewById(R.id.textViewValueCalle);
        serviceDomicile = (TextView) itemView.findViewById(R.id.textViewYesOrNo);


    }
}
