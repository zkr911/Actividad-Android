package com.nilson.aplicacionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class VerActivity extends AppCompatActivity {



    RecyclerView recyclerView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

/*
    RegistroActivity registroActivity = new RegistroActivity();
    registroActivity.txtnombre.getText().toString();
*/
        ArrayList<String> datos_uno = new ArrayList<>();

        datos_uno.add("registroActivity.txtnombre.toString()");

        datos_uno.add("Hola2");
        datos_uno.add("Hola3");
        datos_uno.add("Hola4");
        datos_uno.add("Hola5");
        datos_uno.add("Hola6");
        datos_uno.add("Hola7");
        datos_uno.add("Hola8");
        datos_uno.add("Hola9");


        ArrayList<String> datos_completo = new ArrayList<String>();
        datos_completo.add(datos_completo.toArray().toString());

        Adaptador adap = new Adaptador(datos_completo);

        recyclerView.setAdapter(adap);



    }
}