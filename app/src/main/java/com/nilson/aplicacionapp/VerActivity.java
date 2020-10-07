package com.nilson.aplicacionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

public class VerActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ver);
        recyclerView = findViewById(R.id.recyclerconfi);
        recyclerView.setLayoutManager(new LinearLayoutManager(VerActivity.this));



       // Adaptador adaptador = new Adaptador();
        Adaptadores adaptador = new Adaptadores(MainActivity.Arraydatos);

        recyclerView.setAdapter(adaptador);


    }
}