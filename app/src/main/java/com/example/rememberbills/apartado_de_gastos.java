package com.example.rememberbills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class apartado_de_gastos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartado_de_gastos);
        //inicializar
        ImageView btn_fijos;
        ImageView btn_propios;
        ImageView btn_comp;
        ImageView btn_impre;
        ImageView btn_recordatorios;

        //declarar
        btn_fijos=findViewById(R.id.btn_fijos);
        btn_propios=findViewById(R.id.btn_propios);
        btn_comp=findViewById(R.id.btn_comp);
        btn_impre=findViewById(R.id.btn_impre);
        btn_recordatorios=findViewById(R.id.btn_recordatorios);


        //crear evento
        btn_fijos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFijos = new Intent(apartado_de_gastos.this, gastos_fijos.class);
                startActivity(goFijos);
            }
        });
        btn_propios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPropios = new Intent(apartado_de_gastos.this, gastos_propios.class);
                startActivity(goPropios);
            }
        });
        btn_impre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goImprevistos = new Intent(apartado_de_gastos.this, gastos_imprevistos.class);
                startActivity(goImprevistos);
            }
        });
        btn_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goCompartidos = new Intent(apartado_de_gastos.this, gastos_compartidos.class);
                startActivity(goCompartidos);
            }
        });
    }
}