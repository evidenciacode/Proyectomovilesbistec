package com.example.testpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Longitud extends Conversor {

    public Longitud(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if (unidadOrigen.equals("Metros") && unidadDestino.equals("Pies")) {
            // metros a pies
            return (cantidad * 3.28084) ;
        } else if (unidadOrigen.equals("Pies") && unidadDestino.equals("Metros")) {
            // Pies a metros
            return (cantidad * 0.3048) ;
        } else if (unidadOrigen.equals("Kilometros") && unidadDestino.equals("Millas")) {
            // Kilometros a millas
            return (cantidad * 0.621371) ;
        } else if (unidadOrigen.equals("Millas") && unidadDestino.equals("Kilometros")) {
            // Millas a Kilometros
            return (cantidad  * 1.60934) ;
        } else if (unidadOrigen.equals("Centimetros") && unidadDestino.equals("Pulgadas")) {
            // Centímetros a Pulgadas.
            return (cantidad * 0.39) ;
        } else if (unidadOrigen.equals("Pulgas") && unidadDestino.equals("Centimetros")) {
            // Pulgadas a centimetros.
            return (cantidad * 2.54) ;

        } else if (unidadOrigen.equals("Yardas") && unidadDestino.equals("Metros")) {
            // Yardas a Metros
            return (cantidad * 0.9144) ;
        } else if (unidadOrigen.equals("Metros") && unidadDestino.equals("Yardas")) {
            // Metros a Yardas
            return (cantidad * 0.9144) ;

        } else if (unidadOrigen.equals("Millas Nauticas") && unidadDestino.equals("Kilogramos")) {
            // Millas Nauticas a kilogramos
            return (cantidad * 1.852) ;

        } else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Millas Nauticas")) {
            // Kilogramos a Millas Nauticas
            return (cantidad * 0.539957) ;
        } else if (unidadOrigen.equals("Micrometros") && unidadDestino.equals("Milimetros")) {
            // Micrometros a Milimetros
            return (cantidad * 0.001) ;
        } else if (unidadOrigen.equals("Milimetros") && unidadDestino.equals("Micrometros")) {
            // Milimetros a Micrometros
            return (cantidad * 1000) ;
        } else if (unidadOrigen.equals("Decimetros") && unidadDestino.equals("Metros")) {
            // Decimetros a metros
            return (cantidad * 0.1) ;
        } else if (unidadOrigen.equals("Decimetros") && unidadDestino.equals("Metros")) {
            // Decimetros a metros
            return (cantidad * 0.1) ;
        } else if (unidadOrigen.equals("Metros") && unidadDestino.equals("Decimetros")) {
            // Metros a Decímetros.
            return (cantidad * 0.1) ;
        } else {
            throw new IllegalArgumentException("Unidades de Longitud no compatibles");


        }
    } }