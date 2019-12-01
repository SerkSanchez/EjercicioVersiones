package com.sergio.repasoexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button contestar1, contestar2;
    final static String TAG_EXTRA = "extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        contestar1 = findViewById(R.id.boton_contestar_1);
        contestar2 = findViewById(R.id.boton_contestar_2);
        contestar1.setOnClickListener(this);
        contestar2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intentResultado;
        switch (v.getId()) {
            case R.id.boton_contestar_1:
                intentResultado = new Intent();
                intentResultado.putExtra(TAG_EXTRA, "respuesta");
                setResult(MainActivity.TAG_RES_CODE_OK, intentResultado);
                setResult(1, intentResultado);
                break;
            case R.id.boton_contestar_2:
                setResult(MainActivity.TAG_RES_CODE_FAIL);
                break;
        }
        finish();
    }
}
