package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.numero1);
        num2=findViewById(R.id.numero2);
        result=findViewById(R.id.resultado);

    }

    public void Sumar(View control){
        String texto1 = num1.getText().toString().trim();
        String texto2 = num2.getText().toString().trim();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            result.setText("Introduce números en ambos campos");
            return;
        }

        try {
            int n1 = Integer.parseInt(texto1);
            int n2 = Integer.parseInt(texto2);

            int suma = n1 + n2;
            result.setText("La suma es: " + suma);

        } catch (NumberFormatException e) {
            result.setText("Solo se permiten números válidos");
        }
    }

    public void Restar(View control){
        String texto1 = num1.getText().toString().trim();
        String texto2 = num2.getText().toString().trim();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            result.setText("Introduce números en ambos campos");
            return;
        }

        try {
            int n1 = Integer.parseInt(texto1);
            int n2 = Integer.parseInt(texto2);

            int resta = n1 - n2;
            result.setText("La resta es: " + resta);

        } catch (NumberFormatException e) {
            result.setText("Solo se permiten números válidos");
        }
    }

    public void Multiplicar(View control){
        String texto1 = num1.getText().toString().trim();
        String texto2 = num2.getText().toString().trim();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            result.setText("Introduce números en ambos campos");
            return;
        }

        try {
            int n1 = Integer.parseInt(texto1);
            int n2 = Integer.parseInt(texto2);

            int producto = n1 * n2;
            result.setText("El producto es: " + producto);

        } catch (NumberFormatException e) {
            result.setText("Solo se permiten números válidos");
        }
    }

    public void Dividir(View control){
        String texto1 = num1.getText().toString().trim();
        String texto2 = num2.getText().toString().trim();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            result.setText("Introduce números en ambos campos");
            return;
        }

        try {
            int n1 = Integer.parseInt(texto1);
            int n2 = Integer.parseInt(texto2);

            if (n2 == 0) {
                result.setText("No se puede dividir entre 0");
                return;
            }

            int division = n1 / n2;
            result.setText("La división es: " + division);

        } catch (NumberFormatException e) {
            result.setText("Solo se permiten números válidos");
        }
    }
}