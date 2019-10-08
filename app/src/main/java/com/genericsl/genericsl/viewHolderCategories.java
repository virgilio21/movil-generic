package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class viewHolderCategories extends RecyclerView.ViewHolder{


    TextView  title;
    ImageView imageTitle;



    public viewHolderCategories(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.categoryName);
        imageTitle = (ImageView) itemView.findViewById(R.id.imageCategory);
    }
}
