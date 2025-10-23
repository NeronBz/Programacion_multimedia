package com.example.ocultarimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton boton;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen=findViewById(R.id.img);
        boton = findViewById(R.id.btnMostrar);
        imagen.setVisibility(View.INVISIBLE);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boton.isChecked()){
                    imagen.setVisibility(View.VISIBLE);
                }else{
                    imagen.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}