package com.example.frasesclebrescgm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer numero;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Aqui ponemos un apuntador
        textView = findViewById(R.id.textView);
        numero = 1;
    }

    public void launchSecondActivity(View view) {
        //Aqui creamos el intent y ponemos los extras dentro de este, nuestro extra sera un numero
        //generado aleatoriamente que pasamos a string e iniciamos el intent
        Intent intent = new Intent(this, SecondaryActivity.class);
        String texto = String.valueOf(numero);
        intent.putExtra("VALOR", texto);
        startActivity(intent);
    }

    public void generateRandom(View view) {
        //Aqui simplemente generamos un numero random entre 1 y 3 y mandamos un mensaje al log para
        //confirmar que se esta generando correctamente
        Random random = new Random();
        numero = random.nextInt(4-1)+1;
        textView.setText(String.format(Locale.getDefault(), "%d", numero));
        Log.d(LOG_TAG, "Se ha generado un nuevo numero!");
    }
}