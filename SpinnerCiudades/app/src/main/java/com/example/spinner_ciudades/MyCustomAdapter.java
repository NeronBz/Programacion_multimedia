package com.example.spinner_ciudades;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends BaseAdapter {

    ArrayList<Filas> lista;
    Context contexto;
    MyCustomAdapter(Context c){
        contexto=c;
        lista=new ArrayList<Filas>();

        Resources res=c.getResources();
        String[] ciudades=res.getStringArray(R.array.ciudades);
        int[] imagenes={R.drawable.castellon, R.drawable.gijon, R.drawable.huesca, R.drawable.peniscola, R.drawable.teruel};

        for (int i=0;i<5;i++){
            lista.add(new Filas(ciudades[i], imagenes[i]));
        }
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflar= (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View list=inflar.inflate(R.layout.spinner, viewGroup, false);
        TextView ciudad=list.findViewById(R.id.nombreC);
        ImageView imagen=list.findViewById(R.id.img);

        Filas temporal=lista.get(i);
        ciudad.setText(temporal.ciudad);
        imagen.setImageResource(temporal.imagen);
        return list;
    }
}
