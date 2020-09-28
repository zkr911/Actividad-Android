package com.nilson.aplicacionapp;

import androidx.appcompat.app.AppCompatActivity;

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


    Spinner spinnerxml;
    EditText txtnombre;
    EditText txtapellido;
    RadioGroup radioGroup;
    RadioButton rbmasculino;
    RadioButton rbfemenino;
    EditText txtcorreo;
    CheckBox cbentel,cbmovistar,cbclaro;
    RatingBar ratingBar;
    Button btnok;
    String[] items;
    private boolean isFirsTime = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtnombre =findViewById(R.id.txtnombre);
        txtapellido=findViewById(R.id.txtapellido);
        txtcorreo=findViewById(R.id.txtcorreo);
        radioGroup=findViewById(R.id.radioGroup);

        cbentel=findViewById(R.id.cbentel);
        cbclaro=findViewById(R.id.cbclaro);
        cbmovistar=findViewById(R.id.cbmovistar);

        btnok=findViewById(R.id.btnok);
        ratingBar=findViewById(R.id.ratingBar);
        spinnerxml = findViewById(R.id.spinnerxml);
        rbmasculino = findViewById(R.id.rbmasculino);
        rbfemenino = findViewById(R.id.rbfemenino);
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

             if(charSequence.length() < 3){
                 txtcorreo.setError("El apellido es muy corto");
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


             float rating = ratingBar.getRating();



            boolean check1 = cbentel.isChecked();

            boolean check2 = cbclaro.isChecked();
            boolean check3 = cbmovistar.isChecked();

            Spinner myspin = (Spinner)findViewById(R.id.spinnerxml);
            String selectspin = myspin.getSelectedItem().toString();

             Toast.makeText(RegistroActivity.this,"---> "+selectspin+"------>"+check2+"----->"+check3,Toast.LENGTH_LONG).show();





         }
     });


    }
}