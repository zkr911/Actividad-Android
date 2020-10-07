package com.nilson.aplicacionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {


    private Spinner spinnerxml;
    private EditText txtnombre;
    private EditText txtapellido;
    private RadioGroup radioGroup;
    private RadioButton rbmasculino;
    private RadioButton rbfemenino;
    private EditText txtcorreo;
    private CheckBox cbentel,cbmovistar,cbclaro;
    private RatingBar ratingBar;
    private Button btnok;
    private String[] items;
    private boolean isFirsTime = true;
    private String entel;
    private String claro;
    private String movistar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtnombre =findViewById(R.id.txtnom);
        txtapellido=findViewById(R.id.txtape);
        txtcorreo=findViewById(R.id.txtmail);
        radioGroup=findViewById(R.id.radioGroup);

        cbentel=findViewById(R.id.cbentel);
        cbclaro=findViewById(R.id.chekclaro);
        cbmovistar=findViewById(R.id.chekmovistar);



        btnok=findViewById(R.id.btnok);
        ratingBar=findViewById(R.id.ratinkin);
        spinnerxml = findViewById(R.id.selecspiner);
        rbmasculino = findViewById(R.id.rbmasculino);
        rbfemenino = findViewById(R.id.radiofemenino);
        items = getResources().getStringArray(R.array.Marca_Smartphone);

        ArrayAdapter<CharSequence> Celulares = ArrayAdapter.createFromResource(RegistroActivity.this,R.array.Marca_Smartphone,android.R.layout.simple_spinner_item);
        spinnerxml.setAdapter(Celulares);


        txtapellido.setEnabled(false);
        radioGroup.setEnabled(false);
            rbfemenino.setEnabled(false);
            rbmasculino.setEnabled(false);
         txtcorreo.setEnabled(false);
         spinnerxml.setEnabled(false);
         cbclaro.setEnabled(false);
         cbmovistar.setEnabled(false);
        cbentel.setEnabled(false);
         ratingBar.setEnabled(false);
        btnok.setEnabled(false);




     txtnombre.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
         }
         @Override
         public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             if(charSequence.length() < 3){
                 txtnombre.setError("El nombre es muy corto");
                 if(charSequence.length()==0){
                     txtnombre.setError(null);
                 }
             }else{
                 txtapellido.setEnabled(true);
             }
         }
         @Override
         public void afterTextChanged(Editable editable) {
         }
     });





     txtapellido.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

         }

         @Override
         public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


             if(charSequence.length() < 3){
                 txtapellido.setError("El apellido es muy corto");
                 if(charSequence.length()==0){
                     txtapellido.setError(null);
                 }
             }else{

                 txtcorreo.setEnabled(true);

             }

         }

         @Override
         public void afterTextChanged(Editable editable) {

         }
     });




     txtcorreo.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

         }

         @Override
         public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             if(charSequence.length() < 8){
                 txtcorreo.setError("El correo es muy corto");
                 if(charSequence.length()==0){
                     txtcorreo.setError(null);
                 }
             }else{

                 radioGroup.setEnabled(true);
                 rbfemenino.setEnabled(true);
                 rbmasculino.setEnabled(true);


                 cbclaro.setEnabled(true);
                 cbmovistar.setEnabled(true);
                 cbentel.setEnabled(true);

                 spinnerxml.setEnabled(true);
             }


         }

         @Override
         public void afterTextChanged(Editable editable) {

         }
     });






     spinnerxml.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

             Toast.makeText(getApplicationContext(),items[i],Toast.LENGTH_LONG).show();


             if(isFirsTime){
                 isFirsTime = false;

             }else{

                 Toast.makeText(getApplicationContext(),items[i],Toast.LENGTH_LONG).show();
                 ratingBar.setEnabled(true);
                btnok.setEnabled(true);
             }

         }

         @Override
         public void onNothingSelected(AdapterView<?> adapterView) {

         }
     });


//boton enviar datos
     btnok.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             String nombre = txtnombre.getText().toString();


             String apellido = txtapellido.getText().toString();
             String correo = txtcorreo.getText().toString();

             int rg = radioGroup.getCheckedRadioButtonId();
             View rgselect = radioGroup.findViewById(rg);
             int indice = radioGroup.indexOfChild(rgselect);
             RadioButton rbselect = (RadioButton) radioGroup.getChildAt(indice);
             String genero = rbselect.getText().toString();


             float rating =  ratingBar.getRating();
             String ratin = Float.valueOf(rating).toString();



            boolean check1 = cbentel.isChecked();
                if(check1 == false){
                     entel = "";
                }else {
                     entel = "Entel";
                }


            boolean check2 = cbclaro.isChecked();
                if(check2 ==false){
                    claro = "";
                }else{
                    claro = "Claro";
                }


            boolean check3 = cbmovistar.isChecked();
                if(check3 == false){
                    movistar = "";
                }else{
                    movistar ="Movistar";
                }



            String selectspin = spinnerxml.getSelectedItem().toString();

             Toast.makeText(RegistroActivity.this,"Nombre Completo : "+nombre+" "+apellido+"\nCorreo : "+correo+"\n Genero : "+genero+"\n Compañia : "+entel+" "+claro+" "+movistar+"\nMarca :  "+selectspin+"\nVotacion : "+ratin,Toast.LENGTH_LONG).show();



             //datoarray.datoarray.add(new infodatos(nombre,apellido,correo,entel,claro,movistar,selectspin,ratin));


             infodatos datoscompleto = new infodatos(nombre,apellido,correo,entel,claro,movistar,selectspin,ratin);

             MainActivity.Arraydatos.add(datoscompleto);


            Intent intento = new Intent(RegistroActivity.this,MainActivity.class);
            startActivity(intento);



         }
     });

    }





}