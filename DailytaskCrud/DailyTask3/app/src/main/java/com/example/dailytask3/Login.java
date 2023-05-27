package com.example.dailytask3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button registro;
        LinearLayout IGoogle;
        LinearLayout bfacebook;
        String urlg="https://acortar.link/F9zPFs";
        String urlF="https://www.facebook.com";

        //Función
        IGoogle=(LinearLayout)findViewById(R.id.IGoogle);

        IGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link1 = Uri.parse(urlg);
                Intent i = new Intent(Intent.ACTION_VIEW, link1);
                startActivities(new Intent[]{i});
                //Log.d("click", "ok");
            }
        });

        bfacebook=(LinearLayout)findViewById(R.id.bfacebook);

        bfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link2 = Uri.parse(urlF);
                Intent j = new Intent(Intent.ACTION_VIEW, link2);
                startActivities(new Intent[]{j});
            }
        });


        registro=(Button) findViewById(R.id.registro);//Button layout Homework

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Registrate = new Intent(Login.this, Registrate.class);
                startActivities(new Intent[]{Registrate});


            }
        });
    }
}