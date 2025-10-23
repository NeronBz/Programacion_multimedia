package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox c1=findViewById(R.id.checkIphone);
        final CheckBox c2=findViewById(R.id.checkAndroid);
        final Button botonCB=findViewById(R.id.btnSeleccion);
        final TextView txt=findViewById(R.id.textView);

        CompoundButton.OnCheckedChangeListener cbCambio= new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    txt.setText("Checkbox: "+compoundButton.getText()+" marcado");
                }else{
                    txt.setText("Checkbox: "+compoundButton.getText()+" desmarcado");
                }
            }
        };
        c1.setOnCheckedChangeListener(cbCambio);
        c2.setOnCheckedChangeListener(cbCambio);
        botonCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked() && c2.isChecked()){
                    txt.setText("Has seleccionado Android y IPhone");
                }else if(c1.isChecked()){
                    txt.setText("Has seleccionado IPhone");
                }else if(c2.isChecked()){
                    txt.setText("Has seleccionado Android");
                }else{
                    txt.setText("No has seleccionado nada");
                }
            }
        });
    }
}