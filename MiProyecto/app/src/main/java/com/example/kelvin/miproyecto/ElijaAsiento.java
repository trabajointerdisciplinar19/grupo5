package com.example.kelvin.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ElijaAsiento extends AppCompatActivity {

    private Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,
            boton11,boton12,boton13,boton14,boton15,boton16,boton17,boton18,boton19,boton20,boton21,
            boton22,boton23,boton24,boton25,boton26,boton27,boton28,boton29,boton30,boton31,boton32,
            boton33,boton34,boton35,boton36,boton37,boton38,boton39,boton40,boton41,boton42,boton43,
            boton44,boton45,boton46,boton47,boton48,boton49,boton50,boton51,boton52,boton53,boton54,
            boton55,boton56,boton57,boton58,boton59,boton60,boton61,boton62,boton63,boton64,boton65,
            boton66,boton67,boton68,boton69,boton70,boton71,boton72,boton73,boton74,boton75,boton76,
            boton77,boton78,boton79,boton80;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elija_asiento);
        boton1 = (Button) findViewById(R.id.uno);
        boton2 = (Button)findViewById(R.id.dos);
        boton3 = (Button)findViewById(R.id.tres);
        boton4 = (Button)findViewById(R.id.cuatro);
        boton5 = (Button)findViewById(R.id.cinco);
        boton6 = (Button)findViewById(R.id.seis);
        boton7 = (Button)findViewById(R.id.siete);
        boton8 = (Button)findViewById(R.id.ocho);
        boton9 = (Button)findViewById(R.id.nueve);
        boton10 = (Button)findViewById(R.id.diez);
        boton11 = (Button)findViewById(R.id.once);
        boton12 = (Button)findViewById(R.id.doce);
        boton13 = (Button)findViewById(R.id.trece);
        boton14 = (Button)findViewById(R.id.catorce);
        boton15 = (Button)findViewById(R.id.quince);
        boton16 = (Button)findViewById(R.id.dieciseis);
        boton17 = (Button)findViewById(R.id.diecisiete);
        boton18 = (Button)findViewById(R.id.dieciocho);
        boton19 = (Button)findViewById(R.id.diecinueve);
        boton20 = (Button)findViewById(R.id.veinte);
        boton21 = (Button)findViewById(R.id.veintayuno);
        boton22 = (Button)findViewById(R.id.veintaydos);
        boton23 = (Button)findViewById(R.id.veintaytres);
        boton24 = (Button)findViewById(R.id.veintaycuatro);
        boton25 = (Button)findViewById(R.id.veintaycinco);
        boton26 = (Button)findViewById(R.id.veintayseis);
        boton27= (Button)findViewById(R.id.veintaysiete);
        boton28 = (Button)findViewById(R.id.veintayocho);
        boton29 = (Button)findViewById(R.id.veintaynueve);
        boton30 = (Button)findViewById(R.id.treinta);
        boton31 = (Button)findViewById(R.id.treintayuno);
        boton32 = (Button)findViewById(R.id.treintaydos);
        boton33 = (Button)findViewById(R.id.treintaytres);
        boton34 = (Button)findViewById(R.id.treintaycuatro);
        boton35 = (Button)findViewById(R.id.treintaycinco);
        boton36 = (Button)findViewById(R.id.treintayseis);
        boton37 = (Button)findViewById(R.id.treintaysiete);
        boton38 = (Button)findViewById(R.id.treintayocho);
        boton39 = (Button)findViewById(R.id.treintaynueve);
        boton40 = (Button)findViewById(R.id.cuarenta);
        boton41 = (Button)findViewById(R.id.cuarentayuno);
        boton42 = (Button)findViewById(R.id.cuarentaydos);
        boton43 = (Button)findViewById(R.id.cuarentaytres);
        boton44 = (Button)findViewById(R.id.cuarentaycuatro);
        boton45 = (Button)findViewById(R.id.cuarentaycinco);
        boton46 = (Button)findViewById(R.id.cuarentayseis);
        boton47 = (Button)findViewById(R.id.cuarentaysiete);
        boton48 = (Button)findViewById(R.id.cuarentayocho);
        boton49 = (Button)findViewById(R.id.cuarentaynueve);
        boton50 = (Button)findViewById(R.id.cincuenta);
        boton51 = (Button)findViewById(R.id.cincuentayuno);
        boton52 = (Button)findViewById(R.id.cincuentaydos);
        boton53 = (Button)findViewById(R.id.cincuentaytres);
        boton54 = (Button)findViewById(R.id.cincuentaycuatro);
        boton55 = (Button)findViewById(R.id.cincuentaycinco);
        boton56 = (Button)findViewById(R.id.cincuentayseis);
        boton57 = (Button)findViewById(R.id.cincuentaysiete);
        boton58 = (Button)findViewById(R.id.cincuentayocho);
        boton59 = (Button)findViewById(R.id.cincuentaynueve);
        boton60 = (Button)findViewById(R.id.sesenta);
        boton61 = (Button)findViewById(R.id.sesentayuno);
        boton62 = (Button)findViewById(R.id.sesentaydos);
        boton63 = (Button)findViewById(R.id.sesentaytres);
        boton64 = (Button)findViewById(R.id.sesentaycuatro);
        boton65 = (Button)findViewById(R.id.sesentaycinco);
        boton66 = (Button)findViewById(R.id.sesentayseis);
        boton67 = (Button)findViewById(R.id.sesentaysiete);
        boton68 = (Button)findViewById(R.id.sesentayocho);
        boton69 = (Button)findViewById(R.id.sesentaynueve);
        boton70 = (Button)findViewById(R.id.setenta);
        boton71 = (Button)findViewById(R.id.setentayuno);
        boton72 = (Button)findViewById(R.id.setentaydos);
        boton73 = (Button)findViewById(R.id.setentaytres);
        boton74 = (Button)findViewById(R.id.setentaycuatro);
        boton75 = (Button)findViewById(R.id.setentaycinco);
        boton76 = (Button)findViewById(R.id.setentayseis);
        boton77 = (Button)findViewById(R.id.setentaysiete);
        boton78 = (Button)findViewById(R.id.setentayocho);
        boton79 = (Button)findViewById(R.id.setentaynueve);
        boton80 = (Button)findViewById(R.id.ochenta);

        Toast.makeText(this, "POR FAVOR, ESCOJA SU ASIENTO", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_asientos, menu);

        return super.onCreateOptionsMenu(menu);
    }
    public void Seleccion(View view){
        int id = view.getId();
        if (id == R.id.uno){
            int a=1;
            String Nroasiento = String.valueOf(a);
            boton1.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);

        }
        else if (id == R.id.dos){
            int a=2;
            String Nroasiento = String.valueOf(a);
            boton2.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.tres){
            int a=3;
            String Nroasiento = String.valueOf(a);
            boton3.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuatro){
            int a=4;
            String Nroasiento = String.valueOf(a);
            boton4.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cinco){
            int a=5;
            String Nroasiento = String.valueOf(a);
            boton5.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.seis){
            int a=6;
            String Nroasiento = String.valueOf(a);
            boton6.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.siete){
            int a=7;
            String Nroasiento = String.valueOf(a);
            boton7.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.ocho){
            int a=8;
            String Nroasiento = String.valueOf(a);
            boton8.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.nueve){
            int a=9;
            String Nroasiento = String.valueOf(a);
            boton9.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.diez){
            int a=10;
            String Nroasiento = String.valueOf(a);
            boton10.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.once){
            int a=11;
            String Nroasiento = String.valueOf(a);
            boton11.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.doce){
            int a=12;
            String Nroasiento = String.valueOf(a);
            boton12.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.trece){
            int a=13;
            String Nroasiento = String.valueOf(a);
            boton13.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.catorce){
            int a=14;
            String Nroasiento = String.valueOf(a);
            boton14.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.quince){
            int a=15;
            String Nroasiento = String.valueOf(a);
            boton15.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.dieciseis){
            int a=16;
            String Nroasiento = String.valueOf(a);
            boton16.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.diecisiete){
            int a=17;
            String Nroasiento = String.valueOf(a);
            boton17.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.dieciocho){
            int a=18;
            String Nroasiento = String.valueOf(a);
            boton18.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.dieciocho){
            int a=19;
            String Nroasiento = String.valueOf(a);
            boton19.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veinte){
            int a=20;
            String Nroasiento = String.valueOf(a);
            boton20.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintayuno){
            int a=21;
            String Nroasiento = String.valueOf(a);
            boton21.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaydos){
            int a=22;
            String Nroasiento = String.valueOf(a);
            boton22.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaytres){
            int a=23;
            String Nroasiento = String.valueOf(a);
            boton23.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaycuatro){
            int a=24;
            String Nroasiento = String.valueOf(a);
            boton24.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaycinco){
            int a=25;
            String Nroasiento = String.valueOf(a);
            boton25.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintayseis){
            int a=26;
            String Nroasiento = String.valueOf(a);
            boton26.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaysiete){
            int a=27;
            String Nroasiento = String.valueOf(a);
            boton27.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintayocho){
            int a=28;
            String Nroasiento = String.valueOf(a);
            boton28.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.veintaynueve){
            int a=29;
            String Nroasiento = String.valueOf(a);
            boton29.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treinta){
            int a=30;
            String Nroasiento = String.valueOf(a);
            boton30.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintayuno){
            int a=31;
            String Nroasiento = String.valueOf(a);
            boton31.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaydos){
            int a=32;
            String Nroasiento = String.valueOf(a);
            boton32.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaytres){
            int a=33;
            String Nroasiento = String.valueOf(a);
            boton33.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaycuatro){
            int a=34;
            String Nroasiento = String.valueOf(a);
            boton34.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaycinco){
            int a=35;
            String Nroasiento = String.valueOf(a);
            boton35.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintayseis){
            int a=36;
            String Nroasiento = String.valueOf(a);
            boton36.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaysiete){
            int a=37;
            String Nroasiento = String.valueOf(a);
            boton37.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintayocho){
            int a=38;
            String Nroasiento = String.valueOf(a);
            boton38.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.treintaynueve){
            int a=39;
            String Nroasiento = String.valueOf(a);
            boton39.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarenta){
            int a=40;
            String Nroasiento = String.valueOf(a);
            boton40.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentayuno){
            int a=41;
            String Nroasiento = String.valueOf(a);
            boton41.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaydos){
            int a=42;
            String Nroasiento = String.valueOf(a);
            boton42.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaytres){
            int a=43;
            String Nroasiento = String.valueOf(a);
            boton43.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaycuatro){
            int a=44;
            String Nroasiento = String.valueOf(a);
            boton44.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaycinco){
            int a=45;
            String Nroasiento = String.valueOf(a);
            boton45.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentayseis){
            int a=46;
            String Nroasiento = String.valueOf(a);
            boton46.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaysiete){
            int a=47;
            String Nroasiento = String.valueOf(a);
            boton47.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentayocho){
            int a=48;
            String Nroasiento = String.valueOf(a);
            boton48.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cuarentaynueve){
            int a=49;
            String Nroasiento = String.valueOf(a);
            boton49.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuenta){
            int a=50;
            String Nroasiento = String.valueOf(a);
            boton50.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentayuno){
            int a=51;
            String Nroasiento = String.valueOf(a);
            boton51.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaydos){
            int a=52;
            String Nroasiento = String.valueOf(a);
            boton52.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaytres){
            int a=53;
            String Nroasiento = String.valueOf(a);
            boton53.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaycuatro){
            int a=54;
            String Nroasiento = String.valueOf(a);
            boton54.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaycinco){
            int a=55;
            String Nroasiento = String.valueOf(a);
            boton55.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentayseis){
            int a=56;
            String Nroasiento = String.valueOf(a);
            boton56.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaysiete){
            int a=57;
            String Nroasiento = String.valueOf(a);
            boton57.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentayocho){
            int a=58;
            String Nroasiento = String.valueOf(a);
            boton58.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.cincuentaynueve){
            int a=59;
            String Nroasiento = String.valueOf(a);
            boton59.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesenta){
            int a=60;
            String Nroasiento = String.valueOf(a);
            boton60.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentayuno){
            int a=61;
            String Nroasiento = String.valueOf(a);
            boton61.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaydos){
            int a=62;
            String Nroasiento = String.valueOf(a);
            boton62.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaytres){
            int a=63;
            String Nroasiento = String.valueOf(a);
            boton63.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaycuatro){
            int a=64;
            String Nroasiento = String.valueOf(a);
            boton64.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaycinco){
            int a=65;
            String Nroasiento = String.valueOf(a);
            boton65.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentayseis){
            int a=66;
            String Nroasiento = String.valueOf(a);
            boton66.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaysiete){
            int a=67;
            String Nroasiento = String.valueOf(a);
            boton67.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentayocho){
            int a=68;
            String Nroasiento = String.valueOf(a);
            boton68.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.sesentaynueve){
            int a=69;
            String Nroasiento = String.valueOf(a);
            boton69.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setenta){
            int a=70;
            String Nroasiento = String.valueOf(a);
            boton70.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentayuno){
            int a=71;
            String Nroasiento = String.valueOf(a);
            boton71.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaydos){
            int a=72;
            String Nroasiento = String.valueOf(a);
            boton72.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaytres){
            int a=73;
            String Nroasiento = String.valueOf(a);
            boton73.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaycuatro){
            int a=74;
            String Nroasiento = String.valueOf(a);
            boton74.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaycinco){
            int a=75;
            String Nroasiento = String.valueOf(a);
            boton75.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentayseis){
            int a=76;
            String Nroasiento = String.valueOf(a);
            boton76.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaysiete){
            int a=77;
            String Nroasiento = String.valueOf(a);
            boton77.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentayocho){
            int a=78;
            String Nroasiento = String.valueOf(a);
            boton78.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.setentaynueve){
            int a=79;
            String Nroasiento = String.valueOf(a);
            boton79.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }else if (id == R.id.ochenta){
            int a=80;
            String Nroasiento = String.valueOf(a);
            boton80.setEnabled(false);
            Toast.makeText(this, "Asiento Seleccionado", Toast.LENGTH_SHORT).show();
            Intent esco = new Intent(this,Aviones.class);
            esco.putExtra("eljasiento",Nroasiento);
            startActivity(esco);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        switch (id) {
            case R.id.AtrasAsient:
                Intent esco = new Intent(this,Configuracion_de_datos.class);
                startActivity(esco);

        }
        return super.onOptionsItemSelected(item);
    }
}
