package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTemperatura;
    Button btnPeso;
    Button btnLongitud;
    Button btnDivisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTemperatura = findViewById(R.id.btnCalcularTemperatura);
        btnPeso = findViewById(R.id.btnPeso);
        btnLongitud = findViewById(R.id.btnLongitud);
        btnDivisa = findViewById(R.id.btnDivisa);

        btnTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TemperaturaActivity.class);
                startActivity(intent);
            }
        });

        btnPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PesoActivity.class);
                startActivity(intent);
            }
        });

        btnLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LongitudActivity.class);
                startActivity(intent);
            }
        });

        btnDivisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DivisaActivity.class);
                startActivity(intent);
            }
        });
    }
}


