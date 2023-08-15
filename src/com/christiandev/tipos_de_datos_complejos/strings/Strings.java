package com.christiandev.tipos_de_datos_complejos.strings;

public class Strings {
    
    public static void main(String[] args) {
        
        // Asignación de una cadena o string.
        String cadena = "Esto es una cadena de caracteres.";

        // Si lo que deseo es conocer la longitud de mi cadena.
        System.out.println("La longitud de mi cadena es: " + cadena.length());

        // Convertir una cadena a minúsculas.
        System.out.println("Cadena convertida en minúscula: " + cadena.toLowerCase());

        // Convertir una cadena a mayúsculas.
        System.out.println("Cadena convertida a mayúscula: " + cadena.toUpperCase());

        // Para conocer si una cadena empieza por una letra o palabra.
        if (cadena.startsWith("Esto")) {
            System.out.println("Correcto la cadena empieza con la palabra {Esto} ");
        } else {
            System.out.println("No coincide! ");
        }

        // Para conocer si una cadena termina por una letra o palabra.
        if (cadena.endsWith("caracteres.")) {
            System.out.println("Correcto si termina por la palabra indicada.");
        } else {
            System.out.println("No la terminación no coincide!");
        }

        // Para conocer la letra o carácter que se encuentra en una posición en especifico.
        System.out.println("La letra que se encuentra en la posición 4 es: "  + cadena.charAt(3));

        // Para recorrer una string.
        for (int i=0; i<cadena.length();  i++) {
            System.out.println("En la posición " + i + " esta la letra " + cadena.charAt(i));
        }
    }
}
