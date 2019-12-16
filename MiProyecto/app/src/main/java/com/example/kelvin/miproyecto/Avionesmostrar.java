package com.example.kelvin.miproyecto;
import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Avionesmostrar extends AppCompatActivity {


    private ListView Datoslistados;
    private ArrayAdapter<String> adaptador;
    private ArrayList<String> pasajero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avionesmostrar);
        ActualizarPasajeros();
    }

    private void ActualizarPasajeros() {
        Datoslistados = (ListView) findViewById(R.id.datoslist);
        pasajero = new ArrayList<String>();

        try{
            BDcontenido conexion = new BDcontenido(this,"AEROLINEAS",null,1);
            SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();

            StringBuilder sql = new StringBuilder();//generador de cadenas
            sql.append("SELECT * FROM AVIONES");
            String sAsiento;
            String sNombre;
            String sLugar;
            String sProcedencia;
            String sDestinos;
            String sFechas;
            String sHoras;
            String sPrecio;

            Cursor resultado = BaseDeDatos.rawQuery(sql.toString(), null);
            System.out.println(resultado.getCount());

            if (resultado.getCount() > 0 ){
                resultado.moveToFirst();
                do{
                    sAsiento = resultado.getString(resultado.getColumnIndex("ASIENTOS"));
                    sNombre = resultado.getString(resultado.getColumnIndexOrThrow("NOMBRES"));
                    sLugar = resultado.getString(resultado.getColumnIndexOrThrow("LUGARS"));
                    sProcedencia = resultado.getString(resultado.getColumnIndexOrThrow("PROCEDS"));
                    sDestinos = resultado.getString(resultado.getColumnIndexOrThrow("DESTINOS"));
                    sFechas = resultado.getString(resultado.getColumnIndexOrThrow("FECHAS"));
                    sHoras = resultado.getString(resultado.getColumnIndexOrThrow("HORASG"));
                    sPrecio = resultado.getString(resultado.getColumnIndexOrThrow("PRECIOS"));

                    pasajero.add("Asiento N°: "+sAsiento +"\n"+"Nombre: "+sNombre + "\n" + "Vuelo: "+ sLugar + "\n" + "Origen: "+ sProcedencia +"\n" + "Destino: "+ sDestinos +"\n"+ "Fechas de Abordaje: "+ sFechas +"\n" + "Hora de abordaje: " + sHoras +"\n"+ "Precio: "+ sPrecio);
                    System.out.println(pasajero);
                }
                while(resultado.moveToNext());
            }
            adaptador = new ArrayAdapter<String>(this, R.layout.diseno_del_listview, pasajero);//R.layout.diseno_del_listview = escojemos el diseño de la cle R creado por nosotros
            Datoslistados.setAdapter(adaptador);
            System.out.println(adaptador);

        }catch (Exception ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("OK",null);
            dlg.show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        ActualizarPasajeros();
    }



    public void regresar(View view){
        finish();
    }
}
