package com.example.a2activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        boton=findViewById(R.id.button3);

        Bundle extras=getIntent().getExtras();
        String sNombre=extras.getString("nombre");
        String sApellidos=extras.getString("apellidos");

        Toast.makeText(getApplicationContext(), "Nombre: " + sNombre + "\nApellidos: " + sApellidos, Toast.LENGTH_SHORT).show();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent miIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(miIntent);
            }
        });

    }
}