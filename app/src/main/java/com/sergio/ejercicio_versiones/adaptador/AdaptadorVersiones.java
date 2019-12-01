package com.sergio.ejercicio_versiones.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import com.sergio.ejercicio_versiones.R;
import com.sergio.ejercicio_versiones.utils.Versiones;

public class AdaptadorVersiones extends BaseAdapter {

    List<Versiones> listaVersiones;
    Context context;

    public AdaptadorVersiones(List lista_marcas, Context context) {
        this.listaVersiones = lista_marcas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaVersiones.size();
    }

    @Override
    public Object getItem(int i) {
        return listaVersiones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {

        if (v == null){
            v = LayoutInflater.from(context).inflate(R.layout.listaversiones_layout, viewGroup,false);
        }
        Versiones marcaPosicion = listaVersiones.get(i);

        TextView nombre = v.findViewById(R.id.nombre_version);
        ImageView imagen = v.findViewById(R.id.image_version);

        nombre.setText(marcaPosicion.getNombre());
        imagen.setImageResource(marcaPosicion.getLogo());

        return v;
    }
}