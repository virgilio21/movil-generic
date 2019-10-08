package com.genericsl.genericsl;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdapterEnterprise extends RecyclerView.Adapter<viewHolderEnterprise> {

    List<Enterprise> ListaEnterprise;
    private View.OnClickListener listener;

    public AdapterEnterprise(ArrayList<Enterprise> lista) {

        this.ListaEnterprise = lista;
    }


    @NonNull
    @Override
    public viewHolderEnterprise onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_company,viewGroup,false);
        return new viewHolderEnterprise(vista);
    }



    @Override
    public void onBindViewHolder(@NonNull viewHolderEnterprise viewHolderEnterprise, int i) {
        viewHolderEnterprise.nameEnterprise.setText(ListaEnterprise.get(i).getName());
        viewHolderEnterprise.serviceDomicile.setText(ListaEnterprise.get(i).getServiceDomicile());
        viewHolderEnterprise.ubication.setText(ListaEnterprise.get(i).getUbication());
        viewHolderEnterprise.imageEnterprise.setImageResource(ListaEnterprise.get(i).getImageEnterprise());
    }

    @Override
    public int getItemCount() {
        return ListaEnterprise.size();
    }
}
