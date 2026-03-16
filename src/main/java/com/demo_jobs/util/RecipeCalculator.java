package com.demo_jobs.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeCalculator {
    public static List<String> calcularIngredientes(int noPersonas, List<String> ingredientes) {

        List<String> resultado = new ArrayList<>();

        for(String ing : ingredientes){

            String[] partes = ing.split(" ", 2);

            String cantidadStr = partes[0];
            String descripcion = partes.length > 1 ? partes[1] : "";

            double cantidad = parseCantidad(cantidadStr);

            double nuevaCantidad = cantidad * noPersonas;

            String nuevaCantidadStr = formatCantidad(nuevaCantidad);

            resultado.add(nuevaCantidadStr + " " + descripcion);
        }

        return resultado;
    }

    private static double parseCantidad(String s){

        if(s.contains("/")){
            String[] fr = s.split("/");
            return Double.parseDouble(fr[0]) / Double.parseDouble(fr[1]);
        }

        return Double.parseDouble(s);
    }

    private static String formatCantidad(double n){

        if(n == (int)n){
            return String.valueOf((int)n);
        }

        return String.valueOf(n);
    }

    public static void main(String[] args){

        int noPersonas = 3;

        List<String> ingredientes = Arrays.asList(
                "2 Huevos por persona",
                "1/2 taza de azucar",
                "1 taza de harina"
        );

        List<String> resultado = calcularIngredientes(noPersonas, ingredientes);


        System.out.println(resultado);
    }
}
