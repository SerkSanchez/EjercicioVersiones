package com.sergio.pruebas_checkocultar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View {

    Button botonuno, boton2, boton3, boton4;
    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();

        if (getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            accionesLand();
        }

    }



    private void instancias() {
        botonuno = findViewById(R.id.boton1);
        checkBox = findViewById(R.id.checkboxActivar);
    }

    private void accionesLand() {
        botonTres.
    }

    private void acciones(){
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (compoundButton.getId()) {
                    case R.id.checkboxActivar:

                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}