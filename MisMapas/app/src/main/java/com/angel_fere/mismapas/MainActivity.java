package com.angel_fere.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView catedral,mercado_dulces,patzcuaro,tarascas;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catedral = (ImageView) findViewById(R.id.catedral);
        mercado_dulces = (ImageView) findViewById(R.id.mercado_dulces);
        patzcuaro = (ImageView) findViewById(R.id.patzcuaro);
        tarascas = (ImageView) findViewById(R.id.tarascas);

        catedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catedral = new Intent(MainActivity.this, Mapas.class);
                catedral.putExtra("latitud",19.702423);
                catedral.putExtra("longitud",-101.1923185);
                startActivity(catedral);
            }
        });

        mercado_dulces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catedral = new Intent(MainActivity.this, Mapas.class);
                catedral.putExtra("latitud",19.7037391);
                catedral.putExtra("longitud",-101.1958009);
                startActivity(catedral);
            }
        });


        patzcuaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catedral = new Intent(MainActivity.this, Mapas.class);
                catedral.putExtra("latitud",19.5134546);
                catedral.putExtra("longitud",-101.60918759999998);
                startActivity(catedral);
            }
        });

        tarascas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catedral = new Intent(MainActivity.this, Mapas.class);
                catedral.putExtra("latitud",19.7028642);
                catedral.putExtra("longitud",-101.1823382);
                startActivity(catedral);
            }
        });



    }




}
