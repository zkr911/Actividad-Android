package com.nilson.aplicacionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private Button btnver,btngenerar;


    public static ArrayList<infodatos> Arraydatos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnver = findViewById(R.id.btnver);
        btngenerar = findViewById(R.id.btngenerar);

        //boton del registro
        btngenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento = new Intent (MainActivity.this,RegistroActivity.class);
                startActivity(intento);
            }
        });


        //boton para ver los registros con recyclerview
        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this,VerActivity.class);
                startActivity(intento);

            }
        });




    }
}