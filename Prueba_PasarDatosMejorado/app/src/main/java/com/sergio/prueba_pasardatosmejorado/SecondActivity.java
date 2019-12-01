package com.sergio.prueba_pasardatosmejorado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.sergio.prueba_pasardatosmejorado.utils.Persona;

public class SecondActivity extends AppCompatActivity
{
    TextView ventana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        recuperarDatos();
    }

    private void recuperarDatos() {
        if(getIntent().getExtras() != null)
        {
            //String nombre = getIntent().getExtras().get(MainActivity.TAG_1).toString();
            //int telefono = Integer.valueOf(getIntent().getExtras().get(MainActivity.TAG_2).toString());
            Persona persona = (Persona) getIntent().getExtras().get(MainActivity.TAG_1);
            String saludo = String.format("%s %s % %d %s",
                    getResources().getString(R.string.app_enh),
                    persona.getNombre(),
                    getResources().getString(R.string.app_tlf),
                    persona.getTelefono(),
                    getResources().getString(R.string.app_prac));
            ventana.setText(saludo);
        }
    }

    private void instancias()
    {
        ventana = findViewById(R.id.btnPaso);
    }
}
