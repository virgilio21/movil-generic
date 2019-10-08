package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdapterCategories extends RecyclerView.Adapter<viewHolderCategories>{

    List<Categories> listCategories;
    private View.OnClickListener listener;

    public AdapterCategories(List<Categories> listCategories) {
        this.listCategories = listCategories;
    }



    @NonNull
    @Override
    public viewHolderCategories onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_categories,viewGroup,false);
        return new viewHolderCategories(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderCategories viewHolderCategories, int i) {

        viewHolderCategories.title.setText(listCategories.get(i).getTitle());
        viewHolderCategories.imageTitle.setImageResource(listCategories.get(i).getImageCategories());

    }

    @Override
    public int getItemCount() {
        return listCategories.size();
    }
}
