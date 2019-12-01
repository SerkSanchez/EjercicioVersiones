package com.sergio.examen_sergio_sanchez_15_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.sergio.examen_sergio_sanchez_15_11_2019.utils.Marcas;

import java.util.ArrayList;

public class FormScreen extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Spinner spinnerMarcas;
    EditText textoModelo, textoCV;
    Button botonGenerarCoche, botonVolver;
    ArrayList listaMarcasForm;
    ArrayAdapter adaptadorMarcasForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_screen);
        instancias();
        acciones();
        agregarMarca();
    }

    private void agregarMarca() {
            listaMarcasForm.add(new Marcas(
                    (String) adaptadorMarcasForm.getItem(spinnerMarcas.getSelectedItemPosition()),
                    textoModelo.getText().toString(),
                    textoCV.getText().toString()));
            adaptadorMarcasForm.notifyDataSetChanged();
            spinnerMarcas.setAdapter(adaptadorMarcasForm);
    }

    private void acciones() {
        botonGenerarCoche.setOnClickListener(this);
        botonVolver.setOnClickListener(this);
        spinnerMarcas.setOnItemSelectedListener(this);

    }

    private void instancias() {
        textoModelo = findViewById(R.id.texto_modelo);
        textoCV = findViewById(R.id.texto_cv);
        botonGenerarCoche = findViewById(R.id.boton_generarcoche);
        botonVolver = findViewById(R.id.boton_volver);
        spinnerMarcas = findViewById(R.id.spinner_marca);
        listaMarcasForm = new ArrayList();
        adaptadorMarcasForm = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaMarcasForm);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton_volver:
                Intent iVolver = new Intent(getApplicationContext(), HomeScreen.class);
                //iVolver.putExtra();
                startActivity(iVolver);
                break;
            case R.id.boton_generarcoche:
                Intent iAgregar = new Intent(getApplicationContext(), HomeScreen.class);
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
