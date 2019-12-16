package com.example.kelvin.miproyecto.Basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


//administrar la base de datos
public class BDcontenido extends SQLiteOpenHelper {


    public BDcontenido(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);// esto  debe ser indicado desde la clase BDcontenido
        //super(context,"AEROLINEAS",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {//constructor el nombre de mi base de datos=BasedeDatos

            StringBuilder sql = new StringBuilder();

            sql.append("CREATE TABLE IF NOT EXISTS AVIONES(");
            sql.append("ASIENTOS VARCHAR(20) PRIMARY KEY, ");
            sql.append("CLASES VARCHAR(20), ");
            sql.append("PROCEDS VARCHAR(20), ");
            sql.append("DESTINOS VARCHAR(20), ");
            sql.append("NOMBRES VARCHAR(30), ");
            sql.append("DNIS VARCHAR(8), ");
            sql.append("FECHAS VARCHAR(8), ");
            sql.append("HORASG VARCHAR(8), ");
            sql.append("LUGARS VARCHAR(20), ");
            sql.append("POSASIENTO VARCHAR(20), ");
            sql.append("PRECIOS VARCHAR(20) )");

            BaseDeDatos.execSQL(sql.toString());


        //BaseDeDatos.execSQL("CREATE TABLE IF NOT EXISTS avionesdb(asientos text primary key, clases text, procedencias text, destinos text, nombres text, dnis text, fechas text, horas text, lugars text)");
        //BaseDeDatos.execSQL("CREATE TABLE IF NOT EXISTS avionesdb(asientor text primary key, claser text, fechar date, lugarr text, dnir int, horar time, destinor text, procedenciar text, nombrer text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
