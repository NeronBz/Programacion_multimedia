package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nombre, email, telef;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.editNombre);
        email=findViewById(R.id.editEmail);
        telef=findViewById(R.id.editPhone);
        result=findViewById(R.id.viewRespuesta);
    }

    public void Mostrar(View control){
        result.setText("Nombre: "+nombre.getText()+"\nEmail: "+email.getText()+"\nTeléfono: "+telef.getText());
    }
}