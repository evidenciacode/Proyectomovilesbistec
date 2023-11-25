package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PesoActivity extends AppCompatActivity {

    Spinner spinnerPeso;
    EditText valorPeso;
    Button btnCalcularPeso;
    TextView resultadoPeso;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        Spinner spinnerPeso = findViewById(R.id.spinnerPeso);
        EditText valorPeso = findViewById(R.id.valorPeso);
        Button btnCalcularPeso = findViewById(R.id.btnCalcularPeso);
        TextView resultadoPeso = findViewById(R.id.resultadoPeso);
        btnregresar = findViewById(R.id.btnregresar3);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




        btnCalcularPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerPeso.getSelectedItem().toString();
                double valor = Double.parseDouble(valorPeso.getText().toString());
                if (paisSeleccionado.equals("Kilogramos->Libras")) {
                    Peso peso = new Peso("Kilogramos", "Libras");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
                if (paisSeleccionado.equals("Libras->Kilogramos")) {
                    Peso peso = new Peso("Libras", "Kilogramos");
                    resultadoPeso.setText(String.valueOf(peso.convertir(valor)));
                }
            }
        });
    }
}