package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Divisa extends Conversor{

    public Divisa(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Dolar") && unidadDestino.equals("Euro")){
            double resultado = cantidad * 0.98;
            return resultado;
        } else if (unidadOrigen.equals("Euro") && unidadDestino.equals("Dolar")) {
            double resultado = cantidad * 1.06;
            return resultado;
        } else if (unidadOrigen.equals("Dólar") && unidadDestino.equals("Peso colombiano")) {
            double resultado = cantidad * 4073.34;
            return resultado;
        } else if (unidadOrigen.equals("Peso colombiano") && unidadDestino.equals("Dólar")) {
            double resultado = cantidad * 0.00025;
            return resultado;
        } else if (unidadOrigen.equals("Euro") && unidadDestino.equals("Peso colombiano")) {
            double resultado = cantidad * 4312.24;
            return resultado;
        } else if (unidadOrigen.equals("Peso colombiano") && unidadDestino.equals("Euro")) {
            double resultado = cantidad * 0.00023;
            return resultado;
        }else {
            throw new IllegalArgumentException("Divisas no compatibles");
        }
    }
}