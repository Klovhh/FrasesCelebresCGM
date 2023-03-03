package com.example.frasesclebrescgm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        //Aqui recibimos el intent y los valores que vienen con el, despues ese valor lo convertios a entero
        Intent intent = getIntent();
        String string = intent.getStringExtra("VALOR");
        int numero = Integer.parseInt(string);

        //Aqui instanciamos los componentes y asignamos apuntadores
        TextView nombre = findViewById(R.id.nombreAutor);
        TextView texto = findViewById(R.id.fraseAutor);
        ImageView imagen = findViewById(R.id.fotoAutor);

        //Estos if cambian el valor de las instancias basado en el numero recibido por el intent
        if (numero == 1){
            texto.setText(R.string.frase1);
            nombre.setText(R.string.nombre1);
            imagen.setImageResource(R.drawable.hemingway);

        } else if (numero == 2) {
            texto.setText(R.string.frase2);
            nombre.setText(R.string.nombre2);
            imagen.setImageResource(R.drawable.picasso);
        } else if (numero == 3) {
            texto.setText(R.string.frase3);
            nombre.setText(R.string.nombre3);
            imagen.setImageResource(R.drawable.miguel);

        }


    }
}