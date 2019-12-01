package com.sergio.t3_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.TextView;

import com.sergio.t3_spinner.utils.Persona;

public class SecondActivity extends AppCompatActivity {

    TextView txtResultado;
    Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        recuperarPersona();
        anadirTexto();
    }

    private void anadirTexto()
    {
        txtResultado.setText(String.format("La persona pasada es: %s %s - %d - %b \n",
                persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.isDispo()));
    }

    private void instancias()
    {
        txtResultado = findViewById(R.id.txtResultado);
    }

    private void recuperarPersona()
    {
        if(!getIntent().getExtras().isEmpty())
        {
            persona = (Persona) getIntent().getExtras().get(MainActivity.TAG_1);
        }
    }
}
