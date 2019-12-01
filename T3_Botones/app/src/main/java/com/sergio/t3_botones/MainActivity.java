package com.sergio.t3_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    ImageButton bImagen;
    ToggleButton tPerso;
    Switch sPerso;
    CheckBox cNormal;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        tPerso.setOnCheckedChangeListener(this);
        sPerso.setOnCheckedChangeListener(this);
        cNormal.setOnCheckedChangeListener(this);
        bImagen.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(this);
    }

    private void instancias() {
        tPerso = findViewById(R.id.toggle_perso);
        sPerso = findViewById(R.id.switch_perso);
        cNormal = findViewById(R.id.check_normal);
        bImagen = findViewById(R.id.image_button);
        radioGroup = findViewById(R.id.grupo_radios);
    }

    @Override
    public void onCheckedChanged(CompoundButton comoundButton, boolean b) {
        switch (comoundButton.getId()) {
            case R.id.toggle_perso:
                String activado;
                if (b) {
                    activado = "activado";
                } else {
                    activado = "desactivado";
                }
                Toast.makeText(getApplicationContext(), String.format("El elemento está %s ", activado), Toast.LENGTH_SHORT).show();
                break;
            case R.id.switch_perso:
                if (b) {
                    activado = "activado";
                } else {
                    activado = "desactivado";
                }
                Toast.makeText(getApplicationContext(), String.format("El switch está %s ", activado), Toast.LENGTH_SHORT).show();
                break;
            case R.id.check_normal:
                if (b) {
                    activado = "activado";
                } else {
                    activado = "desactivado";
                }
                Toast.makeText(getApplicationContext(), String.format("El check está %s ", activado), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View v) {
       /*tPerso.setChecked(false);
        sPerso.setChecked(false);
        cNormal.setChecked(false);*/

        RadioButton radio = findViewById(radioGroup.getCheckedRadioButtonId());
       Toast.makeText(getApplicationContext(),radio.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (radioGroup.getId()) {
            case R.id.grupo_radios:
                switch (checkedId) {
                    case R.id.radio_uno:
                        Toast.makeText(getApplicationContext(), "Seleccionado uno", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_dos:
                        Toast.makeText(getApplicationContext(), "Seleccionado dos", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radio_tres:
                        Toast.makeText(getApplicationContext(), "Seleccionado tres", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
        }
    }
}
