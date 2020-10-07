package com.nilson.aplicacionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptadores extends RecyclerView.Adapter<Adaptadores.MyViewHolderinfodatos> {

private ArrayList<infodatos> Datoscliente;

    public Adaptadores(ArrayList<infodatos> Datoscliente) {
        this.Datoscliente = Datoscliente;
    }


    @NonNull
    @Override
    public Adaptadores.MyViewHolderinfodatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_modelo_ver,parent,false);
        return new MyViewHolderinfodatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderinfodatos holder, int position) {


        holder.cargardat(Datoscliente.get(position));
    }

    @Override
    public int getItemCount() {
        return Datoscliente.size();
    }

    public class MyViewHolderinfodatos extends RecyclerView.ViewHolder {

            TextView txtnom, txtape,txtmail,radiofemenino,radiomasculino,chekentel,chekclaro,chekmovistar,selecspiner,ratinkin;



        public MyViewHolderinfodatos(@NonNull View itemView) {
            super(itemView);

            txtnom = itemView.findViewById(R.id.txtnom);
            txtape = itemView.findViewById(R.id.txtape);
            txtmail = itemView.findViewById(R.id.txtmail);
            radiofemenino = itemView.findViewById(R.id.radiofemenino);
            radiomasculino = itemView.findViewById(R.id.radiomasculino);
            chekentel = itemView.findViewById(R.id.chekentel);
            chekclaro = itemView.findViewById(R.id.chekclaro);
            chekmovistar = itemView.findViewById(R.id.chekmovistar);
            selecspiner = itemView.findViewById(R.id.selecspiner);
            ratinkin = itemView.findViewById(R.id.ratinkin);




        }

        public void cargardat(infodatos infodatos){
            txtnom.setText(infodatos.getNombre());
            txtape.setText(infodatos.getApellido());
            txtmail.setText(infodatos.getCorreo());
            radiofemenino.setText(infodatos.getGenero());
            radiomasculino.setText(infodatos.getGenero());
            chekentel.setText(infodatos.getEntel());
            chekclaro.setText(infodatos.getClaro());
            chekmovistar.setText(infodatos.getMovistar());
            selecspiner.setText(infodatos.getSelecspin());
            ratinkin.setText(infodatos.getRatin());

        }
    }
}
