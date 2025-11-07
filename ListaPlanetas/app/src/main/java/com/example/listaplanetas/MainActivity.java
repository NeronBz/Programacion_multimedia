package com.example.listaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView lPlanetas;
    TextView resultado;
    Button boton, botonAdd;
    ArrayList planetas;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lPlanetas=findViewById(R.id.lPlanetas);
        resultado=findViewById(R.id.resultado);
        boton=findViewById(R.id.button);
        botonAdd=findViewById(R.id.button2);
        edit=findViewById(R.id.edit);

        //Creo el ArrayList para ponerlo en el adaptador
        planetas=new ArrayList<>(new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.listaPlanetas))));
        //Creamos el adaptador con los datos del array planetas
        ArrayAdapter<String> adaptador=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_multiple_choice, planetas);
        //ArrayAdapter adaptador=ArrayAdapter.createFromResource(getApplicationContext(), R.array.listaPlanetas, android.R.layout.simple_list_item_multiple_choice);
        lPlanetas.setAdapter(adaptador);

        /*lPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Obtenemos el planeta seleccionada en la lista
                String planeta=adapterView.getItemAtPosition(i).toString();
                resultado.setText("Has seleccionado "+planeta);
            }
        });*/

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seleccion="";
                SparseBooleanArray posSeleccionada=lPlanetas.getCheckedItemPositions();
                for(int i=0;i<posSeleccionada.size();i++){
                    int posicionAdaptador=posSeleccionada.keyAt(i);
                    if(posSeleccionada.get(posicionAdaptador)){
                        seleccion+=lPlanetas.getItemAtPosition(posicionAdaptador)+", ";
                    }
                }
                Toast.makeText(getApplicationContext(), "Se han seleccionado "+seleccion, Toast.LENGTH_LONG).show();
            }
        });

        lPlanetas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Borramos el item seleccionado del ArrayList
                planetas.remove(adapterView.getItemAtPosition(i));
                //Comunicamos al adaptador que el origen de datos ha cambiado
                adaptador.notifyDataSetChanged();
                return true;
            }
        });

        botonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planeta=edit.getText().toString();
                planetas.add(planeta);
                adaptador.notifyDataSetChanged();
            }
        });
    }
}