package com.sergio.t3_spinner.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sergio.t3_spinner.R;
import com.sergio.t3_spinner.utils.Persona;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersoSpinner extends BaseAdapter {

    ArrayList listaDatos;
    Context context; //Permite que una clase no activity pueda recoger datos de los activity

    public AdaptadorPersoSpinner(ArrayList listaDatos, Context context) {
        //La lista que me pasa el MainActivity
        this.listaDatos = listaDatos;
        this.context = context;
    }

    //Cuenta las filas que tendrá el spinner
    @Override
    public int getCount() {
        return listaDatos.size();
    }

    //Retorna el elemento que está en una posición concreta (i)
    @Override
    public Object getItem(int i) {
        return listaDatos.get(i);
    }

    //Retorna el ID del elemento que está seleccionado en una posición concreta (i)
    @Override
    public long getItemId(int i) {
        return i;
    }

    //Retorna un objeto de tipo view(el aspecto relleno de cada una de las filas) (XML rellenado con los datos de la lista)
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.spinner_layout, parent, false);

        Persona persona = (Persona) listaDatos.get(i);

        TextView nombre = parent.findViewById(R.id.nombre_spinner);
        TextView apellido = parent.findViewById(R.id.apellido_spinner);

        nombre.setText(persona.getNombre());
        apellido.setText(persona.getApellido());

        return convertView;
    }
}
