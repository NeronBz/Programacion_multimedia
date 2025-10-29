package com.example.altacontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CamposAlta extends AppCompatActivity {

    Button boton2;
    EditText txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campos_alta);

        boton2=findViewById(R.id.button2);
        txt1=findViewById(R.id.edit1);
        txt2=findViewById(R.id.edit2);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty()){
                    Toast.makeText(CamposAlta.this, "Por favor ingresa los datos", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intento = new Intent();
                    intento.putExtra("texto 1", txt1.getText().toString());
                    intento.putExtra("texto 2", txt2.getText().toString());
                    setResult(RESULT_OK, intento);
                    finish();
                }
            }
        });
    }
}