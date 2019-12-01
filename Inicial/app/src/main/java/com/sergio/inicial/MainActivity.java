package com.sergio.inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botonPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instancias();
        acciones();
    }

    private void acciones()
    {

    }

    private void instancias()
    {

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.v("pmdm","Pasando por el estado onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.v("pmdm","Pasando por el estado onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.v("pmdm","Pasando por el estado onPause");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.v("pmdm","Pasando por el estado onRestart");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.v("pmdm","Pasando por el estado onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.v("pmdm","Pasando por el estado onDestroy");
    }

}
