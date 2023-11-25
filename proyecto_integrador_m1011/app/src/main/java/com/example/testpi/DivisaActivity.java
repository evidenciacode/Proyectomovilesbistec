package com.example.testpi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DivisaActivity extends AppCompatActivity {
    Spinner spinnerDivisa;
    EditText valorDivisa;
    Button btnCalcularDivisa;
    TextView resultadoDivisa;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisa);

        Spinner spinnerDivisa = findViewById(R.id.spinnerDivisa);
        EditText valorDivisa = findViewById(R.id.valorDivisa);
        Button btnCalcularDivisa = findViewById(R.id.btnCalcularDivisa);
        TextView resultadoDivisa = findViewById(R.id.resultadoDivisa);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        btnCalcularDivisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerDivisa.getSelectedItem().toString();
                double valor = Double.parseDouble(valorDivisa.getText().toString());
                if (paisSeleccionado.equals("Celsius->Fahrenheit")) {
                    Divisa divisa = new Divisa("Celsius", "Fahrenheit");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));
                }
                if (paisSeleccionado.equals("Fahrenheit->Celsius")) {
                    Divisa divisa = new Divisa("Fahrenheit", "Celsius");
                    resultadoDivisa.setText(String.valueOf(divisa.convertir(valor)));
                }
            }
        });
    }
}


