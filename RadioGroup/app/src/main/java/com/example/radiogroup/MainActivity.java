package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton php, java, c;
    CheckBox fn, oro;
    String curso="";
    float total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        php=findViewById(R.id.rbPhp);
        java=findViewById(R.id.rbJava);
        c=findViewById(R.id.rbC);
        fn=findViewById(R.id.fn);
        oro=findViewById(R.id.oro);
    }

    public void Calcular(View control){
        float precio=0;
        float dto1=0, dto2=0;

        if(php.isChecked()){
            curso="PHP";
            precio=120;
        }

        if(java.isChecked()){
            curso="Java";
            precio=100;
        }

        if(c.isChecked()){
            curso="C++";
            precio=90;
        }

        if(fn.isChecked()){
            dto1=(float) precio * 10/100;
        }

        if(oro.isChecked()){
            dto2=(float) precio * 5/100;
        }

        total=precio-dto1-dto2;

        CharSequence text = "Curso: "+curso+
                ", Precio: "+precio+
                ", Dto FN: "+dto1+
                ", Dto Socio Oro: "+dto2+
                ", Total: "+total;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this /* MyActivity */, text, duration);
        toast.show();
        
    }

}