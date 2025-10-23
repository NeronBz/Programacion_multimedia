package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre, altura, peso;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.nombreTexto);
        altura=findViewById(R.id.alturaTexto);
        peso=findViewById(R.id.pesoTexto);
        boton=findViewById(R.id.calcular);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nombre.getText().toString().isEmpty() || !altura.getText().toString().isEmpty() || !peso.getText().toString().isEmpty()){
                    Intent miIntent = new Intent(getApplicationContext(), IMC2.class);
                    miIntent.putExtra("nombre", nombre.getText().toString());
                    miIntent.putExtra("altura", altura.getText().toString());
                    miIntent.putExtra("peso", peso.getText().toString());
                    startActivity(miIntent);
                }else{
                    Toast.makeText(getApplicationContext(), "Tiene que rellenar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}