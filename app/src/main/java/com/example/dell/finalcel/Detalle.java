package com.example.dell.finalcel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tv1= findViewById(R.id.edtTituloDetalle);
        tv2= findViewById(R.id.edtPrecioDetalle);
        tv3= findViewById(R.id.edtDescripcionDetalle);
        tv4=findViewById(R.id.edtAñoDetalle);
        tv5= findViewById(R.id.edtGeneroDetalle);
        tv6=findViewById(R.id.edtDuracionDetalle);
        img = findViewById(R.id.imgProductoDetalle);

        Pelicula p = (Pelicula) getIntent().getExtras().getSerializable("objeto");
        img.setImageResource(p.getImagen());
        tv1.setText(p.getTitulo());
        tv2.setText ("Precio: "+ String.valueOf(p.getPrecio()));
        tv3.setText("Sinopsis: " +"\n" +  p.getSinopsis());
        tv4.setText("Año: " + String.valueOf(p.getAño()));
        tv5.setText("Genero: " + p.getGenero());
        tv6.setText("Duracion: " + String.valueOf(p.getDuracion()) + " minutos");
    }

}
