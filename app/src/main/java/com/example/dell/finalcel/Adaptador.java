package com.example.dell.finalcel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Pelicula> lista;

    public Adaptador(Context contexto, List<Pelicula> lista) {
        this.contexto = contexto;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflar_vistas = LayoutInflater.from(contexto);
        view = inflar_vistas.inflate(R.layout.list_item_view, null);

        ImageView imagen = view.findViewById(R.id.imgPelicula);
        TextView txv1,txv2,txv3;
        txv1 = view.findViewById(R.id.edtTitulo);
        txv2 = view.findViewById(R.id.edtGenero);
        txv3 = view.findViewById(R.id.edtDuracion);

        txv1.setText(lista.get(position).getTitulo().toString());
        txv2.setText(lista.get(position).getGenero());
        txv3.setText( "Año: " + String.valueOf(lista.get(position).getAño()) +"\nDuracion: " + String.valueOf(lista.get(position).getDuracion()) + " minutos");
        imagen.setImageResource(lista.get(position).getImagen());

        return view;



    }


}
