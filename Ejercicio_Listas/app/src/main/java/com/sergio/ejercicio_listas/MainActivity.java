package com.sergio.ejercicio_listas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLista, btnRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.alvaro.t04_listas.R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btnLista.setOnClickListener(this);
        btnRecycler.setOnClickListener(this);
    }

    private void instancias() {
        btnLista = findViewById(com.alvaro.t04_listas.R.id.boton_lista);
        btnRecycler = findViewById(com.alvaro.t04_listas.R.id.boton_recycler);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case com.alvaro.t04_listas.R.id.boton_lista:

                Intent i = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(i);
                break;
        }
    }
}
