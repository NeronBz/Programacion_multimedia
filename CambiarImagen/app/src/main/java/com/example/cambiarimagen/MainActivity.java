package com.example.cambiarimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    Button boton;
    CheckBox check;
    RadioButton mostrar, ocultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen=findViewById(R.id.img);
        boton = findViewById(R.id.button);
        check=findViewById(R.id.checkBox);
        mostrar=findViewById(R.id.mostrar);
        ocultar=findViewById(R.id.ocultar);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                boton.setEnabled(isChecked);
            }
        });

        mostrar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagen.setVisibility(View.VISIBLE);
                }
            }
        });

        ocultar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagen.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void cambiarImagen(View vista) {
        if (imagen.getTag() == null || imagen.getTag().equals("background")) {
            imagen.setImageResource(R.drawable.ic_launcher_foreground);
            imagen.setTag("foreground");
        } else {
            imagen.setImageResource(R.drawable.ic_launcher_background);
            imagen.setTag("background");
        }
    }

}