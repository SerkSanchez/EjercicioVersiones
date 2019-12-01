package com.sergio.prueba_pasardatosmejorado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.sergio.prueba_pasardatosmejorado.utils.Persona;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button botonPaso;
    private EditText textoNom, textoNum;
    CheckBox checkCarnet;
    final static String TAG_1 = "nombre";
    final static String TAG_2 = "numero";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones()
    {
        botonPaso.setOnClickListener(this);
    }

    private void instancias()
    {
        botonPaso = findViewById(R.id.btnPaso);
        textoNom = findViewById(R.id.textoCapturaNombre);
        textoNum = findViewById(R.id.textoCapturaTelefono);
        checkCarnet = findViewById(R.id.checkCarnet);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnPaso:
                if (!textoNom.getText().toString().isEmpty() && textoNum.getText().toString().length() == 9)
                {
                    int telefonoRecu = Integer.valueOf(textoNum.getText().toString());
                    String nombreRecu = textoNom.getText().toString();
                    Intent iPasar = new Intent(getApplicationContext(), SecondActivity.class);
                    //iPasar.putExtra(TAG_1, nombreRecu);
                    //iPasar.putExtra(TAG_2, telefonoRecu);
                    //iPasar.putExtra("k3",checkCarnet.isChecked()); //Verdadero si esta checkeado, falso si no está checkeado
                    Persona p = new Persona(nombreRecu, telefonoRecu, checkCarnet.isChecked());
                    iPasar.putExtra(TAG_1, p);
                    startActivity(iPasar);
                }
                else
                {
                        Toast.makeText(getApplicationContext(), "Faltan cosas. Introduce datos", Toast.LENGTH_SHORT).show();
                }

        }
    }
}