package com.example.kelvin.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class Avionesopciones extends AppCompatActivity {

   // private TextView asiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avionesopciones);

        //asiento = (TextView) findViewById(R.id.numasien);//dato para almacenar el dato del intent

        //getIntent()obtener la funcion en el activity aviones,getStringExtra obtener el key asignado en activity aviones
        //String dato = getIntent().getStringExtra("dato");
        //mostrando el numero de asiento
        //System.out.println(dato);
        //String recuperar = dato;
        //asiento.setText("Este es tu asiento: " + dato);
    }
    public void Mostrar(View view){
        Intent mos = new Intent(this,Avionesmostrar.class);
        startActivity(mos);
    }

    public void Eliminar(View view){
        Intent eli = new Intent(this,Avioneseliminar.class);
        startActivity(eli);
    }

    public void Actualizar(View view){
        Intent act = new Intent(this,Avionesactualizar.class);
        startActivity(act);
    }

    public void irAtras(View view){
        Intent back = new Intent(this,Aviones.class);
        startActivity(back);
    }

    public void irSiguiente(View view){
        Intent next = new Intent(this,Fotopasaje.class);
        startActivity(next);
    }
}