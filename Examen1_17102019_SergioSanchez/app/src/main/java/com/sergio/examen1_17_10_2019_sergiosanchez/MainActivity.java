package com.sergio.examen1_17_10_2019_sergiosanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.sergio.examen1_17_10_2019_sergiosanchez.Utils.Operacion;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button botonMas, botonMenos, botonMulti, botonDiv, botonPantalla;
    private EditText oper1, oper2;
    CheckBox checkBox;
    String reserva, operador;
    int numeroRecu;
    final static String TEX = "texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() //ESCUCHADORES
    {
        botonMas.setOnClickListener(this);
        botonMenos.setOnClickListener(this);
        botonMulti.setOnClickListener(this);
        botonDiv.setOnClickListener(this);

        botonPantalla.setOnClickListener(this);
    }

    private void instancias() //ENCONTRAR ID
    {
        botonMas = findViewById(R.id.btn1);
        botonMenos = findViewById(R.id.btn2);
        botonMulti = findViewById(R.id.btn3);
        botonDiv = findViewById(R.id.btn4);
        botonPantalla = findViewById(R.id.btnVentana);

        oper1 = findViewById(R.id.textoOper1);
        oper2 = findViewById(R.id.textoOper2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                reserva = oper1.getText().toString();
                operador = "+";
                break;
            case R.id.btn2:
                reserva = oper1.getText().toString();
                operador = "-";
                break;
            case R.id.btn3:
                reserva = oper1.getText().toString();
                operador = "*";
                break;
            case R.id.btn4:
                reserva = oper1.getText().toString();
                operador = "/";
                break;
            case R.id.btnVentana:
                if (!oper1.getText().toString().isEmpty() || !oper1.getText().toString().isEmpty()) {
                    int s = Integer.valueOf(oper1.getText().toString());

                    Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                    Operacion op = new Operacion(oper1, oper2, checkBox.isChecked());
                    i.putExtra(operador, op);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Faltan datos. Introduce datos", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
