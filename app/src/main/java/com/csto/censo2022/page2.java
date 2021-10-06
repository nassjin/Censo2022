package com.csto.censo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    ImageButton  add;

    TextView totaltotal, totalhombre,totalmujer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        add = (ImageButton) findViewById(R.id.imageButton);
        totaltotal = (TextView)findViewById(R.id.txt_total);
        totalhombre = (TextView)findViewById(R.id.txt_hombres);
        totalmujer = (TextView)findViewById(R.id.txt_mujeres);

        /*Bundle B = getIntent().getExtras();
        Integer TOTAL = B.getInt("TOTAL");
        Integer HOMBRE = B.getInt("HOMBRE");
        Integer MUJER = B.getInt("MUJER");

        totaltotal.setText(TOTAL);
        totalhombre.setText(HOMBRE);
        totalmujer.setText(MUJER);*/



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),pege3.class);
                startActivity(I);
            }
        });
    }

    public void actualizar(){
        Bundle B = getIntent().getExtras();
        Integer TOTAL = B.getInt("TOTAL");
        Integer HOMBRE = B.getInt("HOMBRE");
        Integer MUJER = B.getInt("MUJER");

        totaltotal.setText(TOTAL);
        totalhombre.setText(HOMBRE);
        totalmujer.setText(MUJER);
    }
}