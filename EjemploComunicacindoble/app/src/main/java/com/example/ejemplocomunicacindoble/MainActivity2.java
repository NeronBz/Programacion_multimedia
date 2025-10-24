package com.example.ejemplocomunicacindoble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    Button modificar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText=findViewById(R.id.cadena);
        modificar=findViewById(R.id.modificar);
        cancelar=findViewById(R.id.cancelar);

        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()){
                    editText.setText("Tienes que poner texto");
                }else{
                    Intent intento = new Intent();
                    intento.putExtra("resultado", editText.getText().toString());
                    setResult(RESULT_OK, intento);
                    finish();
                }
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}