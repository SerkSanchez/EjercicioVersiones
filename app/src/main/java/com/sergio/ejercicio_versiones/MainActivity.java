package com.sergio.ejercicio_versiones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sergio.ejercicio_versiones.adaptador.AdaptadorVersiones;
import com.sergio.ejercicio_versiones.utils.Versiones;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista_versiones;
    ArrayList array_versiones;
    AdaptadorVersiones adaptador_versiones;
    final static String TAG_1="Object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarVersion();
        acciones();
    }

    private void rellenarVersion(){
        lista_versiones.setAdapter(adaptador_versiones);

        array_versiones.add(new Versiones("Beta", getResources().getString(R.string.Beta),
                R.drawable.beta, R.drawable.beta, 120, 2005));
        array_versiones.add(new Versiones("Cupcake", getResources().getString(R.string.Cupcake),
                R.drawable.cupcake,R.drawable.cupcake_det,150,2008));
        array_versiones.add(new Versiones("Donut", getResources().getString(R.string.Donut),
                R.drawable.donut,R.drawable.donut_det,201,2010));
        array_versiones.add(new Versiones("Eclair", getResources().getString(R.string.Eclair),
                R.drawable.eclair,R.drawable.eclair_det,245,2012));
        array_versiones.add(new Versiones("Froyo", getResources().getString(R.string.Froyo),
                R.drawable.froyo,R.drawable.froyo_det,575,2014));
        array_versiones.add(new Versiones("GinGer Bread", getResources().getString(R.string.GinGer_Bread),
                R.drawable.gingerbread,R.drawable.gige_det,320,2015));
        array_versiones.add(new Versiones("Honey Comb", getResources().getString(R.string.Honey_Comb),
                R.drawable.honeycomb,R.drawable.honey_det,380,2016));
        array_versiones.add(new Versiones("Ice Cream", getResources().getString(R.string.Ice_Cream),
                R.drawable.icecream,R.drawable.ice_det,425,2017));
        array_versiones.add(new Versiones("Jelly Bean", getResources().getString(R.string.Jelly_Bean),
                R.drawable.jelly_bean,R.drawable.jelly_det,463,2018));
        array_versiones.add(new Versiones("KitKat", getResources().getString(R.string.KitKat),
                R.drawable.kitkat,R.drawable.kit_det,503,2019));

        adaptador_versiones.notifyDataSetChanged();
    }

    private void instancias() {
        lista_versiones = findViewById(R.id.lista_versiones);
        array_versiones = new ArrayList();
        adaptador_versiones = new AdaptadorVersiones(array_versiones, getApplicationContext());
    }

    private void acciones() {
        lista_versiones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.lista_versiones:
                Intent i1 = new Intent(getApplicationContext(), DetalleActivity.class);
                i1.putExtra(TAG_1, (Versiones)adaptador_versiones.getItem(position));
                startActivity(i1);
                break;
        }
    }
}
