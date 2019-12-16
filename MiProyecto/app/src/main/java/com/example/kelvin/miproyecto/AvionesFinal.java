package com.example.kelvin.miproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

public class AvionesFinal extends AppCompatActivity {
    private TextView asiento, moss1, moss2, moss3, moss4, moss5, moss6, moss7, moss8, moss9, moss10, moss11, moss12, moss13, moss14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviones_final);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

        //muestra del numero de asiento
        asiento = (TextView)findViewById(R.id.asiento);
        String Nroasiento = getIntent().getStringExtra("irAsien");
        asiento.setText(Nroasiento);

        moss1 = (TextView)findViewById(R.id.mos1);
        moss2 = (TextView)findViewById(R.id.moss2);
        moss3 = (TextView)findViewById(R.id.moss3);
        moss4 = (TextView)findViewById(R.id.moss4);
        moss5 = (TextView)findViewById(R.id.moss5);
        moss6 = (TextView)findViewById(R.id.moss6);
        moss7 = (TextView)findViewById(R.id.moss7);
        moss8 = (TextView)findViewById(R.id.moss8);
        moss9 = (TextView)findViewById(R.id.moss9);
        moss10 = (TextView)findViewById(R.id.moss10);
        moss11 = (TextView)findViewById(R.id.moss11);
        moss12 = (TextView)findViewById(R.id.moss12);
        moss13 = (TextView)findViewById(R.id.moss13);
        listado();
    }


    public void listado() {
        String AsientoN = getIntent().getStringExtra("irAsien");
        if (!AsientoN.isEmpty()) {

            BDcontenido conexion = new BDcontenido(this, "AEROLINEAS", null, 1);
            SQLiteDatabase BaseDeDatos1 = conexion.getWritableDatabase();

            Cursor fila = BaseDeDatos1.rawQuery("select CLASES, PROCEDS, DESTINOS, NOMBRES, DNIS, FECHAS, HORASG, LUGARS, PRECIOS from AVIONES where ASIENTOS=" + AsientoN, null);

            if (fila.moveToFirst()) {
                moss1.setText(fila.getString(0));
                moss2.setText(fila.getString(1));
                moss3.setText(fila.getString(2));
                moss4.setText(fila.getString(3));
                moss5.setText(fila.getString(4));
                moss6.setText(fila.getString(5));
                moss7.setText(fila.getString(6));
                moss8.setText(fila.getString(7));
                moss9.setText(fila.getString(8));
                moss10.setText(fila.getString(3));
                moss11.setText(fila.getString(7));
                moss12.setText(fila.getString(1));
                moss13.setText(fila.getString(2));
                BaseDeDatos1.close();
            }
            Toast.makeText(this, "PASAJE COMPLETO,POR FAVOR PROCEDA A RETIRAR SU BOLETO", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_final, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.Back:
                Intent back = new Intent(this,Fotopasaje.class);
                startActivity(back);
                break;
            case R.id.Inicio:
                Intent inicio = new Intent(this,MainActivity.class);
                startActivity(inicio);
                break;
            /*case R.id.salir:
                break;*/
            //destroy
        }

        return super.onOptionsItemSelected(item);

    }

}