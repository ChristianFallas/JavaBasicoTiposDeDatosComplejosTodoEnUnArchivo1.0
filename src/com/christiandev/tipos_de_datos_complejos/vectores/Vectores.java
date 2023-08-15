package com.christiandev.tipos_de_datos_complejos.vectores;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {
        
        //Creación de un vector.
        Vector<Integer> vector1 = new Vector<>(100, 50); // Esto viene de java.util
        //De esta manera añado elementos al vector.
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);

        //Mostrar datos del vector.
        System.out.println("Datos del vector: " + vector1);

        //De esta manera elimino un elemento por su indice dentro del vector.
        //vector1.remove(1);

        System.out.println("Datos del vector: " + vector1);

        //Para conocer el tamaño y la capacidad de un vector.
        System.out.println("Tamaño del vector: " + vector1.size() + " Capacidad del vector: " + vector1.capacity());
        //Para decrecer el tamaño de vector asta el tamaño de elementos con los que cuenta.
        vector1.trimToSize();
        System.out.println("Tamaño del vector: " + vector1.size() + " Capacidad del vector: " + vector1.capacity());

        //Comparar dos vectores.
        boolean resultadoComparacion = vector1.equals(vector2);
        System.out.println("Son iguales mis dos vectores? " + resultadoComparacion);

    // Recorrer vectores
        
    //Forma corta.
    for (int i : vector1) {
        System.out.println("La posición es Contenido corto: " + i);
    }

    for (int i = 0; i <= vector2.size() ; i++) {
        System.out.println("La posicion es Contenido: " + vector2.get(i));
    }
    
    }
    
}
