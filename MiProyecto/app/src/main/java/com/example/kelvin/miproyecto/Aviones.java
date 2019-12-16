package com.example.kelvin.miproyecto;

import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Aviones extends AppCompatActivity {

    private EditText proced,destino,nombre,dni;
    private TextView asiento,asienPasa,clase;
    private RadioButton clasef,claseg;
    private TextView MosNombre,MosClase1,MosProceds,MosDestino;
    private Spinner spinfecha,spinhora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviones);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

        proced = (EditText)findViewById(R.id.rpta3);
        destino = (EditText)findViewById(R.id.rpta4);
        nombre = (EditText)findViewById(R.id.rpta5);
        dni = (EditText)findViewById(R.id.rpta6);
        asiento = (TextView) findViewById(R.id.asientoN);
        asienPasa = (TextView)findViewById(R.id.resultado);
        clase = (TextView) findViewById(R.id.clasedef);


        clasef = (RadioButton)findViewById(R.id.bt1);
        claseg = (RadioButton)findViewById(R.id.bt2);

        //produciendo fechas y horarios
        spinfecha = (Spinner)findViewById(R.id.spinfecha);
        spinhora = (Spinner)findViewById(R.id.spinhora);

        String [] opc1 = {"01-Jul","03-Jul","05-Jul","08-Jul","10-Jul","12-Jul","15-Jul","17-Jul","19-Jul","22-Jul","24-Jul","26-Jul","29-Jul","31-Jul"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.diseno_del_spinner,opc1);
        spinfecha.setAdapter(adapter1);

        String [] opc2 = {"05:00","07:00","09:00","11:00","13:00","15:00","17:00","19:00","21:00"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.diseno_del_spinner,opc2);
        spinhora.setAdapter(adapter2);

        //resuperando el dato enviado de la clase ElijaAsiento y mostrando el numero de asiento
        String Nroasiento = getIntent().getStringExtra("eljasiento");
        System.out.println(Nroasiento);
        asiento.setText(Nroasiento);

        int i = Integer.valueOf(Nroasiento);
        System.out.println(i);
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7 || i==8 || i==29 || i==30 || i==31 || i==32 || i==33 || i==34 || i==35 || i==36){
            clase.setText("VIP");
        }else if(i==9 || i==10 || i==11 || i==12 || i==37 || i==38 || i==39 || i==40){
            clase.setText("Ejecutiva");
        }else {
            clase.setText("Economica");
        }


        int Nroasientint = Integer.valueOf(Nroasiento);
        switch (Nroasientint){
            case 1:
                asienPasa.setText("A1");
                break;
            case 2:
                asienPasa.setText("B1");
                break;
            case 3:
                asienPasa.setText("E1");
                break;
            case 4:
                asienPasa.setText("F1");
                break;
            case 5:
                asienPasa.setText("A2");
                break;
            case 6:
                asienPasa.setText("B2");
                break;
            case 7:
                asienPasa.setText("E2");
                break;
            case 8:
                asienPasa.setText("F2");
                break;
            case 9:
                asienPasa.setText("A3");
                break;
            case 10:
                asienPasa.setText("C3");
                break;
            case 11:
                asienPasa.setText("D3");
                break;
            case 12:
                asienPasa.setText("F3");
                break;
            case 13:
                asienPasa.setText("A4");
                break;
            case 14:
                asienPasa.setText("C4");
                break;
            case 15:
                asienPasa.setText("D4");
                break;
            case 16:
                asienPasa.setText("F4");
                break;
            case 17:
                asienPasa.setText("A5");
                break;
            case 18:
                asienPasa.setText("C5");
                break;
            case 19:
                asienPasa.setText("D5");
                break;
            case 20:
                asienPasa.setText("F5");
                break;
            case 21:
                asienPasa.setText("A6");
                break;
            case 22:
                asienPasa.setText("C6");
                break;
            case 23:
                asienPasa.setText("D6");
                break;
            case 24:
                asienPasa.setText("F6");
                break;
            case 25:
                asienPasa.setText("A7");
                break;
            case 26:
                asienPasa.setText("C7");
                break;
            case 27:
                asienPasa.setText("D7");
                break;
            case 28:
                asienPasa.setText("F7");
                break;
            case 29:
                asienPasa.setText("A8");
                break;
            case 30:
                asienPasa.setText("C8");
                break;
            case 31:
                asienPasa.setText("D8");
                break;
            case 32:
                asienPasa.setText("F8");
                break;
            case 33:
                asienPasa.setText("A9");
                break;
            case 34:
                asienPasa.setText("C9");
                break;
            case 35:
                asienPasa.setText("D9");
                break;
            case 36:
                asienPasa.setText("F9");
                break;
            case 37:
                asienPasa.setText("A10");
                break;
            case 38:
                asienPasa.setText("C10");
                break;
            case 39:
                asienPasa.setText("D10");
                break;
            case 40:
                asienPasa.setText("F10");
                break;
            case 41:
                asienPasa.setText("A11");
                break;
            case 42:
                asienPasa.setText("C11");
                break;
            case 43:
                asienPasa.setText("D11");
                break;
            case 44:
                asienPasa.setText("F11");
                break;
            case 45:
                asienPasa.setText("A12");
                break;
            case 46:
                asienPasa.setText("C12");
                break;
            case 47:
                asienPasa.setText("D12");
                break;
            case 48:
                asienPasa.setText("F12");
                break;
            case 49:
                asienPasa.setText("A13");
                break;
            case 50:
                asienPasa.setText("C13");
                break;
            case 51:
                asienPasa.setText("D13");
                break;
            case 52:
                asienPasa.setText("F13");
                break;
            case 53:
                asienPasa.setText("A14");
                break;
            case 54:
                asienPasa.setText("C14");
                break;
            case 55:
                asienPasa.setText("D14");
                break;
            case 56:
                asienPasa.setText("F14");
                break;
            case 57:
                asienPasa.setText("A15");
                break;
            case 58:
                asienPasa.setText("C15");
                break;
            case 59:
                asienPasa.setText("D15");
                break;
            case 60:
                asienPasa.setText("F15");
                break;
            case 61:
                asienPasa.setText("A16");
                break;
            case 62:
                asienPasa.setText("C16");
                break;
            case 63:
                asienPasa.setText("D16");
                break;
            case 64:
                asienPasa.setText("F16");
                break;
            case 65:
                asienPasa.setText("A17");
                break;
            case 66:
                asienPasa.setText("C17");
                break;
            case 67:
                asienPasa.setText("D17");
                break;
            case 68:
                asienPasa.setText("F17");
                break;
            case 69:
                asienPasa.setText("A18");
                break;
            case 70:
                asienPasa.setText("C18");
                break;
            case 71:
                asienPasa.setText("D18");
                break;
            case 72:
                asienPasa.setText("F18");
                break;
            case 73:
                asienPasa.setText("A19");
                break;
            case 74:
                asienPasa.setText("C19");
                break;
            case 75:
                asienPasa.setText("D19");
                break;
            case 76:
                asienPasa.setText("F19");
                break;
            case 77:
                asienPasa.setText("A20");
                break;
            case 78:
                asienPasa.setText("C20");
                break;
            case 79:
                asienPasa.setText("D20");
                break;
            case 80:
                asienPasa.setText("F20");
                break;
        }

        //listando

        MosNombre = (TextView)findViewById(R.id.mos1);
        MosClase1 = (TextView)findViewById(R.id.mos2);
        MosProceds = (TextView)findViewById(R.id.mos3);
        MosDestino = (TextView)findViewById(R.id.mos4);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_aviones, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        //extraendo numero aleatorio
        int aleatorio1 = 0;
        aleatorio1 = (int) (Math.random()*(336-330)+330);
        System.out.println(aleatorio1);
        String castRandmF = String.valueOf(aleatorio1);

        int aleatorio2 = 0;
        aleatorio2 = (int) (Math.random()*(341-337)+337);
        System.out.println(aleatorio2);
        String castRandmG = String.valueOf(aleatorio2);

        //colocando la categoria clase segun el asiento
        //verificando la clase y su costo
        String Nroasiento = getIntent().getStringExtra("eljasiento");
        System.out.println(Nroasiento);

        int i = Integer.valueOf(Nroasiento);
        int costo=0;
        if(i==1 || i==2 || i==3 || i==4 || i==5 || i==6 || i==7 || i==8 || i==29 || i==30 || i==31 || i==32 || i==33 || i==34 || i==35 || i==36){
            costo = 365;
        }else if(i==9 || i==10 || i==11 || i==12 || i==37 || i==38 || i==39 || i==40){
            costo = 256;
        }else{
            costo = 125;
        }

        int veriCosto = costo;
        String veriCostoS = String.valueOf(veriCosto);
        String CostoDolar = "$" + veriCostoS;

        //recuperando datos de spinner
        String spFecha = spinfecha.getSelectedItem().toString();
        String spHora = spinhora.getSelectedItem().toString();

        int id = item.getItemId();
        switch (id){
            case R.id.Registrar:
                if(verificar()== true){
                    try{
                        BDcontenido conexion = new BDcontenido(this,"AEROLINEAS",null,1);
                        //abriendo la base de datos en modo lectura y escritura
                        SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();
                        StringBuilder sql = new StringBuilder();

                        String respuest = "";

                        if(clasef.isChecked()){
                            respuest = "F"+castRandmF;

                        }else if(claseg.isChecked()){
                            respuest = "G"+castRandmG;
                        }

                        String dato = respuest;

                        sql.append("INSERT INTO AVIONES (ASIENTOS, CLASES, PROCEDS, DESTINOS, NOMBRES, DNIS, FECHAS, HORASG, LUGARS, POSASIENTO, PRECIOS) VALUES ('");
                        sql.append(asiento.getText().toString().trim() + "', '");
                        sql.append(clase.getText().toString().trim() + "', '");
                        sql.append(proced.getText().toString().trim() + "', '");
                        sql.append(destino.getText().toString().trim() + "', '");
                        sql.append(nombre.getText().toString().trim() + "', '");
                        sql.append(dni.getText().toString().trim() + "', '");
                        sql.append(spFecha + "', '");
                        sql.append(spHora+ "', '");
                        sql.append(dato + "', '");
                        sql.append(asienPasa.getText().toString().trim() + "', '");
                        sql.append(CostoDolar +"')");

                        Toast.makeText(this, "REGISTRO CON EXITO", Toast.LENGTH_SHORT).show();
                        BaseDeDatos.execSQL(sql.toString());
                        BaseDeDatos.close();
                    }catch (Exception ex){
                        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                        dlg.setTitle("Aviso");
                        dlg.setMessage(ex.getMessage());
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                    String AsientoN = getIntent().getStringExtra("eljasiento");
                    if (!AsientoN.isEmpty()) {

                        BDcontenido conexion = new BDcontenido(this,"AEROLINEAS",null,1);
                        SQLiteDatabase BaseDeDatos1 = conexion.getWritableDatabase();

                        Cursor fila = BaseDeDatos1.rawQuery("select NOMBRES, LUGARS, PROCEDS, DESTINOS from AVIONES where ASIENTOS=" + AsientoN, null);



                        if (fila.moveToFirst()) {
                            MosNombre.setText(fila.getString(0));
                            MosClase1.setText(fila.getString(1));
                            MosProceds.setText(fila.getString(2));
                            MosDestino.setText(fila.getString(3));
                            BaseDeDatos1.close();
                        }
                    }else {
                        Toast.makeText(this, "por favor, coloque el numero del asiento para ver los contenidos", Toast.LENGTH_SHORT).show();
                    }

                } else{
                    Toast.makeText(this, "POR FAVOR,RELLENO TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Siguiente:
                if (verificar()==true){
                    Intent opc = new Intent(this,Avionesopciones.class);
                    startActivity(opc);
                    break;
                }else{
                    Toast.makeText(this, "POR FAVOR,RELLENE TODOS LOS CAMPOS PARA PROSEGUIR", Toast.LENGTH_SHORT).show();
                    break;
                }
        }
        return super.onOptionsItemSelected(item);
    }
    private boolean verificar(){
        boolean result = true;

        if(clase.getText().toString().trim().isEmpty()){
            clase.requestFocus();
            result=false;
        }
        if(proced.getText().toString().trim().isEmpty()){
            proced.requestFocus();
            result=false;
        }
        if(destino.getText().toString().trim().isEmpty()){
            destino.requestFocus();
            result=false;
        }
        if(nombre.getText().toString().trim().isEmpty()){
            nombre.requestFocus();
            result=false;
        }
        if(dni.getText().toString().trim().isEmpty()){
            dni.requestFocus();
            result=false;
        }
        if(spinfecha.getSelectedItem().toString().trim().isEmpty()){
            spinfecha.requestFocus();
            result=false;
        }
        if(spinhora.getSelectedItem().toString().trim().isEmpty()){
            spinhora.requestFocus();
            result=false;
        }
        if(asiento.getText().toString().trim().isEmpty()){
            asiento.requestFocus();
            result=false;
        }
        return result;
    }
}
