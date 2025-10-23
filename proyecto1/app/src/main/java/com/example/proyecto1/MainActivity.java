package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
TextView resul;
Button btn1;
ToggleButton btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resul=findViewById(R.id.EtiquetaInicio);
        btn1= findViewById(R.id.BotonAceptar);
        btn2=findViewById(R.id.Interruptor);


    }
    public void Mostrarbtn1(View vista){
        resul.setText("Botón pulsado");
    }

    public void Mostrarbtn2(View vista){
        if(btn2.isChecked())
            resul.setText("Botón encendido");
        else
            resul.setText("Botón apagado");
    }
}