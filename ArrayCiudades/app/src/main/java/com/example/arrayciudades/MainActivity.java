package com.example.arrayciudades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView lCiudades;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lCiudades=findViewById(R.id.lCiudades);
        resultado=findViewById(R.id.textView2);

        //Creamos el adaptador con los datos del array ciudades
        ArrayAdapter adaptador=ArrayAdapter.createFromResource(getApplicationContext(), R.array.ciudades, android.R.layout.simple_list_item_1);
        lCiudades.setAdapter(adaptador);

        //Definimos el método  seleccionar item de la lista
        lCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Obtenemos la ciudad seleccionada en la lista
                String ciudad=adapterView.getItemAtPosition(i).toString();
                //Obtenemos los habitantes de la ciudad
                String habitantes=getResources().getStringArray(R.array.habitantes)[i];

                //Mostremos el resultado
                resultado.setText("Nº de habitantes de "+ciudad+": "+habitantes);
            }
        });
    }
}