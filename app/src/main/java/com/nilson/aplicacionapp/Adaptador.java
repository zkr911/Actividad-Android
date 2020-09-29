package com.nilson.aplicacionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderDatos> {


    ArrayList<String> lista_datos;

    public Adaptador(ArrayList<String> lista_datos) {
        this.lista_datos = lista_datos;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_modelo_ver,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolderDatos holder, int position) {

        holder.cargardatos(lista_datos.get(position));
    }

    @Override
    public int getItemCount() {
        return lista_datos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView textonombre;
        TextView textoapellido;
        TextView textocorreo;
        TextView textogenero;
        TextView textoentel;
        TextView textoclaro;
        TextView textomovistar;
        TextView textospin;
        TextView textoratin;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            textonombre = itemView.findViewById(R.id.textonombre);
            textoapellido = itemView.findViewById(R.id.textoapellido);
            textocorreo = itemView.findViewById(R.id.textocorreo);
            textogenero = itemView.findViewById(R.id.textogenero);
            textoentel = itemView.findViewById(R.id.textoentel);
            textoclaro = itemView.findViewById(R.id.textoclaro);
            textomovistar = itemView.findViewById(R.id.textomovistar);
            textospin = itemView.findViewById(R.id.textospin);
            textoratin = itemView.findViewById(R.id.textoratin);

        }


        public void cargardatos(String s){

            textonombre.setText(s);
            textoapellido.setText(s);
            textocorreo.setText(s);
            textogenero.setText(s);
            textoentel.setText(s);
            textoclaro.setText(s);
            textomovistar.setText(s);
            textospin.setText(s);
            textoratin.setText(s);
        }
    }
}
