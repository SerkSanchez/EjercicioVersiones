package com.sergio.examen_sergio_sanchez_15_11_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView imagen_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imagen_logo = findViewById(R.id.imagen_logo);
        temporizador();
    }


    private void temporizador() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}