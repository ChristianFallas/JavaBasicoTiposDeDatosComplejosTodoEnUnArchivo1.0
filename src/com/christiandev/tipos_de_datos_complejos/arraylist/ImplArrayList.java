package com.christiandev.tipos_de_datos_complejos.arraylist;

import java.util.ArrayList;

public class ImplArrayList {
    public static void main(String[] args) {
       
    //ArrayList.

        //Declaración de ArrayList.
        ArrayList<String> lista = new ArrayList<>();
        //Añadiendo elementos al ArrayList.
        lista.add("Christian.");
        lista.add("Jason");
        lista.add("Daniel");
        lista.add("Luis");

        //Eliminar un elemento de un ArrayList.
        lista.remove("Luis");

        System.out.println("Contenido del ArrayList: " + lista);

    //Nota:ArrayList y Vector ambas derivan de AbstracList.

        //Recorrer un ArrayList.
        
            //Forma corta.
        for (String nombre : lista) {
            System.out.println("Nombre: " + nombre);
        }

            //Forma larga.
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Numero: " + i + " Nombre: " + lista.get(i));
        }

        //Convertir un ArrayList en un Array.

            //Primero creamos el Array donde vamos a almacenar los elementos de nuestro ArrayLits.
        String[] array = new String[lista.size()];
            //Luego creamos un bucle for que añada cada uno de los elementos.
        for (int i=0; i<lista.size(); i++) {
            array[i] = lista.get(i);
        }
       
        //Iteración sobre el Array para mostrar sus elementos.
        for(String elemento : array) {
            System.out.println("Elemento del Array: " + elemento);
        }
    }
}
