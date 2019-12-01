package com.sergio.ejercicio_listas;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lista;
    ArrayList listaMarcas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.alvaro.t04_listas.R.layout.activity_second);
        instancias();
        acciones();
    }

    private void acciones(){

    }

    private void instancias() {
        lista = findViewById(com.alvaro.t04_listas.R.id.listID);
        listaMarcas = new ArrayList();
    }

    @Override
    public void onClick(View v) {

    }
}
