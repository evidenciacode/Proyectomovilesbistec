package com.example.testpi;

public class Peso extends Conversor {
    public Peso(String unidadOrigen, String unidadDestino) {
        super(unidadOrigen, unidadDestino);
    }

    @Override
    public double convertir(double cantidad) {
        if(unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Libras")){
            double resultado = cantidad * 2.20462;
            return resultado;
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Kilogramos")){
            double resultado = cantidad * 0.453592;
            return resultado;
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Libras")){
            double resultado = cantidad * 0.00220462;
            return resultado;
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Gramos")){
            double resultado = cantidad * 453.592;
            return resultado;
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Gramos")){
            double resultado = cantidad * 1000;
            return resultado;
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Kilogramos")){
            double resultado = cantidad * 0.001;
            return resultado;
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Kilogramos")){
            double resultado = cantidad * 1000;
            return resultado;
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Toneladas")){
            double resultado = cantidad * 0.001;
            return resultado;
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Onzas")){
            double resultado = cantidad * 16;
            return resultado;
        }else if (unidadOrigen.equals("Onzas") && unidadDestino.equals("Libras")){
            double resultado = cantidad * 0.0625;
            return resultado;
        }else if (unidadOrigen.equals("Gramos ") && unidadDestino.equals("Onzas")){
            double resultado = cantidad * 0.035274;
            return resultado;
        }else if (unidadOrigen.equals("Onzas") && unidadDestino.equals("Gramos")){
            double resultado = cantidad * 28.3495;
            return resultado;
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Libras")){
            double resultado = cantidad * 2204.62;
            return resultado;
        }else if (unidadOrigen.equals("Libras") && unidadDestino.equals("Toneladas")){
            double resultado = cantidad * 0.000453592;
            return resultado;
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Gramos")){
            double resultado = cantidad * 1000000;
            return resultado;
        }else if (unidadOrigen.equals("Gramos") && unidadDestino.equals("Toneladas")){
            double resultado = cantidad * 0.000001;
            return resultado;
        }else if (unidadOrigen.equals("Toneladas") && unidadDestino.equals("Miligramos")){
            double resultado = cantidad * 1000000000;
            return resultado;
        }else if (unidadOrigen.equals("Miligramos") && unidadDestino.equals("Toneladas")){
            double resultado = cantidad * 0.000000001;
            return resultado;
        }else if (unidadOrigen.equals("Kilogramos") && unidadDestino.equals("Miligramos")){
            double resultado = cantidad * 1000000;
            return resultado;
        }else if (unidadOrigen.equals("Miligramos") && unidadDestino.equals("Kilogramos")){
            double resultado = cantidad * 0.000001;
            return resultado;
        }else{
            throw new IllegalArgumentException("Pesos no compatibles");
        }
    }
}
