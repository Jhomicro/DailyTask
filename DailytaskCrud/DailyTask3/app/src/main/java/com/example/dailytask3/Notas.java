package com.example.dailytask3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Notas extends AppCompatActivity {
    //Inicializando Variables
    ImageButton Bretroceder;
    ImageButton Bt_microfono;
    ImageButton Bt_agregar;
    LinearLayout tareas;
    LinearLayout estadisticas;
    LinearLayout main;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        Bretroceder=(ImageButton)findViewById(R.id.Bretroceder);//Inicializando BTN retroceder
        Bt_agregar=(ImageButton)findViewById(R.id.Bt_agregar);//Inicializando BTN agregar tarea
        tareas=(LinearLayout)findViewById(R.id.tareas);//Button Layout homework
        estadisticas=(LinearLayout)findViewById(R.id.estadisticas);//Button layout statistics
        main=(LinearLayout)findViewById(R.id.main);//Button layout main

        //Llamado a actividad retroceder
        Bretroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bretroceder=new Intent(Notas.this, MainActivity.class);
                startActivities(new Intent[]{Bretroceder});
            }
        });
        //LLamado a actividad agregar tarea
        Bt_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt_agregar=new Intent(Notas.this, Agregar.class);
                startActivities(new Intent[]{Bt_agregar});
            }
        });

        //Inicio de los llamados a otras actividades
        //Llamado a frame de mis tareas
        tareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tareas = new Intent(Notas.this, Notas.class);
                startActivities(new Intent[]{tareas});
            }
        });
        //LLamado a frame de mis estadisticas
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent estadisticas= new Intent(Notas.this, Estadisticas.class);
                startActivities(new Intent[]{estadisticas});
            }
        });
        //Llamado a frame de Inicio
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Notas.this, MainActivity.class);
                startActivities(new Intent[]{main});
            }
        });

    }
}