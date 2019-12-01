package com.sergio.pasarresultado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sergio.pasarresultado.utils.Persona;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText editResultado;
    Button botonResponder;
    final static String TAG_RES = "resultado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        acciones();
        recuperarDatos();
    }

    private void recuperarDatos()
    {
        if(getIntent().getExtras() != null) {
            Persona recuperada = (Persona) getIntent().getExtras().get(MainActivity.TAG_PERSO);
        }
    }

    private void acciones()
    {
        botonResponder.setOnClickListener(this);
    }

    private void instancias()
    {
        editResultado = findViewById(R.id.edit_contestar);
        botonResponder = findViewById(R.id.btnResultado);
    }

    @Override
    public void onClick(View v) {
        /*Intent intent = new Intent();
        intent.putExtra(TAG_RES, editResultado.getText().toString());
        setResult(MainActivity.RES_CODE);
        finish();*/

        if(editResultado.getText().toString().isEmpty())
        {
            setResult(MainActivity.RES_CODE_FAIL);
        }
        else
        {
            Intent intent = new Intent();
            intent.putExtra(TAG_RES, editResultado.getText().toString());
            setResult(MainActivity.RES_CODE_OK, intent);
        }
    }
}
