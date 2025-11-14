package com.example.menu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.contacto){
            Toast t= Toast.makeText(getApplicationContext(), "correo@gmail.com", Toast.LENGTH_LONG);
            t.show();
        }
        if(id==R.id.cerrar){
            finishAffinity();
        }

        if(id==R.id.info){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Información");
            builder.setMessage("¿Estás seguro que quieres informarte?");
            builder.setCancelable(false);
            builder.setPositiveButton("Informarme", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    BotonAceptar();
                }
            });
            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    botonCancelar();
                }
            });
            builder.create();
            builder.show();
        }

        return true;
    }

    public void BotonAceptar(){
        Toast t= Toast.makeText(getApplicationContext(), "Estás siendo informado", Toast.LENGTH_SHORT);
        t.show();
    }
    public void botonCancelar(){
        finish();
    }
}