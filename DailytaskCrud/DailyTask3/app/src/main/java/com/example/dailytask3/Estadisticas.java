package com.example.dailytask3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Estadisticas extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        //Inicialización
        ImageView logeo;
        LinearLayout tareas;
        LinearLayout estadisticas;
        LinearLayout main;

        logeo=(ImageView)findViewById(R.id.logeo);//Button layout Homework
        tareas=(LinearLayout)findViewById(R.id.tareas);//Button Layout homework
        estadisticas=(LinearLayout)findViewById(R.id.estadisticas);//Button layout statistics
        main=(LinearLayout)findViewById(R.id.main);//Button layout main

        //Inicio de los llamados a otras actividades

        //Llamado a frame de login
        logeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logeo = new Intent(Estadisticas.this, Login.class);
                startActivities(new Intent[]{logeo});
            }
        });
        //Llamado a frame de mis tareas
        tareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tareas = new Intent(Estadisticas.this, Notas.class);
                startActivities(new Intent[]{tareas});
            }
        });
        //LLamado a frame de mis estadisticas
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent estadisticas= new Intent(Estadisticas.this, Estadisticas.class);
                startActivities(new Intent[]{estadisticas});
            }
        });
        //Llamado a frame de Inicio
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Estadisticas.this, MainActivity.class);
                startActivities(new Intent[]{main});
            }
        });
    }
}