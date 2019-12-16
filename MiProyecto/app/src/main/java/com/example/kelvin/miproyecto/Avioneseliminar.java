package com.example.kelvin.miproyecto;

import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Avioneseliminar extends AppCompatActivity {


    private EditText NroAsiento;
    private ListView Datoslistados;
    private ArrayAdapter<String> adaptador;
    private ArrayList<String> pasajero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avioneseliminar);


        NroAsiento = (EditText)findViewById(R.id.pruebaNro);
        MostrarAsientos();
    }

    private void MostrarAsientos() {
        Datoslistados = (ListView) findViewById(R.id.listado);
        pasajero = new ArrayList<String>();

        try{
            BDcontenido conexion = new BDcontenido(this,"AEROLINEAS",null,1);
            SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT * FROM AVIONES");
            String sAsiento;
            String sNombre;
            String sPosAsiento;

            Cursor resultado = BaseDeDatos.rawQuery(sql.toString(), null);
            System.out.println(resultado.getCount());

            if (resultado.getCount() > 0 ){
                resultado.moveToFirst();
                do{
                    sAsiento = resultado.getString(resultado.getColumnIndex("ASIENTOS"));
                    sNombre = resultado.getString(resultado.getColumnIndexOrThrow("NOMBRES"));
                    sPosAsiento = resultado.getString(resultado.getColumnIndexOrThrow("POSASIENTO"));

                    pasajero.add("Asiento N°: "+sAsiento +"\n"+"Nombre: "+sNombre + "\n"+"Posicion del asiento: "+sPosAsiento);
                    System.out.println(pasajero);
                }
                while(resultado.moveToNext());
            }
            adaptador = new ArrayAdapter<String>(this, R.layout.diseno_del_listview, pasajero);
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

    public void Eliminar(View view){

        String NumberAsien = NroAsiento.getText().toString();

        try{
            BDcontenido conexion = new BDcontenido(this,"AEROLINEAS",null,1);
            SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();

            if(!NumberAsien.isEmpty()){
                int borrar = BaseDeDatos.delete("AVIONES","ASIENTOS=" + NumberAsien,null);
                BaseDeDatos.close();

                if(borrar == 1){
                    Toast.makeText(this, "El asiento esta ocupado y esta eliminado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "El asiento esta desocupado", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "Introduce el Nro del asiento", Toast.LENGTH_SHORT).show();
            }

        }catch (Exception ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("OK",null);
            dlg.show();
        }
        finish();
    }
}
