package com.example.kelvin.miproyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kelvin.miproyecto.Basededatos.BDcontenido;

public class Fotopasaje extends AppCompatActivity {

    private ImageView fotografia;
    private EditText textnumero;
    private TextView textasien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotopasaje);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);

        fotografia = (ImageView)findViewById(R.id.image);
        textnumero = (EditText)findViewById(R.id.textnumero);
        textasien = (TextView)findViewById(R.id.textasien);

        //Notificacion para el usuario para poder acceder a la camara
        if (ContextCompat.checkSelfPermission(Fotopasaje.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(Fotopasaje.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Fotopasaje.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1000); }
    }

    //recuperando el menu_camara
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_camara, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.tomarfoto:
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
                break;
            case R.id.BuscarAsien:

                String sAsiento = textnumero.getText().toString();
                try {
                    BDcontenido conexion = new BDcontenido(this, "AEROLINEAS", null, 1);
                    SQLiteDatabase BaseDeDatos = conexion.getWritableDatabase();

                    if (!sAsiento.isEmpty()) {
                        Cursor fila = BaseDeDatos.rawQuery("select POSASIENTO from AVIONES where ASIENTOS=" + sAsiento, null);

                        if (fila.moveToFirst()) {
                            textasien.setText(fila.getString(0));
                            BaseDeDatos.close();
                        }
                    } else {
                        Toast.makeText(this, "por favor, coloque el numero del asiento para ver su posicion", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception ex) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                    dlg.setTitle("Aviso");
                    dlg.setMessage(ex.getMessage());
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }
                break;

            case R.id.siguiente:
                String pAsiento = textnumero.getText().toString();
                Intent irsigue = new Intent(this,AvionesFinal.class);
                irsigue.putExtra("irAsien",pAsiento);
                startActivity(irsigue);
                break;
            case R.id.anterior:
                Intent iratras = new Intent(this,Avionesopciones.class);
                startActivity(iratras);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);

        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        fotografia.setImageBitmap(bitmap);
    }
}
