package com.sergio.examen1_17_10_2019_sergiosanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.sergio.examen1_17_10_2019_sergiosanchez.Utils.Operacion;

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

    private void recuperarDatos()
    {
        if(getIntent().getExtras() != null)
        {
            int oper1Recu = Integer.valueOf(getIntent().getExtras().get(MainActivity.texto2Recu).toString());
            Operacion op = (Operacion) getIntent().getExtras().get(MainActivity.oper1Recu);
                String operacion = String.format("%s %s %d,
                getResources().getString(R.string.app_txt),
                getResources().getString(R.string.app_oper),
                operacion.getOper();
                ventana.setText(operacion);
        }
    }

    private void instancias()
    {
        ventana = findViewById(R.id.btnVentana);
    }
}
