package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        user = findViewById(R.id.usuario);

        // Referencia al CheckBox desde el layout
        CheckBox checkBox = findViewById(R.id.checkBox);

        // Listener para detectar cambios en el CheckBox
        CompoundButton.OnCheckedChangeListener cbCambio = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "Has seleccionado recordar usuario", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Has desmarcado recordar usuario", Toast.LENGTH_SHORT).show();
                }
            }
        };
        checkBox.setOnCheckedChangeListener(cbCambio);

        // Asignar listener del botón dentro de onCreate
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = user.getText().toString().trim();
                if (usuario.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingresa un usuario", Toast.LENGTH_SHORT).show();
                } else {
                    // Alternar entre tema claro y oscuro
                    int currentMode = AppCompatDelegate.getDefaultNightMode();
                    if (currentMode == AppCompatDelegate.MODE_NIGHT_YES) {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    } else {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    }
                    Toast.makeText(MainActivity.this, "Enviando datos de " + usuario + "...", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
