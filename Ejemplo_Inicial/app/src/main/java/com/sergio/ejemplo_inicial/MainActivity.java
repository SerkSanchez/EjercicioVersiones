package com.sergio.ejemplo_inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnInicial, btnInicialDos;
    TextView etiqueta;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acciones();
        instancias();

    }

    private void acciones()
    {
        btnInicial.setOnClickListener(this);
        btnInicialDos.setOnClickListener(this);
    }

    private void instancias()
    {
        btnInicial = this.findViewById(R.id.btnInicial);
        btnInicialDos = this.findViewById(R.id.btnInicialDos);
        etiqueta = findViewById(R.id.etiqueta);
    }

    public void mostrarToast(String mensaje)
    {
        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) //Lo que ha generado el evento
    {
        switch (view.getId())
        {
            case R.id.btnInicial:
                mostrarToast("boton1");
                etiqueta.setText("Botón 1 pulsado");
                break;
            case R.id.btnInicialDos:
                mostrarToast("boton2");
                etiqueta.setText("boton2 pulsado");
                break;
        }
    }
}
