package com.csto.censo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText usuario , clave;
    Button btn_conectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.cjn_user);
        clave = (EditText) findViewById(R.id.cjn_clave);
        btn_conectar = (Button) findViewById((R.id.btn_conectar));

        btn_conectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usuario.getText().toString().equals("adm123") && clave.getText().toString().equals("adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),page2.class);
                    startActivity(I);

                }else{
                    Toast.makeText(getApplicationContext(),"EL USUARIO Y CONTRASEÑA SON INVALIDOS!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}