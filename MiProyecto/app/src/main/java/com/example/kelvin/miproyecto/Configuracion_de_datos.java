package com.example.kelvin.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Configuracion_de_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_de_datos);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

    }

    //metodo para regresar al primer actividad

    public void Retroceder(View view){
        //finish() tambien puede ser utilizado
        Intent retroceder = new Intent(this,MainActivity.class);
        startActivity(retroceder);
    }
    //metodo para ingresar a registrse en aviones
    public void InAviones(View view){
        //Intent inaviones = new Intent(this,Aviones.class);
        Intent inaviones = new Intent(this,ElijaAsiento.class);
        startActivity(inaviones);
    }
}
