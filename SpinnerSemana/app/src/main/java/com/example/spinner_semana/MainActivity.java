package com.example.spinner_semana;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner dias;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dias=findViewById(R.id.spinner);
        texto=findViewById(R.id.texto);

        ArrayAdapter adaptador=ArrayAdapter.createFromResource(getApplicationContext(), R.array.semana, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);
        dias.setAdapter(adaptador);

        String txt="Has seleccionado el ";
        dias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                texto.setText(txt+adapterView.getItemAtPosition(i).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}