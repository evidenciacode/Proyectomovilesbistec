package com.example.testpi;

import com.example.testpi.Conversor;

public class Temperatura extends Conversor {

    public Temperatura(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Fahrenheit")) {
            // Celsius a Fahrenheit
            return (cantidad * 9 / 5) + 32;
        } else if (unidadOrigen.equals("Fahrenheit") && unidadDestino.equals("Celsius")) {
            // Fahrenheit a Celsius
            return (cantidad - 32) * 5 / 9;
        } else if (unidadOrigen.equals("Celsius") && unidadDestino.equals("Kelvin")) {
            // Celsius a Kelvin
            return cantidad + 273.15;
        } else if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Celsius")) {
            // Kelvin a Celsius
            return cantidad - 273.15;
        } else if (unidadOrigen.equals("Fahrenheit") && unidadDestino.equals("Kelvin")) {
            // Fahrenheit a Kelvin
            double celsius = (cantidad - 32) * 5 / 9;
            return celsius + 273.15;
        } else if (unidadOrigen.equals("Kelvin") && unidadDestino.equals("Fahrenheit")) {
            // Kelvin a Fahrenheit
            double celsius = cantidad - 273.15;
            return (celsius * 9 / 5) + 32;
        } else {
            throw new IllegalArgumentException("Unidades de temperatura no compatibles");
        }
    }
}
