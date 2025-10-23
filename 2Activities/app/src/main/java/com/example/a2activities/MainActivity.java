package com.example.a2activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText nombre, apellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=findViewById(R.id.button);
        nombre=findViewById(R.id.nombre);
        apellidos=findViewById(R.id.apellidos);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = new Intent(getApplicationContext(), MainActivity2.class);
                miIntent.putExtra("nombre", nombre.getText().toString());
                miIntent.putExtra("apellidos", apellidos.getText().toString());
                startActivity(miIntent);
            }
        });
    }
}