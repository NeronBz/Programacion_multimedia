package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IMC2 extends AppCompatActivity {
    TextView tuIMC, altura2, peso2, total;
    double calculo;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc2);

        tuIMC=findViewById(R.id.tuIMC);
        altura2=findViewById(R.id.altura2);
        peso2=findViewById(R.id.peso2);
        total=findViewById(R.id.total);

        Bundle extras=getIntent().getExtras();
        String sNombre=extras.getString("nombre");
        String sAltura=extras.getString("altura");
        String sPeso=extras.getString("peso");

        calculo=Double.parseDouble(sPeso)/((Double.parseDouble(sAltura)/100)*(Double.parseDouble(sAltura)/100));
        resultado=String.format("%.2f", calculo);
        altura2.setText("Altura: "+sAltura);
        peso2.setText("Peso: "+sPeso);
        total.setText("Tu IMC es de: "+resultado);

        if(calculo<16){
            tuIMC.setText(sNombre + " tu IMC indica Delgadez Severa");
        } else if(calculo>=16 && calculo<=16.99){
            tuIMC.setText(sNombre + " tu IMC indica Delgadez moderada");
        } else if(calculo>=17 && calculo<=18.49){
            tuIMC.setText(sNombre + " tu IMC indica Delgadez aceptable");
        } else if(calculo>=18.5 && calculo<=24.99){
            tuIMC.setText(sNombre + " tu IMC indica Peso normal");
        } else if(calculo>=25 && calculo<=29.99){
            tuIMC.setText(sNombre + " tu IMC indica Sobrepeso");
        } else if(calculo>=30 && calculo<=34.99){
            tuIMC.setText(sNombre + " tu IMC indica Obeso: Tipo I");
        } else if(calculo>=35 && calculo<=40){
            tuIMC.setText(sNombre + " tu IMC indica Obeso: Tipo II");
        } else if(calculo>40){
            tuIMC.setText(sNombre + " tu IMC indica Obeso: Tipo III");
        }
    }
}