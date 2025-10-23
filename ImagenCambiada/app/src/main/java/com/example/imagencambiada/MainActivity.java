package com.example.imagencambiada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen=findViewById(R.id.img);
        boton = findViewById(R.id.btnCambiar);
    }

public void cambiarImagen(View vista){
        imagen.setImageResource(R.drawable.img);
}
}