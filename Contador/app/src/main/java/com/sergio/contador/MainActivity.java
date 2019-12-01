package com.sergio.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textoContador;
    Button botonContador;
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instancias();
        acciones();
    }

    private void instancias()
    {
        botonContador = this.findViewById(R.id.btnSumar);
        textoContador = this.findViewById(R.id.textoContador);
    }

    private void acciones()
    {
        botonContador.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        contador++;
        textoContador.setText(String.valueOf(contador));
        if(contador==4)
        {
            Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.app_aviso), //Mensaje que se va a mostrar (se mostrará el mensaje del string
                    Toast.LENGTH_SHORT).show(); //Duración de la etiqueta de mensaje y se muestra.
        }
        else if(contador ==5)
        {
            finish();
        }
    }
}
