package com.example.rememberbills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class main_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        //inicializar
        ImageView btn_gastos;

        //declarar
        btn_gastos=findViewById(R.id.btn_gastos);

        //crear evento
        btn_gastos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goGastos = new Intent(main_page.this, apartado_de_gastos.class);
                startActivity(goGastos);
            }
        });
    }
}