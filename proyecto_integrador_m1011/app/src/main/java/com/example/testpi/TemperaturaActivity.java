package com.example.testpi;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperaturaActivity extends AppCompatActivity {
    Spinner spinnerTemperatura;
    EditText valorTemperatura;
    Button btnCalcular;
    TextView resultadoTemperatura;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Spinner spinnerTemperatura = findViewById(R.id.spinnerTemperatura);
        EditText valorTemperatura = findViewById(R.id.valorTemperatura);
        Button btnCalcular = findViewById(R.id.btnCalcularTemperatura);
        TextView resultadoTemperatura = findViewById(R.id.resultadoTemperatura);

        btnregresar = findViewById(R.id.btnregresar1);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerTemperatura.getSelectedItem().toString();
                double valor = Double.parseDouble(valorTemperatura.getText().toString());
                if (paisSeleccionado.equals("Celsius->Fahrenheit")) {
                    Temperatura temperatura = new Temperatura("Celsius", "Fahrenheit");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
                if (paisSeleccionado.equals("Fahrenheit->Celsius")) {
                    Temperatura temperatura = new Temperatura("Fahrenheit", "Celsius");
                    resultadoTemperatura.setText(String.valueOf(temperatura.convertir(valor)));
                }
            }
        });
    }
}
