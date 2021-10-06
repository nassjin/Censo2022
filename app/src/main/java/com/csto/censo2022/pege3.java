package com.csto.censo2022;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class pege3 extends AppCompatActivity {

    EditText nombre, edad;
    Spinner genero;
    Button add1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pege3);

        nombre = (EditText) findViewById(R.id.cjn_nombre);
        edad = (EditText) findViewById(R.id.cjn_edad);
        genero = (Spinner) findViewById(R.id.spinner);
        add1 = (Button) findViewById(R.id.btn_agregar);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre.getText().toString().equals("") && edad.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "CAMPO Usuario Y CLAVE VACIOS!!",Toast.LENGTH_LONG).show();
                }else {
                    Dialogo();
                }
            }
        });

    }
    public void Dialogo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Atencion!");
        builder.setMessage("¿Esta Seguro de Continuar?");
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                String generos = genero.getSelectedItem().toString();
                Integer contHombres=0 , contMujeres=0;
                if (genero.equals("HOMBRE")){
                    contHombres ++;
                }
                if (genero.equals("MUJER")){
                    contMujeres++;
                }
                Intent I = new Intent(getApplicationContext(),page2.class);
                Integer Total = contHombres+contMujeres;
                I.putExtra("HOMBRE",contHombres);
                I.putExtra("MUJER",contMujeres);
                I.putExtra("TOTAL",Total);
                startActivity(I);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}