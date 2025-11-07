package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner colores;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colores=findViewById(R.id.spinner);
        resultado=findViewById(R.id.textView);

        ArrayAdapter adaptador=ArrayAdapter.createFromResource(getApplicationContext(), R.array.colores, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colores.setAdapter(adaptador);

        String texto="El color seleccionado es ";

        colores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            String color=adapterView.getItemAtPosition(i).toString();
            if(color.equals("Rojo")){
                resultado.setTextColor(Color.RED);
                resultado.setText(texto+"rojo");
            }
                if(color.equals("Verde")){
                    resultado.setTextColor(Color.GREEN);
                    resultado.setText(texto+"verde");
                }
                if(color.equals("Naranja")){
                    resultado.setTextColor(Color.rgb(255,117,20));
                    resultado.setText(texto+"naranja");
                }
                if(color.equals("Azul")){
                    resultado.setTextColor(Color.BLUE);
                    resultado.setText(texto+"azul");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}