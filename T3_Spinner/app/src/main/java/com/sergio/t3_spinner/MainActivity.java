package com.sergio.t3_spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.sergio.t3_spinner.adaptadores.AdaptadorPersoSpinner;
import com.sergio.t3_spinner.utils.Persona;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /*Spinner spinnerNormal;
    ArrayAdapter adaptadorSpinner;
    //AraryAdapter es un Modelo de datos. Usar siempre que hay un spinner.
    ArrayList listaDatos;
    Button botonElemento;*/

    EditText etiquetaNombre, etiquetaApellido;
    Spinner spinnerEdad, spinnerResultado;
    Button botonAdd, botonEnviar;
    CheckBox checkDispo;
    ArrayAdapter adaptadorPersonas, adaptadorEdad;
    ArrayList listaEdades;
    ArrayList listaPersonas;
    final static String TAG_1 = "persona";
    AdaptadorPersoSpinner adaptadorPersoSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarSpinner(); //Asociar adaptador con spinner (Modelo de datos con modelo gráfico)
        agregarPersona();
        acciones();
    }

    private void acciones()
    {
        //botonElemento.setOnClickListener(this);
        botonAdd.setOnClickListener(this);
        spinnerResultado.setOnItemSelectedListener(this);
    }

    private void rellenarSpinner()
    {
        for (int i=0; i<100; i++)
        {
            listaEdades.add(i);
            adaptadorEdad.notifyDataSetChanged(); //Señal de que los datos han cambiado.
        }
        spinnerEdad.setAdapter(adaptadorEdad);
    }

    private void agregarPersona()
    {
        listaPersonas.add(new Persona(
                etiquetaNombre.getText().toString(),
                etiquetaApellido.getText().toString(),
                (int) adaptadorEdad.getItem(spinnerEdad.getSelectedItemPosition()),
                checkDispo.isChecked()));
        adaptadorPersonas.notifyDataSetChanged();
        spinnerResultado.setAdapter(adaptadorPersoSpinner);
    }

    private void instancias()
    {
        /*spinnerNormal = this.findViewById(R.id.spinner_normal);
        listaDatos = new ArrayList();
        botonElemento = this.findViewById(R.id.botonElemento);
        adaptadorSpinner = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaDatos);
        //AraryAdapter tiene 3 parametros: CONTEXTO(getAplicationContext), VISTA(como aparece cada fila)(android R.layout.simple_spinner_item.xml) y DATOS(ArrayList).*/
        listaEdades = new ArrayList();
        listaPersonas = new ArrayList();
        etiquetaNombre = this.findViewById(R.id.etiquetaNombre);
        etiquetaApellido = this.findViewById(R.id.etiquetaApellido);
        spinnerEdad = this.findViewById(R.id.spinner_Edad);
        checkDispo = this.findViewById(R.id.check_dispo);
        botonAdd = this.findViewById(R.id.btnAdd);
        botonEnviar = this.findViewById(R.id.btnEnviar);
        spinnerResultado = this.findViewById(R.id.spinner_resultado);
        spinnerEdad = this.findViewById(R.id.spinner_resultado);
        adaptadorEdad = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaEdades);
        adaptadorPersonas = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaPersonas);
        adaptadorPersoSpinner = new AdaptadorPersoSpinner(listaPersonas, getApplicationContext());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnAdd:
                agregarPersona();
                break;
            case R.id.btnEnviar:
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(TAG_1, (Persona) adaptadorPersonas.getItem(spinnerResultado.getSelectedItemPosition()));
                startActivity(intent);
            /*case R.id.botonElemento:
                int elementoSeleccionado = (int) adaptadorSpinner.getItem(spinnerNormal.getSelectedItemPosition());
                Toast.makeText(getApplicationContext(), String.valueOf(elementoSeleccionado), Toast.LENGTH_SHORT).show();
                break;*/
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id)
    {
        Persona seleccionada = (Persona) adaptadorPersonas.getItem(i);
        Toast.makeText(getApplicationContext(), adaptadorPersonas.getItem(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
