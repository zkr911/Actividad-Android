package com.nilson.aplicacionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolderinfodatos> {


    ArrayList<infodatos> Datoscliente;

    public Adaptador(ArrayList<infodatos> datoscliente) {
       this.Datoscliente = datoscliente;
    }


    @NonNull
    @Override
    public Adaptador.MyViewHolderinfodatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_modelo_ver,parent,false);
        return new MyViewHolderinfodatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderinfodatos holder, int position) {

        infodatos infodatos = Datoscliente.get(position);
        holder.txtnombre.setText(infodatos.nombre);
        holder.textoapellido.setText(infodatos.apellido);
        holder.textocorreo.setText(infodatos.correo);


       // holder.textogenero.setText(infodatos.genero);
        holder.textoentel.setText(infodatos.entel);
        holder.textoclaro.setText(infodatos.claro);
        holder.textomovistar.setText(infodatos.movistar);
        holder.textospin.setText(infodatos.selecspin);
        holder.textoratin.setText(infodatos.ratin);

    }

    @Override
    public int getItemCount() {
        return Datoscliente.size();
    }

    public class MyViewHolderinfodatos extends RecyclerView.ViewHolder {

        TextView txtnombre;
        TextView textoapellido;
        TextView textocorreo;

       // TextView textogenero;
        TextView textoentel;
        TextView textoclaro;
        TextView textomovistar;
        TextView textospin;
        TextView textoratin;



        public MyViewHolderinfodatos(@NonNull View itemView) {
            super(itemView);

            txtnombre = itemView.findViewById(R.id.txtnombre);

            textoapellido = itemView.findViewById(R.id.txtapellido);
            textocorreo = itemView.findViewById(R.id.txtcorreo);


           // textogenero = itemView.findViewById(R.id.rbfemenino);
           // textogenero = itemView.findViewById(R.id.rbmasculino);

            textoentel = itemView.findViewById(R.id.cbentel);
            textoclaro = itemView.findViewById(R.id.cbclaro);
            textomovistar = itemView.findViewById(R.id.cbmovistar);
            textospin = itemView.findViewById(R.id.spinnerxml);
            textoratin = itemView.findViewById(R.id.ratingBar);
        }
    }
}
