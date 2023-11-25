package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LongitudActivity extends AppCompatActivity {

    Spinner spinnerLongitud;
    EditText valorLongitud;
    Button btnCalcularLongitud;
    TextView resultadolongitud;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);
        Spinner spinnerLongitud = findViewById(R.id.spinnerLongitud);
        EditText valorLongitud = findViewById(R.id.valorLongitud);
        Button btnCalcularLongitud = findViewById(R.id.btnCalcularLongitud);
        TextView resultadoLongitud = findViewById(R.id.resultadoLongitud);
        btnregresar = findViewById(R.id.btnregresar2);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnCalcularLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paisSeleccionado = spinnerLongitud.getSelectedItem().toString();
                double valor = Double.parseDouble(valorLongitud.getText().toString());
                if (paisSeleccionado.equals("Metros->Pies")) {
                    Longitud longitud = new Longitud("Metros", "Pies");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
                if (paisSeleccionado.equals("Pies->Metros")) {
                    Longitud longitud = new Longitud("Pies", "Metros");
                    resultadoLongitud.setText(String.valueOf(longitud.convertir(valor)));
                }
            }
        });
    }
}