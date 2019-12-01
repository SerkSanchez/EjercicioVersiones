package com.sergio.examen_sergio_sanchez_15_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.sergio.examen_sergio_sanchez_15_11_2019.utils.Marcas;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Spinner spinnerHome;
    ImageView ventanaHome;
    Button agregarCoche;

    ArrayAdapter adaptadorMarcasHome;
    ArrayList listaMarcasHome;
    Marcas marcas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        instancias();
        recuperarMarca();
        acciones();
    }

    private void acciones() {
        agregarCoche.setOnClickListener(this);
        spinnerHome.setOnItemSelectedListener(this);
    }

    private void instancias() {
        spinnerHome = findViewById(R.id.spinner_home);
        ventanaHome = findViewById(R.id.ventana_logo);
        agregarCoche = findViewById(R.id.boton_addcoche);

        listaMarcasHome = new ArrayList();
        adaptadorMarcasHome = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaMarcasHome);
    }


    private void recuperarMarca()
    {
        if(!getIntent().getExtras().isEmpty())
        {
            marcas = (Marcas) getIntent().getExtras().get(String.valueOf(FormScreen.class));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton_addcoche:
                Intent iPasar = new Intent(getApplicationContext(), FormScreen.class);
                startActivity(iPasar);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}