package com.sergio.repasoexamen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button botonArrancar;
    final static int TAG_REQ_CODE = 0;
    final static int TAG_RES_CODE_OK = 0;
    final static int TAG_RES_CODE_FAIL = 1;
    String dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        botonArrancar.setOnClickListener(this);
    }

    private void instancias() {
        botonArrancar = findViewById(R.id.boton_arrancar);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        startActivityForResult(i, TAG_REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TAG_RES_CODE_OK){
            dato = (String) data.getExtras().get(SecondActivity.TAG_EXTRA);
        }else if(requestCode == TAG_RES_CODE_FAIL){
            //String dato = (String) data.getExtras().get(SecondActivity.TAG_EXTRA);
            dato = "Sin respuessta";
        }
    }
}
