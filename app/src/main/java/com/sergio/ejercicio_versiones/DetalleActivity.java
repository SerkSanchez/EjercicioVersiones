package com.sergio.ejercicio_versiones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.sergio.ejercicio_versiones.utils.Versiones;

public class DetalleActivity extends AppCompatActivity {
    ImageView logoPrincipal;
    TextView nombre_version, fecha_version, version_version, descripcion;
    Versiones versiones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        instancias();
    }

    private void instancias() {
        versiones =(Versiones)getIntent().getExtras().get(MainActivity.TAG_1);

        logoPrincipal = findViewById(R.id.logoPrincipal);
        nombre_version = findViewById(R.id.nombre_version);
        fecha_version = findViewById(R.id.fecha_version);
        version_version = findViewById(R.id.version_version);
        descripcion = findViewById(R.id.text);

        logoPrincipal.setImageResource(versiones.getLogoPrincipal());
        nombre_version.setText(versiones.getNombre());
        fecha_version.setText(String.valueOf(versiones.getFecha()));
        version_version.setText(String.valueOf(versiones.getVersion()));
        descripcion.setText(versiones.getDescripcion());
    }
}