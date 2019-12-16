package com.example.kelvin.miproyecto;

import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Avionesactualizar extends AppCompatActivity {

    private EditText result1,result3,result4,result5,result6,result7,result8;
    private TextView result9;
    private Spinner spinfecha,spinhora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avionesactualizar);

        result1 = (EditText)findViewById(R.id.rpta1);//asiento por buscar
        result3 = (EditText)findViewById(R.id.rpta3);
        result4 = (EditText)findViewById(R.id.rpta4);
        result5 = (EditText)findViewById(R.id.rpta5);
        result6 = (EditText)findViewById(R.id.rpta6);

        result9 = (TextView)findViewById(R.id.rpta9);

        spinfecha = (Spinner)findViewById(R.id.spfecha);
        spinhora = (Spinner)findViewById(R.id.sphora);

        String [] opc1 = {"01-Jul","03-Jul","05-Jul","08-Jul","10-Jul","12-Jul","15-Jul","17-Jul","19-Jul","22-Jul","24-Jul","26-Jul","29-Jul","31-Jul"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.diseno_del_spinner,opc1);
        spinfecha.setAdapter(adapter1);

        String [] opc2 = {"05:00","07:00","09:00","11:00","13:00","15:00","17:00","19:00","21:00"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.diseno_del_spinner,opc2);
        spinhora.setAdapter(adapter2);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_actualizar, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        //recuperando los datos del spinner
        String spFecha = spinfecha.getSelectedItem().toString();
        String spHora = spinhora.getSelectedItem().toString();

        String AsientoN = result1.getText().toString();
        int id = item.getItemId();
        switch (id){
            case R.id.Buscar:
                try {
                    BDcontenido conexion = new BDcontenido(this, "AEROLINEAS", null, 1);
                    SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();

                    if (!AsientoN.isEmpty()) {
                        Cursor fila = BaseDeDatos.rawQuery("select POSASIENTO, PROCEDS, DESTINOS, NOMBRES, DNIS from AVIONES where ASIENTOS=" + AsientoN, null);

                        if (fila.moveToFirst()) {
                            result9.setText(fila.getString(0));
                            result3.setText(fila.getString(1));
                            result4.setText(fila.getString(2));
                            result5.setText(fila.getString(3));
                            result6.setText(fila.getString(4));
                            BaseDeDatos.close();
                        }
                    } else {
                        Toast.makeText(this, "por favor, coloque el numero del asiento para ver los contenidos", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception ex) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                    dlg.setTitle("Aviso");
                    dlg.setMessage(ex.getMessage());
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }
                break;

            case R.id.Modificar:


                BDcontenido conexion = new BDcontenido(this, "AEROLINEAS", null, 1);
                SQLiteDatabase BaseDatabase = conexion.getWritableDatabase();


                String Proceds = result3.getText().toString();
                String Destinos= result4.getText().toString();
                String Nombres= result5.getText().toString();
                String Dnis= result6.getText().toString();

                if(Verificar() == true){

                    ContentValues registro = new ContentValues();
                    registro.put("PROCEDS", Proceds);
                    registro.put("DESTINOS", Destinos);
                    registro.put("NOMBRES", Nombres);
                    registro.put("DNIS", Dnis);
                    registro.put("FECHAS", spFecha);
                    registro.put("HORASG", spHora);

                    int actualizar = BaseDatabase.update("AVIONES", registro, "ASIENTOS=" + AsientoN, null);
                    BaseDatabase.close();

                    if(actualizar == 1){
                        Toast.makeText(this, "Pasaje modificado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "El asiento esta desocupado, puede registrarse", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Atras2:
                Intent irAtras = new Intent(this,Avionesopciones.class);
                startActivity(irAtras);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean Verificar(){
        boolean result = true;

        if(result1.getText().toString().trim().isEmpty()){
            result1.requestFocus();
            result=false;
        }
        if(result3.getText().toString().trim().isEmpty()){
            result3.requestFocus();
            result=false;
        }
        if(result4.getText().toString().trim().isEmpty()){
            result4.requestFocus();
            result=false;
        }
        if(result5.getText().toString().trim().isEmpty()){
            result5.requestFocus();
            result=false;
        }
        if(result6.getText().toString().trim().isEmpty()) {
            result6.requestFocus();
            result = false;
        }
        if(spinfecha.getSelectedItem().toString().trim().isEmpty()){
            spinfecha.requestFocus();
            result=false;
        }
        if(spinhora.getSelectedItem().toString().trim().isEmpty()){
            spinhora.requestFocus();
            result=false;
        }
        return result;
    }

}
