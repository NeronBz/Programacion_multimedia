package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    RadioButton rb1, rb2;
    CheckBox check;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        check=findViewById(R.id.check);
        spin=findViewById(R.id.spinner);
    }
}