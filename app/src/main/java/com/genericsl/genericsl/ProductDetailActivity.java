package com.genericsl.genericsl;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailActivity extends AppCompatActivity {
    TextView nombreD, precioD, rankingD;
    ImageView fotoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        nombreD = (TextView)findViewById(R.id.nombreD);
        precioD = (TextView)findViewById(R.id.precioD);
        rankingD = (TextView)findViewById(R.id.rankingD);
        fotoD = (ImageView)findViewById(R.id.fotoD);



       /* Bundle extras = getIntent().getExtras();
        String nom = extras.getString("nom");
        float pre= extras.getFloat("pre");
        float ran = extras.getFloat("ran");
        int txtFotoD = extras.getInt("txtFotoD");*/




        nombreD.setText("Empresa");
        precioD.setText("Precio: ");
        rankingD.setText("Ranking: ");
        fotoD.setImageResource(R.drawable.p1);


    }
}
