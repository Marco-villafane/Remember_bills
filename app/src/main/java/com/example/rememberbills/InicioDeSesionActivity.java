package com.example.rememberbills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InicioDeSesionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_de_sesion);

        //inicializar
        EditText email,contraseña;
        Button btn_login;

        //declarar
        email=findViewById(R.id.email_login);
        contraseña=findViewById(R.id.password_login);
        btn_login=findViewById(R.id.boton_login);


        //crear evento
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("Patopato@gmail.com") && contraseña.getText().toString().equals("pato123")) {
                    Toast.makeText(InicioDeSesionActivity.this, "Inicio Exitoso", Toast.LENGTH_SHORT).show();
                    Intent goMain = new Intent(InicioDeSesionActivity.this, main_page.class);
                    startActivity(goMain);
                }else {
                    Toast.makeText(InicioDeSesionActivity.this, "Inicio Fallido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}