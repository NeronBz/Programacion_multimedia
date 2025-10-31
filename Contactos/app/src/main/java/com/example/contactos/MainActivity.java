package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mostrar, camara, llamar, marcar, navegar, busqueda, mapa, sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrar=findViewById(R.id.mostrar);
        camara=findViewById(R.id.camara);
        llamar=findViewById(R.id.llamar);
        marcar=findViewById(R.id.marcar);
        navegar=findViewById(R.id.navegador);
        busqueda=findViewById(R.id.busqueda);
        sms=findViewById(R.id.sms);
        mapa=findViewById(R.id.mapa);


        navegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));
                startActivity(intento);
            }
        });

        busqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_WEB_SEARCH);
                intento.putExtra(SearchManager.QUERY, "IES Augustóbriga");
                startActivity(intento);
            }
        });

        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intento);
            }
        });

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(intento);
            }
        });

        marcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:624972693"));
                startActivity(intento);
            }
        });

        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_CALL, Uri.parse("tel:624972693"));
                startActivity(intento);
            }
        });

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:39.890986, -5.532791"));
                startActivity(intento);
            }
        });


        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:1234424"));
                intento.putExtra("sms_body","Texto a enviar");
                startActivity(intento);
            }
        });

    }
}