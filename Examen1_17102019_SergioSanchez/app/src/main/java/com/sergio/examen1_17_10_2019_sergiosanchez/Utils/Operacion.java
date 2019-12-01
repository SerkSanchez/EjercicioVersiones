package com.sergio.examen1_17_10_2019_sergiosanchez.Utils;

import android.widget.EditText;

import java.io.Serializable;

public class Operacion implements Serializable
{
    int texto1Recu;
    int texto2Recu;
    boolean checkbox;

    public Operacion(EditText oper1, EditText oper2, boolean checkbox)
    {
        this.texto1Recu = texto1Recu;
        this.texto2Recu = texto2Recu;
        this.checkbox = checkbox;
    }

    public int getOper1() {
        return texto1Recu;
    }

    public void setOper1(int oper1) {
        this.texto1Recu = oper1;
    }

    public int getOper2() {
        return texto2Recu;
    }

    public void setOper2(int oper2) {
        this.texto2Recu = oper2;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
